/*
Trabajo Practico N° 4; Programación Orientada a Objetos
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico4;


public class TrabajoPractico4 {
    /*TAREAS A REALIZAR
    1. Implementar la clase Empleado aplicando todos los puntos anteriores.
    2. Crear una clase de prueba con método main que:
    ○ Instancie varios objetos usando ambos constructores.
    ○ Aplique los métodos actualizarSalario() sobre distintos
    empleados.
    ○ Imprima la información de cada empleado con toString().
    ○ Muestre el total de empleados creados con
    mostrarTotalEmpleados().
     */
    public static void main(String[] args) {
        // Mostrar total inicial de empleados
        System.out.println("Total empleados inicial: " + Empleado.mostrarTotalEmpleados());
        System.out.println("----------------------------------");
        
        // Crear empleados usando diferentes constructores
        Empleado emp1 = new Empleado(1, "Ana Garcia", "Tech Lead", 2500.0);
        Empleado emp2 = new Empleado("Carlos Lopez", "Product Owner");
        Empleado emp3 = new Empleado("Maria Rodriguez", "Junior Java Developer");
        
        // Mostrar información de los empleados
        System.out.println("Empleado 1: " + emp1.toString());
        System.out.println("Empleado 2: " + emp2.toString());
        System.out.println("Empleado 3: " + emp3.toString());
        System.out.println("----------------------------------");
        
        // Mostrar total después de crear empleados
        System.out.println("Total empleados despues de crear: " + Empleado.mostrarTotalEmpleados());
        System.out.println("----------------------------------");
        
        // Aplicar aumentos de salario usando métodos sobrecargados
        System.out.println("Aplicando aumentos de salario...");
        
        // Aumento por porcentaje al empleado 1
        emp1.actualizarSalario(10.0); // 10% de aumento
        System.out.println("Empleado 1 despues de 10% de aumento: $" + emp1.salario);
        
        // Aumento fijo al empleado 2
        emp2.actualizarSalario(500); // $500 de aumento
        System.out.println("Empleado 2 despues de $500 de aumento: $" + emp2.salario);
        
        // Aumento porcentual y fijo al empleado 3
        emp3.actualizarSalario(15.0); // 15% de aumento
        emp3.actualizarSalario(200);  // $200 adicionales
        System.out.println("Empleado 3 despues de 15% + $200: $" + emp3.salario);
        System.out.println("----------------------------------");
        
        // Mostrar información final de todos los empleados
        System.out.println("Informacion general: ");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println("----------------------------------");
        
        System.out.println("Total de empleados en la empresa: " + Empleado.mostrarTotalEmpleados());
    }
    
}
