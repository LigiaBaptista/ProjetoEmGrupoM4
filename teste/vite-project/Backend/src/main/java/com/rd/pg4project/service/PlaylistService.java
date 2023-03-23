package com.rd.pg4project.service;
import com.rd.pg4project.Dto.FilmeDTO;
import com.rd.pg4project.Dto.MidiaDTO;
import com.rd.pg4project.Dto.MusicaDTO;
import com.rd.pg4project.Dto.PlaylistDTO;
import com.rd.pg4project.exception.ResourceNotFoundException;
import com.rd.pg4project.model.Filme;
import com.rd.pg4project.model.Midia;
import com.rd.pg4project.model.Musica;
import com.rd.pg4project.model.Playlist;
import com.rd.pg4project.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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


