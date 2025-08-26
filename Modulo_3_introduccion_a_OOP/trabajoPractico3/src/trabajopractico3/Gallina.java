/*
Trabajo Practico N° 3: Introduccion a POO
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico3;

/*
4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.
*/
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; 
    }

     public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina #" + idGallina + " ha puesto un huevo!");
    }
    
    
    public void envejecer() {
        edad++;
        System.out.println("Gallina #" + idGallina + " ha cumplido un anio mas. Ahora tiene " + edad + " anios");
    }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina + " - Edad: " + edad + " - Huevos: " + huevosPuestos);
    }
    
    
    
    
    
    
    
}
