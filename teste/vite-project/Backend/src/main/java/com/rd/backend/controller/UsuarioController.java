package com.rd.backend.controller;

import com.rd.backend.Dto.ErroDTO;
import com.rd.backend.Dto.LoginDTO;
import com.rd.backend.Dto.PerfilDTO;
import com.rd.backend.exception.ExceptionApi;
import com.rd.backend.model.Usuario;
import com.rd.backend.service.UsuarioService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usuarios")
public class UsuarioController {

 @NonNull
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<?> listar() {
        try {
            List<Usuario> perfis = usuarioService.listar();
            List<PerfilDTO> perfisDTO = perfis.stream()
                    .map(perfil -> new PerfilDTO(perfil.getNome(), perfil.getEmail()))
                    .collect(Collectors.toList());
            return ResponseEntity.ok(perfisDTO);
        }  catch (ExceptionApi e) {
            ErroDTO erroDTO = new ErroDTO(e.getErrorType(), e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroDTO);
        }
    }


    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario criar(@RequestBody Usuario usuario) {
        return usuarioService.criar(usuario);
    }
    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.atualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        usuarioService.excluir(id);
    }

    @PostMapping("/login")
    public ResponseEntity<PerfilDTO> login(@RequestBody LoginDTO loginDTO) {
        var usuarioExistente = usuarioService.login(loginDTO);
        if (usuarioExistente != null) {
            return ResponseEntity.ok(usuarioExistente);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}