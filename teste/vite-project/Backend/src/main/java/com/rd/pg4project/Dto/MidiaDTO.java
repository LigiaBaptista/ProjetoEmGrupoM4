package com.rd.pg4project.Dto;

import lombok.Data;

@Data
public class MidiaDTO {
    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;

    public MidiaDTO() {}

    public MidiaDTO(String titulo, Integer ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    // Getters e Setters omitidos para brevidade
}
