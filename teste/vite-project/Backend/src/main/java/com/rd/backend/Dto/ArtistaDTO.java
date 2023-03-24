package com.rd.backend.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter @Setter
public class ArtistaDTO {
    private Long id;
    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;
    private String formacao;
    private String atuacao;

    public ArtistaDTO toArtista() {
        return ArtistaDTO.builder()
                .id(id)
                .nome(nome)
                .dataNascimento(dataNascimento)
                .premiacoes(premiacoes)
                .genero(genero)
                .formacao(formacao)
                .atuacao(atuacao)
                .build();
    }
}