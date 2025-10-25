/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico2;
import java.util.Scanner;
/*3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
*/
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        if (edad < 0) {
            System.out.println("Edad no válida. Por favor ingrese un número positivo.");
        } else if (edad <= 12) {
            System.out.println("Eres un niño");
        } else if (edad > 12 && edad <=18) {
            System.out.println("Eres un adolescente");
        } else if (edad > 18 && edad <59 ) {
            System.out.println("Eres un adulto");
        } else if (edad >= 60) {
            System.out.println("Eres un adulto mayor");
        } 
        
    }
}
