package com.tomas.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tomas.spring.app1.springboot_applications.models.Empleados;



@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    
    public String info(Model model) {
        
        Empleados empleado1 = new Empleados("Juan", "Perez", "123 Main St", "Developer", 30, 1234567890, 1);

        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
}
