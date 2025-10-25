/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;

public class ProcesadorPagos {
    
    
    public static void procesarPago(Pagable medioPago) {
        System.out.println("=== INICIANDO PROCESO DE PAGO ===");
        medioPago.pagar();
        System.out.println("=== PAGO COMPLETADO ===\n");
    }
        
}
