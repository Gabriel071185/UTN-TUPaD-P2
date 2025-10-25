/*

Trabajo Practico 1: Introducción a Java
Estudiante: Etchegoyen Gabriel
Materia: Programación 2

*/

package trabajopractico1;
import java.util.Scanner;


/*

4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.

*/
public class Ejercicio4 {
    public static void main(String[] args) {
       String nombre;
       int edad;
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese el nombre:   ");
       nombre = entrada.nextLine();
       System.out.print("Ingrese su edad:  ");
       edad = entrada.nextInt();
       
        System.out.println("Mi nombre es  "+ nombre + " y mi edad es  "+ edad);
       
        
    }
    
}
