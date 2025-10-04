/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio3;

public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, String id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
}
