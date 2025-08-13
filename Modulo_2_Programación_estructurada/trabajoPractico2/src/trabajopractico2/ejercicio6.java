/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico2;
import java.util.Scanner;

/*
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.

*/

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumPos = 0, sumNeg = 0, sumCeros = 0; 
        for (int i = 0; i <10; i++ ){
            System.out.print("Ingrese un numero: ");
            int numero = entrada.nextInt();
            if (numero > 0){
                sumPos++;
            } else if (numero < 0){
                sumNeg++;
            } else {
                sumCeros++;
            }
        }
        
        System.out.println("Suma positivos: "+ sumPos);
        System.out.println("Suma negativos: "+ sumNeg);
        System.out.println("Suma de ceros: "+ sumCeros);
        
    }
    
}
