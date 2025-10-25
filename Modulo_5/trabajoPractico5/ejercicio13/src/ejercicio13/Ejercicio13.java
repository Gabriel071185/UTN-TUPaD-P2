/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio13;
/*
13. GeneradorQR - Usuario - CódigoQR
a. Asociación unidireccional: CódigoQR → Usuario
b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i. CodigoQR: valor.
ii. Usuario: nombre, email.
iii. GeneradorQR->método: void generar(String valor, Usuario usuario)
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana Torres", "ana.torres@email.com");
        Usuario usuario2 = new Usuario("Carlos Lopez", "carlos.lopez@email.com");
        
        GeneradorQR generador = new GeneradorQR();
        
        System.out.println("=== Generador de codigos QR ===");
        CodigoQR qr1 = generador.generar("https://www.miweb.com/ana", usuario1);
        CodigoQR qr2 = generador.generar("https://www.miweb.com/carlos", usuario2);
        
        System.out.println("\n=== Informacion de codigos generados ===");
        generador.mostrarInfo(qr1);
        System.out.println();
        generador.mostrarInfo(qr2);
        
        System.out.println("\n=== Acceso directo a cada objeto ===");
        System.out.println("QR1: " + qr1);
        System.out.println("QR2: " + qr2);
    }
}
