/*

Trabajo Practico 1: Introducción a Java
Estudiante: Etchegoyen Gabriel
Materia: Programación 2

*/
package trabajopractico1;

/*

3. Crea un programa que declare las siguientes variables con valores asignados:

 String nombre
 int edad
 double altura
 boolean estudiante

Imprime los valores en pantalla usando System.out.println().

*/

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre = "Gabriel Etchegoyen";
        int edad = 39;
        double altura = 1.78;
        boolean estudiante = true;
        
        System.out.println("Mi nombre es "+ nombre + ", tengo " + edad);
        System.out.println("Mi altura es "+ altura + " y mi condicion de estudiante es: "+ estudiante);
        
    }
    
}
