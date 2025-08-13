/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;
import java.util.Scanner;
/*
Estructuras Condicionales:
1. Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.
*/
public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el año que desee corroborar: ");
        int anio = entrada.nextInt();
        boolean esBisiesto = false;
        
        if (anio % 4 == 0) {
            if (anio % 100 != 0) {
                esBisiesto = true;
            } else {
                if (anio % 400 == 0) {
                    esBisiesto = true;
                }
            }
        }
        
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
    
}
