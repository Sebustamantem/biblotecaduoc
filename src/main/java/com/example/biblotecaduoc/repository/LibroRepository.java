package com.example.biblotecaduoc.repository;

import com.example.biblotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Libro guardarLibro(Libro lib) {
        listaLibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib) {
        int idPosicion = -1;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                idPosicion = i;
                break;
            }
        }

        if (idPosicion == -1) {
            return null; // Libro no encontrado
        }

        Libro libroActualizado = new Libro();
        libroActualizado.setId(lib.getId());
        libroActualizado.setTitulo(lib.getTitulo());
        libroActualizado.setAutor(lib.getAutor());
        libroActualizado.setFechaPublicacion(lib.getFechaPublicacion());
        libroActualizado.setEditorial(lib.getEditorial());
        libroActualizado.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libroActualizado);
        return libroActualizado;
    }

    public void eliminarLibro(int id) {
        // 1. Usar removeIf es suficiente
        listaLibros.removeIf(libro -> libro.getId() == id);
    }
}

