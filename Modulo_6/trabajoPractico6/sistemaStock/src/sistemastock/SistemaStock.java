/*
Trabajo Practico N° 6: Colecciones y Sistema de Stock
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package sistemastock;
/*
Caso Práctico 1

Descripción general
Se debe desarrollar un sistema de stock que permita gestionar productos en
una tienda, controlando su disponibilidad, precios y categorías. La información se
modelará utilizando clases, colecciones dinámicas y enumeraciones en Java. 

Tareas a realizar

1. Crear al menos cinco productos con diferentes categorías y agregarlos al
inventario.
2. Listar todos los productos mostrando su información y categoría.
3. Buscar un producto por ID y mostrar su información.
4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
5. Eliminar un producto por su ID y listar los productos restantes.
6. Actualizar el stock de un producto existente.
7. Mostrar el total de stock disponible.
8. Obtener y mostrar el producto con mayor stock.
9. Filtrar productos con precios entre $1000 y $3000.
10. Mostrar las categorías disponibles con sus descripciones. 

Nota: Cada tarea esta comentada al inicio de su codigo en el main.

*/

import java.util.List;

public class SistemaStock {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías
        Producto p1 = new Producto("P001", "Arroz", 250, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 1500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camiseta", 800, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sarten", 1200, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Laptop", 2800, 5, CategoriaProducto.ELECTRONICA);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("=== SISTEMA DE STOCK ===");

        // 2. Listar todos los productos
        System.out.println("\n--- Listado de todos los productos ---");
        inventario.listarProductos();

        // 3. Buscar un producto por ID
        System.out.println("--- Busqueda por ID: P003 ---");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar por categoría (ELECTRONICA)
        System.out.println("--- Productos de categoria ELECTRONICA ---");
        List<Producto> electronicos = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronicos) {
            p.mostrarInfo();
        }

        // 5. Eliminar un producto por ID
        System.out.println("--- Eliminar producto P002 ---");
        if (inventario.eliminarProducto("P002")) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Listar productos restantes
        System.out.println("--- Productos despues de eliminar ---");
        inventario.listarProductos();

        // 6. Actualizar stock de un producto
        System.out.println("--- Actualizar stock de P001 a 100 unidades ---");
        if (inventario.actualizarStock("P001", 100)) {
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 7. Mostrar total de stock disponible
        System.out.println("--- Total de stock en inventario ---");
        System.out.println("Total: " + inventario.obtenerTotalStock() + " unidades");

        // 8. Obtener producto con mayor stock
        System.out.println("--- Producto con mayor stock ---");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 9. Filtrar productos con precios entre $1000 y $3000
        System.out.println("--- Productos entre $1000 y $3000 ---");
        List<Producto> porPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : porPrecio) {
            p.mostrarInfo();
        }

        // 10. Mostrar categorías disponibles
        System.out.println("--- Categorias disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
