/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio3;
/*
3. Libro - Autor - Editorial
a. Asociación unidireccional: Libro → Autor
b. Agregación: Libro → Editorial
Clases y atributos:
i. Libro: titulo, isbn
ii. Autor: nombre, nacionalidad
iii. Editorial: nombre, direccion
*/
public class Ejercicio3 {

    public static void main(String[] args) {
        Editorial editorial1 = new Editorial("Atlantida", "Avenida del Libertador 1234,"
                + " Buenos Aires, Argentina");
        Libro libro1 = new Libro("La odisea", "123HSR", editorial1);
        Autor autor1 = new Autor("Homero", "Griego");
        libro1.setAutor(autor1);
        System.out.println(libro1.toString());
        
        
    }
    
}
