package com.rd.pg4project.controller;

import com.rd.pg4project.model.Musico;
import com.rd.pg4project.service.MusicoService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor

@RequestMapping("/api/musicos")
public class MusicoController {

 @NonNull
    private MusicoService musicoService;

    @GetMapping
    public List<Musico> listar() {
        return musicoService.listar();
    }

    @GetMapping("/{id}")
    public Musico buscarPorId(@PathVariable Long id) {
        return musicoService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Musico criar(@RequestBody Musico musico) {
        return musicoService.criar(musico);
    }

    @PutMapping("/{id}")
    public Musico atualizar(@PathVariable Long id, @RequestBody Musico musico) {
        return musicoService.atualizar(id, musico);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        musicoService.excluir(id);
    }
}
