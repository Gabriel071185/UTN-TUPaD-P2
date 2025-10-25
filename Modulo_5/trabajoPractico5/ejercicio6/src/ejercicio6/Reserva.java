/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio6;

public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "Fecha: " + fecha + ", Hora: " + hora +
                ", Cliente--> " + cliente + "\nInformacion mesa: " + mesa +'}';
    }
    
    
}
