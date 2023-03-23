package com.rd.pg4project.controller;

import com.rd.pg4project.model.Filme;
import com.rd.pg4project.service.FilmeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/filmes")
public class FilmeController {

 @NonNull
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> listar() {
        return filmeService.listar();
    }

    @GetMapping("/{id}")
    public Filme buscarPorId(@PathVariable Long id) {
        return filmeService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Filme criar(@RequestBody Filme filme) {
        return filmeService.criar(filme);
    }

    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable Long id, @RequestBody Filme filme) {
        return filmeService.atualizar(id, filme);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        filmeService.excluir(id);
    }
}
