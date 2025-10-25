/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio12;
/*
12. Impuesto - Contribuyente - Calculadora
a. Asociación unidireccional: Impuesto → Contribuyente
b. Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
i. Impuesto: monto.
ii. Contribuyente: nombre, cuil.
iii. Calculadora->método: void calcular(Impuesto impuesto)
*/
public class Ejercicio12 {

    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Juan Perez", "20-12345678-9");
        Contribuyente contribuyente2 = new Contribuyente("Maria Garcia", "27-87654321-0");
        
        Impuesto impuesto1 = new Impuesto(10000.0, contribuyente1);
        Impuesto impuesto2 = new Impuesto(15000.0, contribuyente2);
        
        Calculadora calculadora = new Calculadora();
        
        System.out.println("=== Sistema de impuestos ===");
        calculadora.calcular(impuesto1);
        calculadora.calcular(impuesto2);
        
        System.out.println("\n=== Informacion detallada ===");
        calculadora.mostrarInfo(impuesto1);
        System.out.println();
        calculadora.mostrarInfo(impuesto2);
    }
    
}
