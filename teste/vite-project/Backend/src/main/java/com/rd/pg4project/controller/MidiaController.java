package com.rd.pg4project.controller;

import com.rd.pg4project.model.Midia;
import com.rd.pg4project.service.MidiaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("/api/midias")
public class MidiaController {

 @NonNull
    private MidiaService midiaService;

    @GetMapping
    public List<Midia> listar() {
        return midiaService.listar();
    }

    @GetMapping("/{id}")
    public Midia buscarPorId(@PathVariable Long id) {
        return midiaService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Midia criar(@RequestBody Midia midia) {    return midiaService.criar(midia);
    }

    @PutMapping("/{id}")
    public Midia atualizar(@PathVariable Long id, @RequestBody Midia midia) {
        return midiaService.atualizar(id, midia);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        midiaService.excluir(id);
    }
}
