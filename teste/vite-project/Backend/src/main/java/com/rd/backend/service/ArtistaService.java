package com.rd.backend.service;


import com.rd.backend.Dto.ArtistaDTO;
import com.rd.backend.exception.ExceptionApi;
import com.rd.backend.model.Artista;
import com.rd.backend.repository.ArtistaRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtistaService {


    @NonNull
    private ArtistaRepository artistaRepository;

    public List<Artista> buscarTodos() {
       try {
           if (artistaRepository.findAll().isEmpty()) {
               throw new ExceptionApi("Nenhum artista cadastrado", HttpStatus.NO_CONTENT);
           } else {
               return artistaRepository.findAll();
           }
       } catch (ExceptionApi e) {
           throw new ExceptionApi(e.getMessage(),e.getErrorType());
       }
    }

    public Artista buscarPorId(Long id) {
        return artistaRepository.findById(id)
                .orElseThrow(() -> new ExceptionApi( "ID " + id +" nao corresponde a nenhum artista",
                        HttpStatus.NOT_FOUND));
    }

    public Artista buscarPorNome(String nome) {
        if (artistaRepository.findByNome(nome) != null) {
            return artistaRepository.findByNome(nome);
        } else {
            return null;
        }
    }

    public Artista criar(ArtistaDTO artistaDTO){
         try {
             if (artistaDTO.getNome().isEmpty() || artistaDTO.getNome() == null) {
                 throw new ExceptionApi("Nome do artista nao pode ser vazio", HttpStatus.BAD_REQUEST);
                }
                if (buscarPorNome(artistaDTO.getNome()) != null) {
                 throw new ExceptionApi("Nome do artista nao pode ser vazio", HttpStatus.BAD_REQUEST);}

              Artista artista = new Artista();
              artista.setNome(artistaDTO.getNome());
              artista.setDataNascimento(artistaDTO.getDataNascimento());
              artista.setPremiacoes(artistaDTO.getPremiacoes());
              artista.setGenero(artistaDTO.getGenero());
              return artistaRepository.save(artista);
         } catch (ExceptionApi e) {
             throw new ExceptionApi(e.getMessage(),e.getErrorType());
         }
    }

    public Artista atualizar(Long id, Artista artista) {
       try {
           Artista artistaExistente = artistaRepository.findById(id)
                   .orElseThrow(() -> new ExceptionApi("ID " + id + " nao corresponde a nenhum artista", HttpStatus.NOT_FOUND));
           artistaExistente.setNome(artista.getNome());
           artistaExistente.setDataNascimento(artista.getDataNascimento());
           artistaExistente.setPremiacoes(artista.getPremiacoes());
           artistaExistente.setGenero(artista.getGenero());
           return artistaRepository.save(artistaExistente);
       } catch (ExceptionApi e) {
           throw new ExceptionApi(e.getMessage(),e.getErrorType());
       }
    }

    public void excluir(Long id) {
       try {
           Artista artistaExistente = artistaRepository.findById(id)
                   .orElseThrow(() -> new ExceptionApi("ID " + id + " nao corresponde a nenhum artista", HttpStatus.NOT_FOUND));
           artistaRepository.delete(artistaExistente);
       } catch (ExceptionApi e) {
           throw new ExceptionApi(e.getMessage(),e.getErrorType());
       }
    }

}
