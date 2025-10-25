/*
Trabajo Practico N° 7: Herencia y Polimorfismo
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio3;
/*

3. Empleados y polimorfismo
● Clase abstracta: Empleado con método calcularSueldo()
● Subclases: EmpleadoPlanta, EmpleadoTemporal
● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente,
usar instanceof para clasificar

*/

import java.util.ArrayList;
import java.util.List;


public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        
        // Agregar diferentes tipos de empleados
        empleados.add(new EmpleadoPlanta("Ana Garcia", "EMP001", 2500.0, 300.0));
        empleados.add(new EmpleadoTemporal("Carlos Lopez", "EMP002", 20.0, 160));
        empleados.add(new EmpleadoPlanta("Maria Rodríguez", "EMP003", 2800.0, 400.0));
        empleados.add(new EmpleadoTemporal("Pedro Martinez", "EMP004", 18.5, 120));
        
        // Calcular sueldos polimórficamente y clasificar con instanceof
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        System.out.println("=== SUELDOS DE EMPLEADOS ===");
        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSueldo();
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("ID: " + empleado.getId());
            System.out.println("Sueldo: $" + sueldo);
            
            // Clasificar usando instanceof
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
                contadorPlanta++;
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
                contadorTemporal++;
            }
            
            System.out.println("--------------------");
        }
        
        // Mostrar resumen
        System.out.println("=== RESUMEN ===");
        System.out.println("Total empleados de planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);
        System.out.println("Total general: " + empleados.size());
    }
}
