package com.rd.backend.Dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import lombok.*;

import java.util.List;
@Builder @AllArgsConstructor
@Getter @Setter
public class FilmeDTO {

    private String titulo;
    private Integer ano;
    private String genero;
    private String poster_url;
    private Integer duracao;
    private String tipo;
    private List<String> elenco;
    private String diretor;
    private String produtor;



}
