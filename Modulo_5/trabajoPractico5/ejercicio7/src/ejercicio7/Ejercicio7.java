/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio7;

/*
7. Vehículo - Motor - Conductor
a. Agregación: Vehículo → Motor
b. Asociación bidireccional: Vehículo ↔ Conductor
Clases y atributos:
i. Vehículo: patente, modelo
ii. Motor: tipo, numeroSerie
iii. Conductor: nombre, licencia
*/
public class Ejercicio7 {

    public static void main(String[] args) {
        Motor motor1 = new Motor("Benelli 500cc", 123123123);
        Vehiculo vehiculo1 = new Vehiculo("A160UQQ", "Bicilindrico", motor1 );
        Conductor conductor1 = new Conductor("Gabriel Etchegoyen", true);
        conductor1.setVehiculo(vehiculo1);
        System.out.println(vehiculo1);
        System.out.println("Conductor del vehiculo: "+ vehiculo1.getConductor());
        
        
    }
    
}
