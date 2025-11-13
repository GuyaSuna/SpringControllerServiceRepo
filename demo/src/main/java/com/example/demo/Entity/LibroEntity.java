package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LibroEntity {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String titulo;

private String autor; 

private boolean prestado;


@Override
public String toString() {
    return "LibroEntity [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", prestado=" + prestado + "]";
}


public LibroEntity(){}


public LibroEntity(int id, String titulo, String autor, boolean prestado) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.prestado = prestado;
}


public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public boolean isPrestado() {
    return prestado;
}

public void setPrestado(boolean prestado) {
    this.prestado = prestado;
}



}
