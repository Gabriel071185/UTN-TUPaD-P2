/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2;


public class Celular {
    
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(int imei, String marca, String modelo, Bateria bateria){
        this.imei= imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public int getImei() {
        return imei;
    }
    
    public void setImei(int imei) {
        this.imei = imei;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Bateria getBateria() {
        return bateria;
    }
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
        
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + 
                ", modelo= " + " " +  modelo +" , "+ bateria + '}';
    }
}
