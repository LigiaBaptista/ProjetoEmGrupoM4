package com.rd.backend.Dto;

import com.rd.backend.model.Midia;
import lombok.*;

import java.util.List;
@Builder
@AllArgsConstructor
@Getter
@Setter
public class PlaylistDTO {
    private Long id;
    private String nome;
    private List<Midia> midias;
    private Integer midiaAtual;
    private Boolean misturar;


    public PlaylistDTO(String nome, List<Midia> midias, Integer midiaAtual, Boolean misturar) {
        this.nome = nome;
        this.midias = midias;
        this.midiaAtual = midiaAtual;
        this.misturar = misturar;
    }



public void setOrdemDeExecucao( Integer midiaAtual) {
        if (midiaAtual == null) {
            this.midiaAtual = 0;
        } else {
            this.midiaAtual = midiaAtual;
        }
    }
}

