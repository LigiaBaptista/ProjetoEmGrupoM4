package com.rd.pg4project.controller;
import com.rd.pg4project.Dto.ArtistaDTO;
import com.rd.pg4project.model.Artista;
import com.rd.pg4project.service.ArtistaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/artistas")
@RequiredArgsConstructor
public class ArtistaController {
    @NonNull
    private ArtistaService artistaService;

    @PostMapping
    public ResponseEntity<Artista> criarArtista(@RequestBody Artista artista) {
       try {
           artista = artistaService.criar(artista);
           return new ResponseEntity<>(artista, HttpStatus.CREATED);
       } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }
    }
    @GetMapping
    public ResponseEntity<List<Artista>> listarArtistas() {
        List<Artista> artistas = artistaService.listar();
        return new ResponseEntity<>(artistas, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Artista> buscarArtista(@PathVariable Long id) {
       try {
           Artista artista = artistaService.buscarPorId(id);
           return new ResponseEntity<>(artista, HttpStatus.OK);
       } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
    @PutMapping("/{id}")
    public ResponseEntity<Artista> atualizarArtista(@PathVariable Long id, @RequestBody Artista artistaAtualizado) {
        Artista artistaExistente = artistaService.buscarPorId(id);
        artistaExistente.setNome(artistaAtualizado.getNome());
        artistaExistente.setDataNascimento(artistaAtualizado.getDataNascimento());
        artistaExistente.setPremiacoes(artistaAtualizado.getPremiacoes());
        artistaExistente.setGenero(artistaAtualizado.getGenero());
        artistaAtualizado = artistaService.atualizar(id, artistaExistente);
        return new ResponseEntity<>(artistaAtualizado, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarArtista(@PathVariable Long id) {
      try {
          artistaService.excluir(id);
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
}
