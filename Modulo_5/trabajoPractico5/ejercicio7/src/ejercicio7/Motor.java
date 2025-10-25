/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio7;


public class Motor {
    
    private String tipo;
    private int numeroSerie;

    public Motor(String tipo, int numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor tipo: " + tipo + ", Numero de Serie: " + numeroSerie;
    }
    
    
    
    
}
