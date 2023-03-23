package com.rd.pg4project.model;
import lombok.*;

import jakarta.persistence.*;

@Entity
@Table(name = "artista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;

    public enum Genero {
        Masculino,
        Feminino,
        Indefinido
    }





}
