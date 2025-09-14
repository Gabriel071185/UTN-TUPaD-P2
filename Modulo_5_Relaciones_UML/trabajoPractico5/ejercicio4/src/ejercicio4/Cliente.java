/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio4;

public class Cliente {
    
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
        
    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta ){
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente()!= this){
            tarjeta.setCliente(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    
    
    public TarjetaDeCredito getTarjetaDeCredito(){
        return tarjeta;
    } 
    
    

    @Override
    public String toString() {
        return "\nCliente Nombre: " + nombre + ", DNI: " + dni ;
    }
    
    
}
