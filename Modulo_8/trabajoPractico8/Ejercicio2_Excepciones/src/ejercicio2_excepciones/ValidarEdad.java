/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2_excepciones;

import java.util.Scanner;
/**
 * Ejercicio 2 - Punto 4: Excepción personalizada Lanzar EdadInvalidaException
 * si la edad es menor a 0 o mayor a 120 Capturarla y mostrar mensaje
 */
public class ValidarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Validacion de edad ===");

        try {
            System.out.print("Ingrese una edad: ");
            int edad = scanner.nextInt();

            validarEdad(edad);
            System.out.println("Edad valida: " + edad + " años");

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método que lanza la excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120: " + edad);
        }
    }
}
