package com.rd.pg4project.Dto;

import lombok.Data;

import java.util.List;
@Data
public class FilmeDTO extends MidiaDTO {
    private String tipo;
    private List<String> elenco;
    private String diretor;
    private String produtor;
    private Integer duracao;

    public FilmeDTO() {}

    public FilmeDTO(String titulo, Integer ano, String genero, String tipo, List<String> elenco, String diretor, String produtor, Integer duracao) {
        super(titulo, ano, genero);
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
        this.duracao = duracao;
    }

    // Getters e Setters omitidos para brevidade
}
