/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio10;
/*
10. CuentaBancaria - ClaveSeguridad - Titular
a. Composición: CuentaBancaria → ClaveSeguridad
b. Asociación bidireccional: CuentaBancaria ↔ Titular
Clases y atributos:
i. CuentaBancaria: cbu, saldo
ii. ClaveSeguridad: codigo, ultimaModificacion
iii. Titular: nombre, dni.
*/
public class Ejercicio10 {

    
    public static void main(String[] args) {
        Titular titular1 = new Titular("Carlos Rodriguez", "30123456");
        
        CuentaBancaria cuenta1 = new CuentaBancaria(
            "12345678901234567890",
            150000.50,
            "1234",
            "2024-05-15",
            titular1
        );
        
        System.out.println("=== CUENTA BANCARIA ===");
        System.out.println(cuenta1);
        
        
        System.out.println("Desde cuenta a titular: " + cuenta1.getTitular().getNombre());
        System.out.println("Desde titular a cuenta: " + titular1.getCuenta().getCbu());
    }

    
    
}
