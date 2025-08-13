/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;

import java.util.Scanner;

/*9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = entrada.nextDouble();
        System.out.println("Ingreso el peso del paquete en kg(Ejemplo: 50): ");
        double peso = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = entrada.nextLine();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo de envio es: $"+ (int)costoEnvio);
        System.out.println("Total a pagar: $" + (int) total);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        } else {
            System.out.println("Zona no válida. Use 'Nacional' o 'Internacional'.");
        }
        return costoEnvio;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double costoTotal = precioProducto + costoEnvio;
        return costoTotal;
    }

}
