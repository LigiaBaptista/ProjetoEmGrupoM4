package com.rd.pg4project.Dto;

import lombok.Data;

import java.util.List;
@Data
public class BibliotecaDeMidiasDTO {
    private Long id;
    private Long usuarioId;
    private List<MidiaDTO> midias;

    public BibliotecaDeMidiasDTO() {}

    public BibliotecaDeMidiasDTO(Long usuarioId, List<MidiaDTO> midias) {
        this.usuarioId = usuarioId;
        this.midias = midias;
    }


    // Getters e Setters omitidos para brevidade
}
