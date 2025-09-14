/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio3;


public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    
    public Libro(String titulo, String isbn, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Titulo = " + titulo + ", ISBN = " + isbn +
                ", Autor = " + autor + " " + editorial;
    }

    
    
    
    
}
