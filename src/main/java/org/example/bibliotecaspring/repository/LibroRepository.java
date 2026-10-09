package org.example.bibliotecaspring.repository;

import org.example.bibliotecaspring.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository  extends JpaRepository<Libro,Long> {
}
