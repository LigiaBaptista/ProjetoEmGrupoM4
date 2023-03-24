package com.rd.backend.repository;

import com.rd.backend.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long> {


    Optional<Musica> findByTitulo(String titulo);

    Optional<Musica> findByTituloContaining(String titulo);
}
