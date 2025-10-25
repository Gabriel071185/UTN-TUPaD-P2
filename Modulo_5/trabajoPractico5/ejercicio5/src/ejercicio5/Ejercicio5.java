/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;
/*
5. Computadora - PlacaMadre - Propietario
a. Composición: Computadora → PlacaMadre
b. Asociación bidireccional: Computadora ↔ Propietario
Clases y atributos:
i. Computadora: marca, numeroSerie
ii. PlacaMadre: modelo, chipset
iii. Propietario: nombre, dni
*/
public class Ejercicio5 {

    
    public static void main(String[] args) {
        //Composición
        Computadora miPc = new Computadora("Dell", 12345, "B450", "AMD Chipset");
        System.out.println(miPc);
        // Asociación
        Propietario usuario1 = new Propietario("Gabriel Etchegoyen", 31912832);
        miPc.setPropietario(usuario1);
        System.out.println(miPc.getPropietario());
        
    }
    
}
