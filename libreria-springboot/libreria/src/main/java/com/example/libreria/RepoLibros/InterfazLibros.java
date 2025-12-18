package com.example.libreria.RepoLibros;

import java.util.List;
import java.util.Optional;

import com.example.libreria.Model.Libros;

public interface InterfazLibros {

    List<Libros> findAll();
    Optional <Libros> findById(long id);
    void save(Libros libro);
    void deleteById(long id);

}
