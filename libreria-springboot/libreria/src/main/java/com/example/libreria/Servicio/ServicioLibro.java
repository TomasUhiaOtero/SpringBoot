package com.example.libreria.Servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.libreria.Model.Libros;
import com.example.libreria.RepoLibros.Repolibros;

@Service
public class ServicioLibro {

   private final Repolibros repoLibros;

   public ServicioLibro(Repolibros repoLibros) {
    this.repoLibros = repoLibros;
   }

   public List<Libros> obtenerTodos() {
    return repoLibros.findAll();
   }

   public Libros buscarPorId(long id) {
    return repoLibros.BuscaId(id)
    .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
   }

   public Libros buscarPorTitulo(String titulo) {
    return repoLibros.BuscaTitulo(titulo)
            .orElseThrow(() -> new RuntimeException("Libro no encontrado"));
}

}
