package com.rd.backend.controller;

import com.rd.backend.model.Ator;
import com.rd.backend.service.AtorService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/atores")
public class AtorController {

    @NonNull
    private AtorService atorService;

    @GetMapping
    public List<Ator> listar() {
        return atorService.listar();
    }

    @GetMapping("/{id}")
    public Ator buscarPorId(@PathVariable Long id) {
        return atorService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ator criar(@RequestBody Ator ator) {
        return atorService.criar(ator);
    }

    @PutMapping("/{id}")
    public Ator atualizar(@PathVariable Long id, @RequestBody Ator ator) {
        return atorService.atualizar(id, ator);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        atorService.excluir(id);
    }
}
