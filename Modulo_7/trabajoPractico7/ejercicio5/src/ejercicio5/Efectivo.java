/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;

public class Efectivo implements Pagable {
    private double monto;
    
    public Efectivo(double monto) {
        this.monto = monto;
    }
    
    @Override
    public void pagar() {
        System.out.println("Pagando en efectivo: $" + monto);
        System.out.println("Pago recibido en caja");
    }
}
