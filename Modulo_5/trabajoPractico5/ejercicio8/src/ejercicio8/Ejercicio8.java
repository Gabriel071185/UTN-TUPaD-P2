/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio8;
/*
8. Documento - FirmaDigital - Usuario
a. Composición: Documento → FirmaDigital
b. Agregación: FirmaDigital → Usuario
Clases y atributos:
i. Documento: titulo, contenido
ii. FirmaDigital: codigoHash, fecha
iii. Usuario: nombre, email
*/
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Gabriel", "gaby@gmail.com");
        Documento doc1 = new Documento("Inteligencia Artificial", 
            "La IA esta transformando el mundo...", 
            "18459273",  
            "2024-05-15",user1 
        );
        
        System.out.println(doc1);
        System.out.println("Documento completo:");
        System.out.println(doc1);
        
        System.out.println("\n--- Informacion usuario ---");
        
        Usuario usuarioFirmante = doc1.getFirmaDigital().getUsuario();
        System.out.println("Usuario: " + usuarioFirmante);
        System.out.println("Nombre: " + usuarioFirmante.getNombre());
        System.out.println("Email: " + usuarioFirmante.getEmail());     
        
    }
    
}
