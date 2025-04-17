package com.example.biblotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String fechaPublicacion;
    private String autor;

}
