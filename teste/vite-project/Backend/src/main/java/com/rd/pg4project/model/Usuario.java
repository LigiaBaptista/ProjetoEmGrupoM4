package com.rd.pg4project.model;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;

    @OneToMany(mappedBy = "usuarioId")
    private List<BibliotecaDeMidias> bibliotecasDeMidias;

}
