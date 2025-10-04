/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;

/*

5. Sistema de pagos con polimorfismo y genéricos
● Interfaz: Pagable con método pagar()
● Clases: TarjetaCredito, Transferencia, Efectivo implementan Pagable
● Método: procesarPago(Pagable medio) genérico para todos los tipos
● Tarea: Crear distintas formas de pago y procesarlas con una sola función

*/
public class Ejercicio5 {
    public static void main(String[] args) {
        
        // Usando los 3 tipos de pago
        Pagable tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        Pagable transferencia = new Transferencia("ES12-3456-7890-1234-5678");
        Pagable efectivo = new Efectivo(150.75);
                             
        ProcesadorPagos.procesarPago(tarjeta);
        ProcesadorPagos.procesarPago(transferencia);
        ProcesadorPagos.procesarPago(efectivo);
        
        
    }
}
