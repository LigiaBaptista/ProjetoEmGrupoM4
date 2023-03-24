package com.rd.backend.controller;

import com.rd.backend.model.BibliotecaDeMidias;
import com.rd.backend.service.BibliotecaDeMidiasService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor

@RequestMapping("/api/bibliotecas")
public class BibliotecaDeMidiasController {

    @NonNull
    private BibliotecaDeMidiasService bibliotecaDeMidiasService;

    @GetMapping
    public List<BibliotecaDeMidias> listar() {
        return bibliotecaDeMidiasService.listar();
    }

    @GetMapping("/{id}")
    public BibliotecaDeMidias buscarPorId(@PathVariable Long id) {
        return bibliotecaDeMidiasService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BibliotecaDeMidias criar(@RequestBody BibliotecaDeMidias biblioteca) {
        return bibliotecaDeMidiasService.criar(biblioteca);
    }

    @PutMapping("/{id}")
    public BibliotecaDeMidias atualizar(@PathVariable Long id, @RequestBody BibliotecaDeMidias biblioteca) {
        return bibliotecaDeMidiasService.atualizar(id, biblioteca);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        bibliotecaDeMidiasService.excluir(id);
    }
}
