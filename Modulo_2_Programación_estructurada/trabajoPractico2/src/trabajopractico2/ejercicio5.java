/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;

import java.util.Scanner;

/*
5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.

 */
public class ejercicio5 {

    public static void main(String[] args) {
        boolean bandera = true;
        int suma = 0;
        Scanner entrada = new Scanner(System.in);

        while (bandera) {
            System.out.println("Ingrese un numero: ");
            int numero = entrada.nextInt();
            if (numero == 0) {
                bandera = false;
            } else if (numero % 2 == 0) {
                suma += numero;
            }
        }
        System.out.println("La suma de los numeros pares ingresados es: " + suma);
    }
}
