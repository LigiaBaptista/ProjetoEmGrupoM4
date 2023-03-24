package com.rd.backend.repository;

import com.rd.backend.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    Artista findByNome(String nome);

}
