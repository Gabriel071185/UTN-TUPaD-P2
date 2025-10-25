/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2_excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 2 - Punto 5: Uso de try-with-resources
 * Leer un archivo con BufferedReader usando try-with-resources
 * Manejar IOException correctamente
 */
public class TryWithResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Try with resources ===");
        
        try {
            System.out.print("Ingrese la ruta del archivo a leer: ");
            String rutaArchivo = scanner.nextLine();
            
            // try-with-resources - cierra automáticamente el BufferedReader
            try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
                
                System.out.println("\n=== Contenido de archivo ===");
                String linea;
                int numeroLinea = 1;
                
                while ((linea = reader.readLine()) != null) {
                    System.out.println(numeroLinea + ": " + linea);
                    numeroLinea++;
                }
                
                System.out.println("=== Fin del archivo ===");
                
            } // El BufferedReader se cierra automáticamente aquí
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner cerrado correctamente");
        }
    }
}