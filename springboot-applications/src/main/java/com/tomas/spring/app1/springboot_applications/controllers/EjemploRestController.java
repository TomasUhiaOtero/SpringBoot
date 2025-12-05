package com.tomas.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    
    public Map<String, Object> detalles_info2() {
        Map<String, Object> response = new HashMap<>();
        response.put("Titulo", "Servidor en linea");
        response.put("Servidor", "ServerTomas");
        response.put("Ip", "192.168.1.1");
        return response;
    }
}
