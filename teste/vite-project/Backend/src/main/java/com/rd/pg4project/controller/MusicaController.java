package com.rd.pg4project.controller;

import com.rd.pg4project.model.Musica;
import com.rd.pg4project.service.MusicaService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor

@RequestMapping("/api/musicas")
public class MusicaController {

 @NonNull
    private MusicaService musicaService;

    @GetMapping
    public List<Musica> listar() {
        return musicaService.listar();
    }

    @GetMapping("/{id}")
    public Musica buscarPorId(@PathVariable Long id) {
        return musicaService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Musica criar(@RequestBody Musica musica) {
        return musicaService.criar(musica);
    }

    @PutMapping("/{id}")
    public Musica atualizar(@PathVariable Long id, @RequestBody Musica musica) {
        return musicaService.atualizar(id, musica);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        musicaService.excluir(id);
    }
}