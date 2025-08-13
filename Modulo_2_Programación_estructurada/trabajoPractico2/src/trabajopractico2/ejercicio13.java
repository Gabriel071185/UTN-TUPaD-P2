/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;

/*

13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.

*/
public class ejercicio13 {
   public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios Originales");
        mostrarPreciosRecursivo(precios, 0);
        precios[2]= 129.99;
        System.out.println("");
        System.out.println("Precios Modificados");
        mostrarPreciosRecursivo(precios, 0);
        
   }

    
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice < precios.length) { 
            
            System.out.println("Precio " +(indice+1)+": "  + precios[indice]);
            mostrarPreciosRecursivo(precios, indice + 1);
        }
    }
    
    
    
}
