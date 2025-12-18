package com.example.libreria.Servicio;

import java.util.List;
import java.util.Optional;

import com.example.libreria.Model.Libros;

public interface InterfazServicioLibro {

    List<Libros> ObtenerTodos();
    Optional <Libros> obtenerPorId(long id);
    Libros guardar(Libros libro);
    void eliminarPorId(long id);
    String buscalibroPorTitulo(String titulo);
}
