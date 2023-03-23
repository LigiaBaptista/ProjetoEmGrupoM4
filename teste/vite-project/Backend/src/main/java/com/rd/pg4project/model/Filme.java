package com.rd.pg4project.model;
import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Filme extends Midia {

    private Integer duracao;
    private String tipo;

    @ElementCollection
    @CollectionTable(name = "filme_elenco", joinColumns = @JoinColumn(name = "filme_id"))
    @Column(name = "ator")
    private List<String> elenco;

    private String diretor;
    private String produtor;

}

