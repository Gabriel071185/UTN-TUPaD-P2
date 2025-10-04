/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre, "Perro");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }
}
