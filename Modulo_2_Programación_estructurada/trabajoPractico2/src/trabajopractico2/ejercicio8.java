/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;

import java.util.Scanner;

/*
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio base de su producto:  ");
        double precioBase = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de impuestos (Ejemplo: 10 para 10%): ");
        double porcImpuesto = entrada.nextDouble() / 100;
        System.out.println("Ingrese el porcentaje de descuento (Ejemplo: 5 para 5%): ");
        double porcDescuento = entrada.nextDouble() / 100;

        double resultado = calcularPrecioFinal(precioBase, porcDescuento, porcImpuesto);
        System.out.println("Precio final: $" + (int) resultado);

    }

    static Double calcularPrecioFinal(double precioBase, double porcImpuesto, double porcDescuento) {
        double impuesto = precioBase * porcImpuesto;
        double descuento = precioBase * porcDescuento;
        double precioFinal = precioBase + impuesto - descuento;
        return precioFinal;

    }
}
