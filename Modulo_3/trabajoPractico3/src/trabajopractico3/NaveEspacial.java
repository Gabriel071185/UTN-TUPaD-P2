/*
Trabajo Practico N° 3: Introduccion a POO
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico3;

/*
5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
 */
public class NaveEspacial {
    
    private String nombre;
    private double combustible;
    private final double COMBUSTIBLE_MAXIMO = 100.0;
    
    
    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar() {
        System.out.println(nombre + " esta despegando...");
    }
    
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5; 
        
        if (combustibleNecesario <= combustible) {
            combustible -= combustibleNecesario;
            System.out.println("Avanzando " + distancia + " km. Combustible usado: " + combustibleNecesario);
        } else {
            System.out.println("Error: No hay suficiente combustible para avanzar " + distancia + " km");
            System.out.println("Combustible necesario: " + combustibleNecesario);
            System.out.println("Combustible disponible: " + combustible);
        }
    }
    
    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
            System.out.println("Recargadas " + cantidad + " unidades de combustible");
        } else {
            double sobra = (combustible + cantidad) - COMBUSTIBLE_MAXIMO;
            combustible = COMBUSTIBLE_MAXIMO;
            System.out.println("Solo se recargaron " + (cantidad - sobra) + " unidades (límite máximo alcanzado)");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("--- Estado de " + nombre + " ---");
        System.out.println("Combustible: " + combustible + "/" + COMBUSTIBLE_MAXIMO);
        System.out.println("------------------------");
    }
    
    
}
