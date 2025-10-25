/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;
/*

1. Vehículos y herencia básica
● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()
● Tarea: Instanciar un auto y mostrar su información completa.

*/

public class Ejercicio1 {

    
    public static void main(String[] args) {
                
        // Instanciar un auto
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        
        // Mostrar la información completa
        miAuto.mostrarInfo();
    }
}
    

