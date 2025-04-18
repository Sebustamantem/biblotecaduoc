package com.example.biblotecaduoc.services;

import com.example.biblotecaduoc.model.Libro;
import com.example.biblotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    public List <Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

}
