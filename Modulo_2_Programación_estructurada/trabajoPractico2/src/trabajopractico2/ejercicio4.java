/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico2;
import java.util.Scanner;

/*4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
*/
public class ejercicio4 {
    
static final double DESCUENTOA = 0.10;
static final double DESCUENTOB = 0.15;
static final double DESCUENTOC = 0.30;
  
          
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingrese el precio del producto:  ");
      int precio = entrada.nextInt();
      entrada.nextLine();
      System.out.print("Ingrese la categoria del producto ( A, B, o C):   ");
      String categoria = entrada.nextLine().toUpperCase();
      double precioFinal = 0; 
      
      switch( categoria ){
          case "A":
              precioFinal = precio * (1 - DESCUENTOA);
              System.out.println("El valor de su producto es de: $"+ precio + " y su descuento es del %" + (int)(DESCUENTOA*100) + ". El precio final es de: "+ precioFinal);
          break;
          case "B":
              precioFinal = precio * (1 - DESCUENTOB);
              System.out.println("El valor de su producto es de: "+ precio + " y su descuento es del %" + (int)(DESCUENTOA*100) + ". El precio final es de: "+ precioFinal);
          break;
          case "C":
              precioFinal = precio * (1 - DESCUENTOC);
              System.out.println("El valor de su producto es de: "+ precio + " y su descuento es del %" + (int)(DESCUENTOA*100) + ". El precio final es de: $"+ precioFinal );
          break;
          default:
              System.out.println("La categoria no existe! ");
      }
    
       
        
    }  
}
