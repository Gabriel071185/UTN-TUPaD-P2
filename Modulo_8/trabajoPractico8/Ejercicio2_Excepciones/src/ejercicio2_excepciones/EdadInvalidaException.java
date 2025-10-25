/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2_excepciones;
/**
 * Ejercicio 2 - Punto 4: Excepción personalizada
 * Crear EdadInvalidaException que extiende Exception
 */
public class EdadInvalidaException extends Exception {
    
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    
    public EdadInvalidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }   
}