/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;
import java.util.Scanner;
/*

11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.


*/

public class ejercicio11 {
    
    static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        calcularDescuentoEspecial(precio);
        
        
    }
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = DESCUENTO_ESPECIAL * 100;
        double precioFinal = precio - (precio * DESCUENTO_ESPECIAL);
        System.out.println("Descuento especial aplicado: %" + (int) descuentoAplicado);
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }
}
