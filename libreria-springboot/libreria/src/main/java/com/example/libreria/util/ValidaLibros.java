package com.example.libreria.util;

import com.example.libreria.Model.Libros;
import org.springframework.stereotype.Component;

@Component
public class ValidaLibros {

    public Libros libro;

    public boolean tituloValido(){
        return libro.getTitulo() != null && !libro.getTitulo().isEmpty();
    }




}
