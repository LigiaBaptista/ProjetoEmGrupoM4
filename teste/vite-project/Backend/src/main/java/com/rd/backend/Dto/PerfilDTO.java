package com.rd.backend.Dto;

import lombok.*;

@Builder @AllArgsConstructor
@Getter @Setter
public class PerfilDTO {
    private String nome;
    private String email;

}
