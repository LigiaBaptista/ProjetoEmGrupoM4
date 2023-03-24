package com.rd.backend.Dto;

import lombok.*;

@Builder @AllArgsConstructor
@Getter @Setter
public class MusicaDTO {
    private String titulo;
    private Integer ano;
    private String genero;
    private String poster_url;
    private String artista;
    private Integer duracao;
    private Integer notas;



}
