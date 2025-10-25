/*
Trabajo Practico N° 3: Introduccion a POO
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico3;

/*
3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
*/

public class Libro {
     
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
       this.titulo = titulo;
       this.autor = autor;
       this.anioPublicacion = anioPublicacion;
       }
       
    public String getTitulo(){
        return titulo;
    }   
    
    public String getAutor(){
        return autor;
    
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setTitulo(String titulo) {
        if (titulo == null) {
            System.out.println("Error: El título no puede estar vacío");
            return;
        }
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        if (autor == null) {
            System.out.println("Error: El autor no puede estar vacío");
            return;
        }
        this.autor = autor;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 0) {
            System.out.println("Error: El anio de publicacion no puede ser negativo");
        } else {
            this.anioPublicacion = anioPublicacion;
        }
    }
    
    public void mostrarInfoLibro() {
        System.out.println("\nInformacion del Libro:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio: " + anioPublicacion );
    
    }
    
    
     
     
     
    
    
    
}
