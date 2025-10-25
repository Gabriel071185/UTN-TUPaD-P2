/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente; // Referencia al cliente para notificar
    
    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }
    
    // Método para asignar un cliente al pedido
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    // Método para cambiar estado y notificar
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
        }
    }
    
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    // Getter para estado
    public String getEstado() {
        return estado;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
}