/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio8;


public class FirmaDigital {
    
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

       
    

    @Override
    public String toString() {
        return "Codigo Hash: " + codigoHash + ", Fecha: " + fecha;
    }
    
    
    
}
