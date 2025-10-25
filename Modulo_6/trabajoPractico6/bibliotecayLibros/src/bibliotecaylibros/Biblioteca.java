/*
Trabajo Practico N° 6: Colecciones y Sistema de Stock
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/

package bibliotecaylibros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
    }

    // Listar todos los libros
    public void listarLibros() {
        System.out.println("=== LIBROS DE LA BIBLIOTECA: " + nombre + " ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            return true;
        }
        return false;
    }

    // Obtener cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Filtrar libros por año de publicación
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    // Mostrar autores disponibles (sin repetir)
    public void mostrarAutoresDisponibles() {
        Set<String> autoresUnicos = new HashSet<>();
        
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor().getNombre());
        }
        
        System.out.println("=== AUTORES DISPONIBLES ===");
        for (String autor : autoresUnicos) {
            System.out.println("- " + autor);
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Libro> getLibros() { return libros; }
}
