/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre, "Gato");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau miau!");
    }
}
