package com.rd.backend.repository;


import com.rd.backend.model.BibliotecaDeMidias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BibliotecaDeMidiasRepository extends JpaRepository<BibliotecaDeMidias, Long> {

     Optional<BibliotecaDeMidias> findById(Long id);


}
