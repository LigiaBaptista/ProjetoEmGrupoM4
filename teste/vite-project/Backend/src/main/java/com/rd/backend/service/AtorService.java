package com.rd.backend.service;
import com.rd.backend.model.Ator;
import com.rd.backend.repository.AtorRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor
public class AtorService {

    @NonNull
    private AtorRepository atorRepository;

    public List<Ator> listar() {
        return atorRepository.findAll();
    }

    public Ator buscarPorId(Long id) {
        return atorRepository.findById(id)
                .orElse(null);
    }

    public Ator criar(Ator ator) {
        return atorRepository.save(ator);
    }

    public Ator atualizar(Long id, Ator ator) {
        Ator atorExistente = buscarPorId(id);
        atorExistente.setNome(ator.getNome());
        atorExistente.setDataNascimento(ator.getDataNascimento());
        atorExistente.setPremiacoes(ator.getPremiacoes());
        atorExistente.setGenero(ator.getGenero());
        atorExistente.setFormacao(ator.getFormacao());
        return atorRepository.save(atorExistente);
    }

    public void excluir(Long id) {
        atorRepository.deleteById(id);
    }
}
