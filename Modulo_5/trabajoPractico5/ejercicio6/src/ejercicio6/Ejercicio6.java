/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio6;
/*
6. Reserva - Cliente - Mesa
a. Asociación unidireccional: Reserva → Cliente
b. Agregación: Reserva → Mesa
Clases y atributos:
i. Reserva: fecha, hora
ii. Cliente: nombre, telefono
iii. Mesa: numero, capacidad
*/
public class Ejercicio6 {

    public static void main(String[] args) {
        Mesa mesaElegida = new Mesa(2, "Capacidad: 4 personas");
        Cliente cliente1 = new Cliente("Gabriel Etchegoyen", 3489650663L);
        Reserva reserva1 = new Reserva("12/12/31", "19:00 PM", mesaElegida);
        reserva1.setCliente(cliente1);
        System.out.println(reserva1);
       
    }
    
}
