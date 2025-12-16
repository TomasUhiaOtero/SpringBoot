package com.example.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.Servicio.ServicioLibro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro sLibro;

    public ControladorLibreria(ServicioLibro sLibro) {
        this.sLibro = sLibro;
    }

    @GetMapping("/{titulo}")
    public String DameLibro(@PathVariable String titulo) {
        return sLibro.buscaLibro(titulo);
    }
    


}
