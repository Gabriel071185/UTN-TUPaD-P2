/*
Trabajo Practico N° 6: Colecciones y Sistema de Stock
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package bibliotecaylibros;
/*
Caso Práctico 2: Biblioteca y Libros

Descripción general

Se debe desarrollar un sistema para gestionar una biblioteca, en la cual se
registren los libros disponibles y sus autores. La relación central es de
composición 1 a N: una Biblioteca contiene múltiples Libros, y cada Libro
pertenece obligatoriamente a una Biblioteca. Si la Biblioteca se elimina, también se
eliminan sus Libros.

Tareas a realizar

1. Creamos una biblioteca.
2. Crear al menos tres autores
3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
4. Listar todos los libros con su información y la del autor.
5. Buscar un libro por su ISBN y mostrar su información.
6. Filtrar y mostrar los libros publicados en un año específico.
7. Eliminar un libro por su ISBN y listar los libros restantes.
8. Mostrar la cantidad total de libros en la biblioteca.
9. Listar todos los autores de los libros disponibles en la biblioteca.

*/


import java.util.List;

public class BibliotecayLibros {

    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 1. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel Garcia Marquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Jorge Luis Borges", "Argentina");

        // 2. Agregar 5 libros asociados a autores
        biblioteca.agregarLibro("ISBN001", "Cien anios de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del colera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "La casa de los espiritus", 1982, autor2);
        biblioteca.agregarLibro("ISBN004", "Ficciones", 1944, autor3);
        biblioteca.agregarLibro("ISBN005", "El aleph", 1949, autor3);

        System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");

        // 3. Listar todos los libros con su información y autor
        System.out.println("--- Listado de todos los libros ---");
        biblioteca.listarLibros();

        // 4. Buscar un libro por su ISBN
        System.out.println("\n--- Busqueda por ISBN: ISBN003 ---");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 5. Filtrar libros por año de publicación
        System.out.println("\n--- Libros publicados en 1944 ---");
        List<Libro> libros1944 = biblioteca.filtrarLibrosPorAnio(1944);
        for (Libro libro : libros1944) {
            libro.mostrarInfo();
        }

        // 6. Eliminar un libro por ISBN
        System.out.println("\n--- Eliminar libro ISBN002 ---");
        if (biblioteca.eliminarLibro("ISBN002")) {
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 7. Mostrar cantidad total de libros
        System.out.println("\n--- Cantidad total de libros ---");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros() + " libros");

        // 8. Listar autores disponibles
        System.out.println("\n--- Autores disponibles ---");
        biblioteca.mostrarAutoresDisponibles();

        // Listar libros restantes después de eliminar
        System.out.println("\n--- Libros restantes ---");
        biblioteca.listarLibros();
    }
    
}
