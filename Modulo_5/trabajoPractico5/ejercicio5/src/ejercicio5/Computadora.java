/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio5;

public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre infoPlaca;
    private Propietario propietario;
    

    public Computadora(String marca, int numeroSerie,String modelo,String chipset ) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.infoPlaca = new PlacaMadre(modelo, chipset);
        
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
           propietario.setComputadora(this); 
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }
    
    public Propietario getPropietario(){
        return propietario;
    }    

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" +
                numeroSerie + ", infoPlaca=" + infoPlaca +'}';
    }
    
     
    
    
}
