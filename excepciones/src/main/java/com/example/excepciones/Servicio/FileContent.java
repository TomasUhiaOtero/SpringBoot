package com.example.excepciones.Servicio;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileContent {

    public String Lecturaarchivo(String ruta){
        try{
            Path path = Paths.get(ruta);
            return  Files.readString(path);
        }catch(IOException ex){
            throw new RuntimeException("Error en lectura de archivo: " + ex.getMessage());
        }
    }
}
