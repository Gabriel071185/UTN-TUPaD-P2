/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio13;

public class GeneradorQR {
    
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Generando codigo QR...");
        System.out.println("Valor: " + valor);
        System.out.println("Para usuario: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Codigo QR generado exitosamente!");
        System.out.println("---------------------------");
        
        return new CodigoQR(valor, usuario);
    }
    
    public void mostrarInfo(CodigoQR codigoQR) {
        System.out.println("Informacion del Codigo QR:");
        System.out.println("- Valor: " + codigoQR.getValor());
        System.out.println("- Usuario: " + codigoQR.getUsuario().getNombre());
        System.out.println("- Email: " + codigoQR.getUsuario().getEmail());
    }
}
