/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;

public class PayPal implements Pago {

    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal: " + email);
    }
}
