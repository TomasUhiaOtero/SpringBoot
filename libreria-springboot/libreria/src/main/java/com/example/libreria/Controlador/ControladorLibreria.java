package com.example.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.Model.Libros;

import com.example.libreria.Servicio.InterfazServicioLibro;



import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//Controlador (Gestiona las rutas)


@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final InterfazServicioLibro IservicioLibro;
    
    

    public ControladorLibreria(InterfazServicioLibro IservicioLibro) {
        this.IservicioLibro = IservicioLibro;
    }

    @GetMapping("/todos")
    public List <Libros> listar() {
        return IservicioLibro.ObtenerTodos();
    }
    

    @GetMapping("/{id}")
    public ResponseEntity <Libros> obtenerId(@PathVariable long id) {
       return IservicioLibro.obtenerPorId(id)
       .map(ResponseEntity::ok)
       .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity <Libros> crear(@RequestBody Libros libro) {
        IservicioLibro.guardar(libro);
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{id}") 
    public ResponseEntity<Void> eliminar(@PathVariable long id){
        IservicioLibro.eliminarPorId(id);
        return ResponseEntity.noContent().build();
        
    }
    
    

    
/*  @GetMapping("/todos")
    public List<Libros> dimeTodos() {
        return sLibro.ObtenerTodos();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libros> buscarPorId(@PathVariable long id) {
        return sLibro.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<String> buscarPorTitulo(@PathVariable String titulo) {
        String resultado = sLibro.buscalibroPorTitulo(titulo);
        return ResponseEntity.ok(resultado);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable long id) {
        sLibro.eliminarPorId(id);
        return ResponseEntity.noContent().build();
    }

    
    
    @GetMapping("/clone")
    public String probarClone() {
       Libros original = new Libros(1L,"Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16));
       Libros copia = original.clone();
       copia.setIdLibro(8);
       copia.setTitulo("Copia prueba");

       return "Original: " + original.toString() + " | Copia: " + copia.toString();
    }
    */
   
    


}
