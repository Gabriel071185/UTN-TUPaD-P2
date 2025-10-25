/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;
/*
Parte 1: Interfaces en un sistema de E-commerce
1. Crear una interfaz Pagable con el método calcularTotal().
2. Clase Producto: tiene nombre y precio, implementa Pagable.
3. Clase Pedido: tiene una lista de productos, implementa Pagable y calcula el
total del pedido.
4. Ampliar con interfaces Pago y PagoConDescuento para distintos medios de
pago (TarjetaCredito, PayPal), con métodos procesarPago(double) y
aplicarDescuento(double).
5. Crear una interfaz Notificable para notificar cambios de estado. La clase
Cliente implementa dicha interfaz y Pedido debe notificarlo al cambiar de
estado.
*/
public class Ejercicio1 {

    
   public static void main(String[] args) {
               
        // 1. Crear cliente
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");
        System.out.println("Cliente creado: " + cliente.getNombre());
        
        // 2. Crear productos
        Producto laptop = new Producto("Laptop Gaming", 1200.0);
        Producto mouse = new Producto("Mouse Inalambrico", 45.0);
        Producto teclado = new Producto("Teclado Mecanico", 89.0);
        
        System.out.println("\nProductos creados:");
        System.out.println("- " + laptop.getNombre() + ": $" + laptop.calcularTotal());
        System.out.println("- " + mouse.getNombre() + ": $" + mouse.calcularTotal());
        System.out.println("- " + teclado.getNombre() + ": $" + teclado.calcularTotal());
        
        // 3. Crear pedido y asignar cliente
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        
        // 4. Agregar productos al pedido
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);
        pedido.agregarProducto(teclado);
        
                
        // 5. Mostrar total del pedido
        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);
        
        // 6. Cambiar estado del pedido (debe notificar al cliente)
        System.out.println("\n--- Notificacion del estado del pedido al cliente ---");
        pedido.cambiarEstado("CONFIRMADO");
        pedido.cambiarEstado("EN PREPARACION");
        
        // 7. Probar medios de pago
        // Tarjeta de crédito (implementa Pago y PagoConDescuento)
        TarjetaCredito tarjeta = new TarjetaCredito("4321-8765-1098-7654");
        tarjeta.procesarPago(total);
        tarjeta.aplicarDescuento(15.0); // 15% de descuento
        
        // PayPal (implementa solo Pago)
        PayPal paypal = new PayPal("juan.perez@empresa.com");
        paypal.procesarPago(total);
        
        // 8. Cambiar estado final
        System.out.println("Gracias por esperar su pedido se encuentra: ");
        pedido.cambiarEstado("ENVIADO"); 
        System.out.println("\n=== PRUEBA COMPLETADA ===");
    }
}
