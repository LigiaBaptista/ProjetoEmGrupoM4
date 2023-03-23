package com.rd.pg4project.repository;

import com.rd.pg4project.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    //Buscar artista por nome
    Artista findByNome(String nome);




}
