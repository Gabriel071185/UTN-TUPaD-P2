/*
Trabajo Practico N° 8: Interfaces y excepciones
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio1;


public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombre + " (" + email + "): " + mensaje);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
