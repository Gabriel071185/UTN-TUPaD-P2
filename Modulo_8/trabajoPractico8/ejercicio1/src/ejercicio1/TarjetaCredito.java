/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;

public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Credito: " 
                + numeroTarjeta);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando descuento del " + porcentaje 
                + "% en pago con Tarjeta de Credito");
    }
}
