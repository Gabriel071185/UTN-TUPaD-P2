/*

Trabajo Practico 1: Introducción a Java
Estudiante: Etchegoyen Gabriel
Materia: Programación 2

*/
package trabajopractico1;
import java.util.Scanner;
/*
9. Corrige el siguiente código para que funcione correctamente. Explica qué error
tenía y cómo lo solucionaste.
import java.util.Scanner;
public class ErrorEjemplo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextInt(); // ERROR
System.out.println("Hola, " + nombre);
}
}


*/
public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine(); // Se corrige el tipo de dato que se ingresa
    System.out.println("Hola, " + nombre);
    }
}
