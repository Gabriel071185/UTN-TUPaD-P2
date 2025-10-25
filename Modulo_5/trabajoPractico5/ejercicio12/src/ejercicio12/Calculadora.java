/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio12;

public class Calculadora {
    
    public void calcular(Impuesto impuesto) {
        double iva = impuesto.getMonto() * 0.21;
        double total = impuesto.getMonto() + iva;
        
        System.out.println("=== CALCULO DE IMPUESTO ===");
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("IVA (21%): $" + iva);
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("---------------------------");
    }
    
    public void mostrarInfo(Impuesto impuesto) {
        System.out.println("Informacion del impuesto:");
        System.out.println("- Monto: $" + impuesto.getMonto());
        System.out.println("- Contribuyente: " + impuesto.getContribuyente());
    }
}
