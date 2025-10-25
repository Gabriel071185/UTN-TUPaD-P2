/*

Trabajo Practico 1: Introducción a Java
Estudiante: Etchegoyen Gabriel
Materia: Programación 2

*/
package trabajopractico1;

/*

6. Escribe un programa que muestre el siguiente mensaje en consola:
Nombre: Juan Pérez
Edad: 30 años
Dirección: "Calle Falsa 123"
Usa caracteres de escape (\n, \") en System.out.println().


*/
public class Ejercicio6 {
    public static void main(String[] args) {
        String nombre = "Juan Pérez";
        int edad = 30;
        String direccion = "Calle Falsa 123";   
        
        System.out.println("Nombre: "+ nombre+"\nEdad: "+ edad+ "\nDirección: \""+ direccion + "\"");
    }
}
