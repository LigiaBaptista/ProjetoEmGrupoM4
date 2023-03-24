package com.rd.backend.service;
import com.rd.backend.model.BibliotecaDeMidias;
import com.rd.backend.repository.BibliotecaDeMidiasRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor
public class BibliotecaDeMidiasService {

    @NonNull
    private BibliotecaDeMidiasRepository bibliotecaDeMidiasRepository;

    public List<BibliotecaDeMidias> listar() {
        return bibliotecaDeMidiasRepository.findAll();
    }

    public BibliotecaDeMidias buscarPorId(Long id) {
        return bibliotecaDeMidiasRepository.findById(id)
                .orElse(null);
    }

    public BibliotecaDeMidias criar(BibliotecaDeMidias bibliotecaDeMidias) {
        return bibliotecaDeMidiasRepository.save(bibliotecaDeMidias);
    }

    public BibliotecaDeMidias atualizar(Long id, BibliotecaDeMidias bibliotecaDeMidias) {
        BibliotecaDeMidias bibliotecaDeMidiasExistente = buscarPorId(id);
        bibliotecaDeMidiasExistente.setMidias(bibliotecaDeMidias.getMidias());
        bibliotecaDeMidiasExistente.setUsuarioId(bibliotecaDeMidias.getUsuarioId());
        bibliotecaDeMidiasExistente.setPlaylists(bibliotecaDeMidias.getPlaylists());
        return bibliotecaDeMidiasRepository.save(bibliotecaDeMidiasExistente);
    }

    public void excluir(Long id) {
        bibliotecaDeMidiasRepository.deleteById(id);
    }
}
