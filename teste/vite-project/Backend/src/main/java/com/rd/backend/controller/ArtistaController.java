package com.rd.backend.controller;
import com.rd.backend.Dto.ArtistaDTO;
import com.rd.backend.Dto.ErroDTO;
import com.rd.backend.exception.ExceptionApi;
import com.rd.backend.model.Artista;
import com.rd.backend.service.ArtistaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/artistas")
@RequiredArgsConstructor
public class ArtistaController {
    @NonNull
    private ArtistaService artistaService;


    @GetMapping
    public ResponseEntity<?> listarArtistas() {
        try {
            List<Artista> artistas = artistaService.buscarTodos();
            return new ResponseEntity<>(artistas, HttpStatus.OK);
        } catch (ExceptionApi e) {
            ErroDTO erroDTO = new ErroDTO(e.getErrorType(), e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroDTO);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarArtista(@PathVariable Long id) {
        try {
            Artista artista = artistaService.buscarPorId(id);
            return new ResponseEntity<>(artista, HttpStatus.OK);
        } catch (ExceptionApi e) {
            ErroDTO erroDTO = new ErroDTO(e.getErrorType(), e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroDTO);
        }
    }
    @PostMapping
    public ResponseEntity<?> criarArtista(@RequestBody ArtistaDTO artista) {
        try {
            Artista artistaCriado = artistaService.criar(artista);
            return new ResponseEntity<>(artistaCriado, HttpStatus.CREATED);
        } catch (ExceptionApi e) {
            ErroDTO erroDTO = new ErroDTO(e.getErrorType(), e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroDTO);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarArtista(@PathVariable Long id, @RequestBody Artista artistaAtualizado) {

        try {
            Artista artista = artistaService.atualizar(id, artistaAtualizado);
            return new ResponseEntity<>(artista, HttpStatus.OK);

        } catch (ExceptionApi e) {
            ErroDTO erroDTO = new ErroDTO(e.getErrorType(), e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroDTO);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarArtista(@PathVariable Long id) {
        try {
            artistaService.excluir(id);
            return ResponseEntity.status(HttpStatus.OK).body("Artista excluído com sucesso");
        } catch (ExceptionApi e) {
            ErroDTO erroDTO = new ErroDTO(e.getErrorType(), e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroDTO);
        }
    }
}
