/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class Animal {
    protected String nombre;
    protected String tipo;
    
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void describirAnimal() {
        System.out.println("Soy un/a " + tipo + " llamado " + nombre);
    }
}