/*
Trabajo Practico N° 3: Introduccion a POO
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico3;

import java.util.Objects;

/*
1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones.
*/
public class RegistroEstudiante {
    
    public String nombre;
    public String apellido;
    public String curso;
    public int calificacion;

    public RegistroEstudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("La informacion del alumno es: " + nombre + " " + apellido + 
                          ", su curso es: " + curso + " y su calificacion es de: " + calificacion + "/100");
    }
    
    public void subirCalificacion(int puntos){
       this.calificacion += puntos;
    }   
    public void bajarCalificacion(int puntos){
       this.calificacion-= puntos; 
    }   
     
    }
    

