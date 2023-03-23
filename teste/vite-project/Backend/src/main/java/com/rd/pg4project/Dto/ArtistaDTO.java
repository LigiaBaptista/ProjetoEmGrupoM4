package com.rd.pg4project.Dto;

import com.rd.pg4project.model.Ator;
import lombok.Data;

import java.util.List;
@Data
public class ArtistaDTO {
    private Long id;
    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;

    public ArtistaDTO() {
    }

    public ArtistaDTO(String nome, String dataNascimento, String premiacoes, String genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;



    }

    // Getters e Setters omitidos para brevidade
}