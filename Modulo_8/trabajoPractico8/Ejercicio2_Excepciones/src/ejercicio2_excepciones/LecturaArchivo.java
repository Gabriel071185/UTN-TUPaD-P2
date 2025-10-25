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
 * Ejercicio 2 - Punto 3: Lectura de archivo
 * Leer un archivo de texto y mostrarlo.
 * Manejar FileNotFoundException si el archivo no existe.
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Lectura de archivo ===");
        
        try {
            System.out.println("Ingrese la ruta del archivo a leer:  ");
            String rutaArchivo = scanner.nextLine();
            
            // Leer y mostrar el archivo
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            System.out.println("\n=== Contenido de archivo ===");
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            
            reader.close();
            
            System.out.println("=== Fin del archivo ===");
            
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: El archivo no existe o no se puede encontrar");
            System.out.println("Mensaje: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}