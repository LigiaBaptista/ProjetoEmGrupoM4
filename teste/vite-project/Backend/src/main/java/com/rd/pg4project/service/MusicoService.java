package com.rd.pg4project.service;
import com.rd.pg4project.model.Musico;
import com.rd.pg4project.repository.MusicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicoService {


    private MusicoRepository musicoRepository;

    public MusicoService(MusicoRepository musicoRepository) {
        this.musicoRepository = musicoRepository;
    }

    public List<Musico> listar() {
        return musicoRepository.findAll();
    }

    public Musico buscarPorId(Long id) {
        return musicoRepository.findById(id)
                .orElse(null);
    }

    public Musico criar(Musico musico) {
        return musicoRepository.save(musico);
    }

    public Musico atualizar(Long id, Musico musico) {
        Musico musicoExistente = buscarPorId(id);
        musicoExistente.setNome(musico.getNome());
        musicoExistente.setDataNascimento(musico.getDataNascimento());
        musicoExistente.setPremiacoes(musico.getPremiacoes());
        musicoExistente.setGenero(musico.getGenero());
        musicoExistente.setAtuacao(musico.getAtuacao());
        return musicoRepository.save(musicoExistente);
    }

    public void excluir(Long id) {
        musicoRepository.deleteById(id);
    }
}
