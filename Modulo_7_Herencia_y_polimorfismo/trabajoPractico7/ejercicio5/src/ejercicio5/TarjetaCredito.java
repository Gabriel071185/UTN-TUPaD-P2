/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;

public class TarjetaCredito implements Pagable {
    private String numeroTarjeta;
    
    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void pagar() {
        System.out.println("Pagando con tarjeta de credito: " + numeroTarjeta);
        System.out.println("Procesando pago...");
    }
}
