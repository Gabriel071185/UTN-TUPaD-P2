/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package Ejercicio1;

/*
1. Pasaporte - Foto - Titular
a. Composición: Pasaporte → Foto
b. Asociación bidireccional: Pasaporte ↔ Titular
Clases y atributos:
i. Pasaporte: numero, fechaEmision
ii. Foto: imagen, formato
iii. Titular: nombre, dni
*/


public class Ejercicio1 {

    public static void main(String[] args) {
         // Crear objetos
        Titular titular = new Titular("Gabriel Etchegoyen", "31912832");
        Pasaporte pasaporte = new Pasaporte("GH987654", "2024-05-20", "gabriel_foto.jpg", "JPEG");
        
        // Establecer relación bidireccional
        titular.setPasaporte(pasaporte);
        
        // Verificar que ambas referencias están correctas
        System.out.println(pasaporte.toString());
        
        System.out.println("\n--- Informacion del Titular ---");
        System.out.println("Nombre: " + titular.getNombre());
        System.out.println("DNI: " + titular.getDni());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());
    }
}
        
        
        

    

