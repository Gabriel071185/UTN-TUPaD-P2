/*

Trabajo Practico 1: Introducción a Java
Estudiante: Etchegoyen Gabriel
Materia: Programación 2

*/
package trabajopractico1;
import java.util.Scanner;
/*

8. Manejar conversiones de tipo y división en Java.

Escribe un programa que divida dos números enteros ingresados por el
usuario.
Modifica el código para usar double en lugar de int y compara los
resultados


*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:  ");
         int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero:  ");
         int num2 = entrada.nextInt();
        System.out.println("El resultado de la division es:  "+ (num1/num2));
        System.out.println("El resultado usando double es:  "+ ((double)num1/num2));
    }
    
}
