package com.rd.backend.repository;

import com.rd.backend.model.Midia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface MidiaRepository extends JpaRepository<Midia, Long> {

    Optional<Midia> findByTitulo(String titulo);

    Optional<Midia> findByTituloContaining(String titulo);


}
