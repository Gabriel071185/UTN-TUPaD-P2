/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico2;
import java.util.Scanner;
/*
7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.

*/

public class ejercicio7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Ingrese su nota (entre 1 y 10): ");
            nota = entrada.nextInt();
            System.out.println("Su nota ingresada es: " + nota);
            
            if (nota < 1 || nota > 10) {
                System.out.println("Nota inválida. Intente nuevamente.");
            }
        } while (nota < 1 || nota > 10);  
        
        System.out.println("Nota válida ingresada: " + nota);   
          
    }
}
