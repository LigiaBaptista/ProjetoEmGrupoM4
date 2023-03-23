package com.rd.pg4project.service;
import com.rd.pg4project.model.BibliotecaDeMidias;
import com.rd.pg4project.repository.BibliotecaDeMidiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BibliotecaDeMidiasService {

    @Autowired
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
