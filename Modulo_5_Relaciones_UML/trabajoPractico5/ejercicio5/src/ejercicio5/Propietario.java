/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;


public class Propietario {
    
    private String nombre;
    private int dni;
    private Computadora computadora;

    public Propietario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setComputadora(Computadora computadora){
        this.computadora= computadora;
        if(computadora != null && computadora.getPropietario() != this){
           computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        return "\nPropietario{" + "nombre=" + nombre + ", dni=" + dni +
                ", computadora=" + computadora + '}';
    }
        
}
