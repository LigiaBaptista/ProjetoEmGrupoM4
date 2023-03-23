package com.rd.pg4project.Dto;

import lombok.Data;

import java.util.Collections;
import java.util.List;
@Data
public class PlaylistDTO {
    private Long id;
    private String nome;
    private List<MidiaDTO> midias;
    private Integer midiaAtual;
    private Boolean misturar;

    public PlaylistDTO() {}

    public PlaylistDTO(String nome, List<MidiaDTO> midias, Integer midiaAtual, Boolean misturar) {
        this.nome = nome;
        this.midias = midias;
        this.midiaAtual = midiaAtual;
        this.misturar = misturar;
    }


    // Getters e Setters omitidos para brevidade

public void setOrdemDeExecucao( Integer midiaAtual) {
        if (midiaAtual == null) {
            this.midiaAtual = 0;
        } else {
            this.midiaAtual = midiaAtual;
        }
    }
}

