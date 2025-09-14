/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package Ejercicio1;


public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    
    
    public Pasaporte(String numero, String fechaEmision,String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen,formato);
    }
    public String getNumero() {
        return numero;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this); 
        }
    }
   
    @Override
    public String toString() {
        String infoTitular = (titular != null) ? 
            "Titular: " + titular.getNombre() + " (DNI: " + titular.getDni() + ")" : 
            "Sin titular asignado";
        
        return "Pasaporte: " + numero +
               "\nFecha Emision: " + fechaEmision +
               "\nFoto: " + foto.getImagen() + " (" + foto.getFormato() + ")" +
               "\n" + infoTitular;
    }
    
}
