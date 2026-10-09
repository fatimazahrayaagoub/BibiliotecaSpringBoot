package org.example.bibliotecaspring.controller;

import org.example.bibliotecaspring.entity.Libro;
import org.example.bibliotecaspring.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Libros")
public class LibroController {
    @Autowired
    private LibroRepository libroRepository;

    //GET

    @GetMapping("/Libros/{id}")
    public Libro findById(@PathVariable Long id){
        return libroRepository.findById(id).get();
    }

    @GetMapping("/Libros")
    public List<Libro> findAll(){
        return libroRepository.findAll();
    }

    //DELETE

  @DeleteMapping("/Libros")
    public void deleteAll(){
         libroRepository.deleteAll();
  }

  @DeleteMapping("/Libros/{id}")
    public void  deleteById(@PathVariable Long id){
        libroRepository.deleteById(id);
    }

    //PÙT

    @PutMapping("/Libros")
    public Libro update(@RequestBody Libro libro){
       return   libroRepository.save(libro);
    }

    @PutMapping("/Libros/{id}")
    public Libro updateById(@PathVariable Long id,@RequestBody Libro libro){
        return libroRepository.save(libro);
    }

  //post==create
    @PostMapping("/Libros")
    public Libro create(@RequestBody Libro libro){
        return libroRepository.save(libro);
    }

  //patrch para modificar
    @PatchMapping("/Libros/{id}/precio")
    public Libro modifyPrecio(@PathVariable Long id,@RequestBody double precio){
        Libro libro=libroRepository.findById(id).get();
        libro.setPrecio(precio);
        return libroRepository.save(libro);
    }

    //









}

