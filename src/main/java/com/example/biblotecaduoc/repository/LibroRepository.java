package com.example.biblotecaduoc.repository;

import com.example.biblotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    //Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    //Metodo que retorna todos los libros
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    //Buscar un Libro por su id
    public Libro buscarPorId (int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }


    //Buscar un libro por su ISBN
    public Libro buscarLibroPorIsbn (String isbn) {
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

    public Libro actualizar (Libro lib) {
        int id = 0;
        int idPosicion = 0;

        for (Libro libro : listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libor1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial()
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    //Eliminar Libro por id

    public void eliminarLibro(int id) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
        }
        //Otra forma de eliminar un libro por id
        int idPosicion = 0;
        for(int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i)).getId() == id) {
                idPosicion = i;
                break;
            }
        }
        if (idPosicion > 0) {
            listaLibros.remove(idPosicion);
        }

        //Otra forma de eliminar un libro por id

        listaLibros.removeIf(libro -> libro.getId() == id);

    }


}
