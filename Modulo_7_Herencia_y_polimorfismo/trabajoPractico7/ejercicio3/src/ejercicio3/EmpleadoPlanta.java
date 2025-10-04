/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio3;

public class EmpleadoPlanta extends Empleado {
    private double salarioBase;
    private double bonificacion;
    
    public EmpleadoPlanta(String nombre, String id, double salarioBase, double bonificacion) {
        super(nombre, id);
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }
    
    @Override
    public double calcularSueldo() {
        return salarioBase + bonificacion;
    }
}
