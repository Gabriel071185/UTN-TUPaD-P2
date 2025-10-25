/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;
/*
4. TarjetaDeCrédito - Cliente - Banco
a. Asociación bidireccional: TarjetaDeCrédito ↔ Cliente
b. Agregación: TarjetaDeCrédito → Banco
Clases y atributos:
i. TarjetaDeCrédito: numero, fechaVencimiento
ii. Cliente: nombre, dni
iii. Banco: nombre, cuit
*/
public class Ejercicio4 {

       public static void main(String[] args) {
        Banco banco1 = new Banco("Santander", 30918456);   
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(987654321, "04/31", banco1);
        Cliente cliente1 = new Cliente("Gabriel Etchegoyen", 31912832);
        tarjeta1.setCliente(cliente1);
        System.out.println(tarjeta1.getCliente());
        System.out.println(cliente1.getTarjetaDeCredito());
        System.out.println(banco1);
        
        }
    
}
