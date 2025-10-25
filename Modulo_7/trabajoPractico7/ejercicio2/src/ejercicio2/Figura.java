/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2;

public  abstract class Figura  {
     protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public String getNombre() {
        return nombre;
    }
}
