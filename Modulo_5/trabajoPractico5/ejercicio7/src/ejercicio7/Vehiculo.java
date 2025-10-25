/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio7;


public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo , Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    
    
    @Override
    public String toString() {
        return "Datos del vehiculo: " + "Patente: " + patente + ", Modelo: " 
                + modelo +" ,"+ motor;
    }
           
}
