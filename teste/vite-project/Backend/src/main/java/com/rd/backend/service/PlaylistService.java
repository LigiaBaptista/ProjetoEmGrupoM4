package com.rd.backend.service;
import com.rd.backend.model.Playlist;
import com.rd.backend.repository.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {

    private PlaylistRepository playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    public List<Playlist> listar() {
        return playlistRepository.findAll();
    }

    public Playlist buscarPorId(Long id) {
        return playlistRepository.findById(id)
                .orElse(null);
    }

    public Playlist criar(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public Playlist atualizar(Long id, Playlist playlist) {
        Playlist playlistExistente = buscarPorId(id);
        playlistExistente.setMidias(playlist.getMidias());
        //playlistExistente.setOrdemExecucao(playlist.getOrdemExecucao()); //TODO: implementar
        playlistExistente.setMidiaAtual(playlist.getMidiaAtual());
        return playlistRepository.save(playlistExistente);
    }

    public void excluir(Long id) {
        playlistRepository.deleteById(id);
    }
}


