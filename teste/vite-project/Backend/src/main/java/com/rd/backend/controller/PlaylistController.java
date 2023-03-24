package com.rd.backend.controller;

import com.rd.backend.model.Playlist;
import com.rd.backend.service.PlaylistService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/playlists")
public class PlaylistController {

    @NonNull
    private PlaylistService playlistService;

    @GetMapping
    public List<Playlist> listar() {
        return playlistService.listar();
    }

    @GetMapping("/{id}")
    public Playlist buscarPorId(@PathVariable Long id) {
        return playlistService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Playlist criar(@RequestBody Playlist playlist) {
        return playlistService.criar(playlist);
    }

    @PutMapping("/{id}")
    public Playlist atualizar(@PathVariable Long id, @RequestBody Playlist playlist) {
        return playlistService.atualizar(id, playlist);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        playlistService.excluir(id);
    }
}
