/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio7;


public class Conductor {
    
    private String nombre;
    private boolean licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if(vehiculo != null && vehiculo.getConductor()!= this){
            vehiculo.setConductor(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Licencia: " + licencia + '}';
    }
    
    
    
    
}
