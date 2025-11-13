package com.example.demo.Service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LibroEntity;
import com.example.demo.Repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;
    
    

    @Override
    public ResponseEntity<?> posLibroEntity(LibroEntity libroEntity) {
            if(libroEntity.getTitulo().isEmpty() || libroEntity.getAutor().isEmpty()){
                return ResponseEntity.badRequest().body("Faltan datos obligatorios");
            }else{
              return new ResponseEntity<>(libroRepository.save(libroEntity) , HttpStatus.CREATED); 
            }
    }
    

    





    public Optional<LibroEntity> buscarLibro(int id){

        return libroRepository.findById(id);
    }

    @Override
    public ArrayList<LibroEntity> getAll() {
    
       return libroRepository.findAll();
    }

    @Override
    public ResponseEntity<?> getById(int id) {
       
        Optional<LibroEntity> libro = libroRepository.findById(id);

        if(libro.isPresent()){
            return new ResponseEntity<>(libro.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null , HttpStatus.NOT_FOUND);
        }

    }








    @Override
    public ResponseEntity<?> modificarLibro(int id, LibroEntity libroEntity) {
        
        Optional<LibroEntity> libroRepo = libroRepository.findById(id);

        if(libroRepo.isPresent()){
            return new ResponseEntity<>("Libro no encontrado" , HttpStatus.BAD_REQUEST);
        }

        LibroEntity libroEncontrado = libroRepo.get();

        libroEncontrado.setAutor(libroEntity.getAutor());
        libroEncontrado.setTitulo(libroEntity.getTitulo());

        return new ResponseEntity<>(libroRepository.save(libroEncontrado) , HttpStatus.OK);


    }


    
}
