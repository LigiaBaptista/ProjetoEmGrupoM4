package com.rd.pg4project.Dto;

import lombok.Data;

@Data
public class MusicaDTO extends MidiaDTO {
    private String artista;
    private Integer duracao;
    private Integer notas;

    public MusicaDTO() {}

    public MusicaDTO(String titulo, Integer ano, String genero, String artista, Integer duracao, Integer notas) {
        super(titulo, ano, genero);
        this.artista = artista;
        this.duracao = duracao;
        this.notas = notas;
    }

    // Getters e Setters omitidos para brevidade
}
