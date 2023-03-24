package com.rd.backend.service;

import com.rd.backend.model.Filme;
import com.rd.backend.repository.FilmeRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class FilmeService {

    @NonNull
    private FilmeRepository filmeRepository;

    public List<Filme> listar() {
        return filmeRepository.findAll();
    }

    public Filme buscarPorId(Long id) {
        return filmeRepository.findById(id)
                .orElse(null);
    }

    public Filme criar(Filme filme) {
        return filmeRepository.save(filme);
    }

    public Filme atualizar(Long id, Filme filme) {
        Filme filmeExistente = buscarPorId(id);
        filmeExistente.setTitulo(filme.getTitulo());
        filmeExistente.setAno(filme.getAno());
        filmeExistente.setGenero(filme.getGenero());
        filmeExistente.setDuracao(filme.getDuracao());
        filmeExistente.setTipo(filme.getTipo());
        filmeExistente.setElenco(filme.getElenco());
        filmeExistente.setDiretor(filme.getDiretor());
        filmeExistente.setPoster_url(filme.getPoster_url());
        return filmeRepository.save(filmeExistente);
    }

    public void excluir(Long id) {
        filmeRepository.deleteById(id);
    }
}

