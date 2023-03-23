package com.rd.pg4project.Dto;

import com.rd.pg4project.model.Ator;
import com.rd.pg4project.model.Musico;
import lombok.Data;

import java.util.List;
@Data
public class ArtistaDTO {
    private Long id;
    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;
    private Ator ator;
    private Musico musico;

    public ArtistaDTO() {
    }

    public ArtistaDTO(String nome, String dataNascimento, String premiacoes, String genero, Ator ator, Musico musico) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.premiacoes = premiacoes;
        this.genero = genero;
        this.ator = ator;
        this.musico = musico;



    }

    // Getters e Setters omitidos para brevidade
}