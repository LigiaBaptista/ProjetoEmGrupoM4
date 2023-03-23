package com.rd.pg4project.model;
import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "biblioteca_midias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class BibliotecaDeMidias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long usuarioId;

    @ManyToMany
    @JoinTable(
            name = "biblioteca_midia",
            joinColumns = @JoinColumn(name = "biblioteca_midias_id"),
            inverseJoinColumns = @JoinColumn(name = "midia_id")
    )
    private List<Midia> midias;

    @OneToMany(mappedBy = "bibliotecaMidias", cascade = CascadeType.ALL)
    private List<Playlist> playlists;

    public void tocarPlaylist(Long playlistId) {
        // implementação para tocar a playlist
    }
}
