/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre, "Vaca");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Muuu muu!");
    }
}
