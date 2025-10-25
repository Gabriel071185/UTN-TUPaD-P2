/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;

public class Producto implements Pagable {

    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Sobreescribo el método de la interfaz Pagable
    @Override
    public double calcularTotal() {
        return this.precio;
    }

    // Getters 
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
