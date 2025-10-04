/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    // Math.PI para obtener el valor de π en la fórmula del área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
