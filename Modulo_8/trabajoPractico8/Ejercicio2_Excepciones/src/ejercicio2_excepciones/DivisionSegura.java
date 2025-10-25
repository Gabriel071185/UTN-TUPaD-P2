/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2_excepciones;

import java.util.Scanner;

/**
 * Ejercicio 2 - Punto 1: División segura Manejar ArithmeticException cuando el
 * divisor sea cero
 */
public class DivisionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Division segura ===");
        System.out.println("Este programa realiza divisiones enteras de forma segura");

        try {
            // Solicitar dividendo
            System.out.print("Ingrese el dividendo (numero entero): ");
            int dividendo = scanner.nextInt();

            // Solicitar divisor
            System.out.print("Ingrese el divisor (numero entero): ");
            int divisor = scanner.nextInt();

            // Realizar división
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("--- Programa finalizado ---");
            scanner.close();
        }
    }
}
