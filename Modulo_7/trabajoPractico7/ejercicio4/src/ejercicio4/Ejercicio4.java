/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

/*

4. Animales y comportamiento sobrescrito
● Clase: Animal con método hacerSonido() y describirAnimal()
● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
● Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo
 
*/
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear lista de animales
        List<Animal> animales = new ArrayList<>();
        
        // Agregar diferentes animales
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Bobi"));
        animales.add(new Gato("Garfield"));
        animales.add(new Vaca("Rosita"));
        
        // Mostrar descripción y sonidos usando polimorfismo
        System.out.println("=== SONIDOS DE ANIMALES ===");
        for (Animal animal : animales) {
            animal.describirAnimal();
            System.out.print("Sonido: ");
            animal.hacerSonido();
            System.out.println("--------------------");
        }
    }
}