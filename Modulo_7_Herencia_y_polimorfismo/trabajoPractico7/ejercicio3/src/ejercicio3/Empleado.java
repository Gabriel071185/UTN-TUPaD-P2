/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio3;

public abstract class Empleado {
    protected String nombre;
    protected String id;
    
    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSueldo();
    
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
}