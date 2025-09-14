/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio8;

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario){
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital= new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    @Override
    public String toString() {
        return "Documento: "+ titulo + ", Contenido: " + contenido + 
               ", " + firmaDigital ;
    }
    
}
