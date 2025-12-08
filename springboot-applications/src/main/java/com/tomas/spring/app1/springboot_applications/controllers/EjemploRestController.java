package com.tomas.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tomas.spring.app1.springboot_applications.models.Empleados;



@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping(path="/detalles_info2") // equivalente a @RequestMapping(path="/detalles_info2", method = RequestMethod.GET) 
/* 
* ✔️ Usa @GetMapping cuando:
* Creas un endpoint específico para GET.
* Quieres claridad en el código.
* Desarrollas APIs REST de forma estándar.

* ✔️ Usa @RequestMapping cuando:
* Necesitas manejar múltiples métodos HTTP en un mismo método.
* Requieres configuraciones avanzadas:
* varias rutas
* condiciones por headers
* multimedia específico de entrada/salida
* Quieres un endpoint genérico que responda a varios verbos HTTP.*/
    
    
    public Map<String, Object> detalles_info2() {

        Empleados empleado1 = new Empleados("Juan", "Perez", "123 Main St", "Developer", 30, 1234567890, 1);


        Map<String, Object> response = new HashMap<>();
        response.put("Empleado", "Datos del empleado");
        response.put("Informacion", empleado1);
        
        return response;
    }
}
