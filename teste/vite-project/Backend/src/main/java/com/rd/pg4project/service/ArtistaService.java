package com.rd.pg4project.service;

import com.rd.pg4project.Dto.ArtistaDTO;
import com.rd.pg4project.model.Artista;
import com.rd.pg4project.repository.ArtistaRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistaService {


    @NonNull
    private ArtistaRepository artistaRepository;

    public List<Artista> listar() {
        return artistaRepository.findAll();
    }

    public Artista buscarPorId(Long id) {
        return artistaRepository.findById(id)
                .orElse(null);
    }

    public Artista criar(Artista artista) {
        return artistaRepository.save(artista);
    }

    public Artista atualizar(Long id, Artista artista) {
        Artista artistaExistente = buscarPorId(id);
        artistaExistente.setNome(artista.getNome());
        artistaExistente.setDataNascimento(artista.getDataNascimento());
        artistaExistente.setPremiacoes(artista.getPremiacoes());
        artistaExistente.setGenero(artista.getGenero());
        return artistaRepository.save(artistaExistente);
    }

    public void excluir(Long id) {
        artistaRepository.deleteById(id);
    }
}
