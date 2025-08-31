/*
Trabajo Practico N° 4; Programación Orientada a Objetos
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico4;

/*
Modelar una clase Empleado que represente a un trabajador en una empresa.
Esta clase debe incluir constructores sobrecargados, métodos sobrecargados y el uso
de atributos y métodos estáticos para llevar control de los objetos creados.
CLASE EMPLEADO
Atributos:
● int id: Identificador único del empleado.
● String nombre: Nombre completo.
● String puesto: Cargo que desempeña.
● double salario: Salario actual.
● static int totalEmpleados: Contador global de empleados creados.
*/
public class Empleado {
    
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados;
    private static int ultimoId = 0;
    
    //Constructor 1
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    //Constructor 2
    public Empleado(String nombre, String puesto){
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // salario por defecto
        totalEmpleados++;
    }
    
    // Método 1 actualizarSalario con porcentaje de aumento
    public void actualizarSalario(double porcentajeAumento) {
        this.salario = this.salario + (this.salario * porcentajeAumento / 100);
    }
    
    // Método 2 actualizarSalario con aumento fijo
    public void actualizarSalario(int aumentoFijo) {
        this.salario = this.salario + aumentoFijo;
    }
  
    // Método toString
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto + ", Salario: $" + salario;
    }
    // Método estático mostrarTotalEmpleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    
}
