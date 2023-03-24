package com.rd.backend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Musica extends Midia {

    private Integer duracao;
    private String artista;
    private Integer notas;

}
