package com.example.demo.Service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LibroEntity;

@Service
public interface LibroService {
    
    public ResponseEntity<?> posLibroEntity(LibroEntity libroEntity);

    public ArrayList<LibroEntity> getAll();

    public ResponseEntity<?> getById(int id);

    public ResponseEntity<?> modificarLibro(int id , LibroEntity libroEntity);
}
