package com.rd.pg4project.model;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "midia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private Integer ano;
    private String genero;
    private String poster_url;

}
