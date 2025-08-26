/*
Trabajo Practico N° 3: Introduccion a POO
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico3;

/*
2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.

*/
public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
     public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
     
    public void mostrarInfoMascota() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
        
        
    } 
    public void cumplirAnios() {
        edad++; 
        System.out.println( nombre + " ha cumplido anios!");
        System.out.println("Ahora tiene " + edad + " anios");
        
        
    }
    
}
