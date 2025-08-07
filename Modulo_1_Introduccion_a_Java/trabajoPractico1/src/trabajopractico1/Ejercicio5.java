/*

Trabajo Practico 1: Introducción a Java
Estudiante: Etchegoyen Gabriel
Materia: Programación 2

*/
package trabajopractico1;
import java.util.Scanner;
/*

5. Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola


*/
public class Ejercicio5 {
    
    public static void main(String[] args) {
       int num1, num2;

    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el primer numero: ");
    num1 = entrada.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    num2 = entrada.nextInt();

    System.out.println("La suma de: " + num1 + " y " + num2 + " es: " + (num1 + num2));
    System.out.println("La resta de: " + num1 + " y " + num2 + " es: " + (num1 - num2));
    System.out.println("La division de: " + num1 + " y " + num2 + " es: " + ((double) num1 / num2));
    System.out.println("La multiplicacion de: " + num1 + " y " + num2 + " es: " + (num1 * num2));
       
        
    }
    
}
