package com.esra.repository;


import com.esra.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre,Long> {

    Optional<Genre> findOptionalByName(String name);

}
