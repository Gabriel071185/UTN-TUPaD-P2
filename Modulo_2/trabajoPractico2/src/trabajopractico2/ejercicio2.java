/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico2;
import java.util.Scanner;
/*
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
*/
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int uno = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int dos = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int tres = entrada.nextInt();
        
        if (uno >= dos && uno >= tres) {
            System.out.println("El mayor es: "+ uno);
        } else if (dos >= uno && dos >= tres) {
            System.out.println("El mayor es: "+ dos);
        } else {
            System.out.println("El mayor es: "+ tres);
        }
    }
    
}
