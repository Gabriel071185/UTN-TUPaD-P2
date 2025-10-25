/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2_excepciones;

/**
 * Ejercicio 2 - Punto 2: Conversión de cadena a número
 * Leer texto del usuario e intentar convertirlo a int. 
 * Manejar NumberFormatException si no es válido.
 */

import java.util.Scanner;

public class ConversionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Conversion de cadena a numero ===");
        
        try {
            System.out.print("Ingrese un numero entero: ");
            String entrada = scanner.nextLine();
            
            int numero = Integer.parseInt(entrada);
            System.out.println(" Numero convertido: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println(" Error: La cadena no es un numero valido");
            System.out.println(" Mensaje de error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}