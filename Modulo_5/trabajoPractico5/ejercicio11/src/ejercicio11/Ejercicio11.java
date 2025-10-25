/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio11;
/*
11. Reproductor - Canción - Artista
a. Asociación unidireccional: Canción → Artista
b. Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos:
i. Canción: titulo.
ii. Artista: nombre, genero.
iii. Reproductor->método: void reproducir(Cancion cancion)
*/
public class Ejercicio11 {

   
    public static void main(String[] args) {
        Artista artista1 = new Artista("Divididos", "Rock Nacional");
        Cancion track1 = new Cancion("Sabado", artista1);
        
        Artista artista2 = new Artista("Calamaro", "Rock");
        Cancion track2 = new Cancion("Flaca", artista2);
            
        Reproductor reproductor = new Reproductor();
        
        System.out.println("=== REPRODUCTOR MUSICAL ===");
        reproductor.reproducir(track1);
        reproductor.reproducir(track2);
            

    }
    
}
