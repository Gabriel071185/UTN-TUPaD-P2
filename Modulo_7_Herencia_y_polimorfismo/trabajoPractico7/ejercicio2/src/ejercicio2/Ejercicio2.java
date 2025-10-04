/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2;
/*

2. Figuras geométricas y métodos abstractos
● Clase abstracta: Figura con método calcularArea() y atributo nombre
● Subclases: Círculo y Rectángulo implementan el cálculo del área
● Tarea: Crear un array de figuras y mostrar el área de cada una usando
polimorfismo.

 */

public class Ejercicio2 {
    public static void main(String[] args) {
        // Creamos un array definido de figuras
        Figura[] figuras = new Figura[8];
        
        // Instanciamos el circulo y rectangulo
        figuras[0] = new Circulo("Circulo #1", 5.0);
        figuras[1] = new Rectangulo("Rectangulo #1", 10.0, 6.0);
        figuras[2] = new Circulo("Circulo #2", 3.5);
        figuras[3] = new Rectangulo("Rectangulo #2", 8.0, 4.0);
        figuras[4] = new Circulo("Circulo #3", 7.0);
        figuras[5] = new Rectangulo("Rectangulo #3", 12.0, 5.0);
        figuras[6] = new Circulo("Circulo #4", 2.0);
        figuras[7] = new Rectangulo("Rectangulo #4", 15.0, 3.0);
        
        // Mostrar el área de cada figura usando polimorfismo
        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getNombre());
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("--------------------");
        }
    }
}