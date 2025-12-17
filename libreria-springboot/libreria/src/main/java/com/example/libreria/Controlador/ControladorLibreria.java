package com.example.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RepoLibros.Repolibros;
import com.example.libreria.Model.Libros;
import com.example.libreria.Servicio.ServicioLibro;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro sLibro;
    private final Repolibros repoLibro;

    public ControladorLibreria(ServicioLibro sLibro) {
        this.sLibro = sLibro;
        this.repoLibro = new Repolibros();
    }

    @GetMapping("/{titulo}")
    public String DameLibro(@PathVariable String titulo) {
        return sLibro.buscaLibro(titulo);
    }

    @GetMapping("/todos")
    public List<Libros> dimeTodos() {
        return repoLibro.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libros> BuscaId(@PathVariable long id) {
        return repoLibro.BuscaId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound()
        .build());
    }
    
    
    


}
