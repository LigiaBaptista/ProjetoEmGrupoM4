package com.rd.backend.service;
import com.rd.backend.model.Midia;
import com.rd.backend.repository.MidiaRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor
public class MidiaService {

    @NonNull
    private MidiaRepository midiaRepository;

    public List<Midia> listar() {
        return midiaRepository.findAll();
    }

    public Midia buscarPorId(Long id) {
        return midiaRepository.findById(id)
                .orElse(null);
    }

    public Midia criar(Midia midia) {
        return midiaRepository.save(midia);
    }

    public Midia atualizar(Long id, Midia midia) {
        Midia midiaExistente = buscarPorId(id);
        midiaExistente.setTitulo(midia.getTitulo());
        midiaExistente.setAno(midia.getAno());
        midiaExistente.setGenero(midia.getGenero());
        return midiaRepository.save(midiaExistente);
    }

    public void excluir(Long id) {
        midiaRepository.deleteById(id);
    }
}