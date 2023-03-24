package com.rd.backend.model;
import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "playlist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "playlist_midia",
            joinColumns = @JoinColumn(name = "playlist_id"),
            inverseJoinColumns = @JoinColumn(name = "midia_id")
    )
    private List<Midia> midias; //TODO: Verificar implementação

    private Integer midiaAtual;
    private Boolean misturarMidias;

    public Midia proximaMidia() {
        //TODO implementação para retornar a próxima mídia da playlist
        return null;
    }

    public Midia midiaAnterior() {
        //TODO implementação para retornar a mídia anterior da playlist
        return null;
    }

    public void misturarMidias() {

    }

    public void getOrdemExecucao() {
        //TODO implementação para retornar a ordem de execução das mídias da playlist
    }

    public void setOrdemExecucao( ) {
     //TODO implementação para definir a ordem de execução das mídias da playlist
    }

    @ManyToOne
    @JoinColumn(name = "biblioteca_midias_id")
    private BibliotecaDeMidias bibliotecaMidias;
}


