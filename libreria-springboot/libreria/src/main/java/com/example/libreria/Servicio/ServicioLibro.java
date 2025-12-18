package com.example.libreria.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.libreria.Model.Libros;
import com.example.libreria.RepoLibros.Repolibros;

@Service
public class ServicioLibro implements InterfazServicioLibro {

        private final Repolibros repoLibros;

        public ServicioLibro(Repolibros repoLibros) {
                this.repoLibros = repoLibros;
        }

        @Override
        public List<Libros> ObtenerTodos() {
                return repoLibros.findAll();
        }

        @Override
        public Optional<Libros> obtenerPorId(long id) {
                return repoLibros.findById(id);
        }

        @Override
        public String buscalibroPorTitulo(String titulo) {
                boolean encontrado = repoLibros.findAll().stream()
                .anyMatch(libros -> libros.getTitulo() 
                != null && libros.getTitulo().equalsIgnoreCase(titulo));
                return encontrado ? "Libro encontrado" : "Libro no encontrado";

        }

        @Override
        public Libros guardar(Libros libro) {
                repoLibros.save(libro);
                return libro;
        }

        @Override
        public void eliminarPorId(long id) {
                repoLibros.deleteById(id);
        }


}
