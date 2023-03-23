package com.rd.pg4project.repository;

import com.rd.pg4project.model.Musico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicoRepository extends JpaRepository<Musico, Long> {
}
