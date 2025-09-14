/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio6;

public class Mesa {
    
    private int numero;
    private String capacidad;

    public Mesa(int numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Mesa " + "numero: " + numero +" "+ capacidad ;
    }
    
    
    
}
