/*
Trabajo Practico N° 2: Programación Estructurada
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
 */
package trabajopractico2;
import java.util.Scanner;

/*
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
 */
public class ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = entrada.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = entrada.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = entrada.nextInt();

        int stockActualizado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + stockActualizado);
    }

    public static int actualizarStock(int x, int y, int z) {
        int nuevoStock = x - y + z;
        return nuevoStock;
    }
}
