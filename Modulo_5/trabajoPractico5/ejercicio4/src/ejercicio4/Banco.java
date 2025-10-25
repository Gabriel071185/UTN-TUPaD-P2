/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class Banco {
    
    private String nombre;
    private int cuit;
    
    public Banco(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "\nBanco Nombre: " + nombre + ", CUIT: " + cuit ;
    }
           
}
