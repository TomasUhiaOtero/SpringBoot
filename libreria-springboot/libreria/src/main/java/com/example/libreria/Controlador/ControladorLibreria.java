package com.example.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.Model.Libros;
import com.example.libreria.RepoLibros.Repolibros;
import com.example.libreria.Servicio.ServicioLibro;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
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

    

    @GetMapping("/todos")
    public List<Libros> dimeTodos() {
        return sLibro.obtenerTodos();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libros> BuscaId(@PathVariable long id) {
        try {
            return ResponseEntity.ok(sLibro.buscarPorId(id));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<Libros> BuscaTitulo(@PathVariable String titulo) {
        try {
            return ResponseEntity.ok(sLibro.buscarPorTitulo(titulo));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/clone")
    public String probarClone() {
       Libros original = new Libros(1L,"Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16));
       Libros copia = original.clone();
       copia.setIdLibro(8);
       copia.setTitulo("Copia prueba");

       return "Original: " + original.toString() + " | Copia: " + copia.toString();
    }
    
    


}
