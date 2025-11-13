package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Service.LibroService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/libros")
public class LibroController {
    
    @Autowired
    private LibroService libroService;


    @PostMapping("postLibro")
    public ResponseEntity<?> postLibro(@RequestBody LibroEntity libroEntity) {
        
        return libroService.posLibroEntity(libroEntity);
    }
    

    @GetMapping("getAll")
    public ArrayList<LibroEntity> getAll() {
        return libroService.getAll();
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id){
        return libroService.getById(id);
    }
    
    @PutMapping("modfiicar/{id}")
    public ResponseEntity<?> modificarLibro (@PathVariable int id, @RequestBody LibroEntity libroEntity) {
        
        return libroService.modificarLibro(id , libroEntity);
    }
    
}
