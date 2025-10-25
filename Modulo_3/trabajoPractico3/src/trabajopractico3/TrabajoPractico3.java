/*
Trabajo Practico N° 3: Introduccion a POO
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package trabajopractico3;

/*
Clase principal donde se instancian y prueban todos los objetos de los ejercicios del trabajo práctico:
 * 1. RegistroEstudiante 
 * 2. Mascota 
 * 3. Libro 
 * 4. Gallina
 * 5. Nave Espacial
*/
public class TrabajoPractico3 {

    
    public static void main(String[] args) {
        // Ejercicio 1: creando una instancia de la clase RegistroEstudiante y llamando a sus métodos
        
        System.out.println("Ejercicio 1:");
        
        RegistroEstudiante estudiante = new RegistroEstudiante("Ana", "Garcia", "Matematicas", 80);
        estudiante.mostrarInfo();// Tiene 80 de calificacion
        estudiante.subirCalificacion(10); 
        estudiante.mostrarInfo();// ahora tiene 90
        estudiante.bajarCalificacion(5);  
        estudiante.mostrarInfo();// ahora tiene 85
        
        System.out.println("\n---------------------------------------------------");
        
        // Ejercicio 2
        
        System.out.println("Ejercicio 2:");
        Mascota miMascota = new Mascota("Firulais", "Perro", 3);
        // Mostrar información inicial usando el metodo mostrarInfoMascota
        System.out.println("Informacion inicial:");
        miMascota.mostrarInfoMascota();
        // Simular el paso del tiempo usando el metodo cumplirAnios
        System.out.println("Simulando paso del tiempo...");
        miMascota.cumplirAnios();
        miMascota.mostrarInfoMascota();
        
        System.out.println("\n---------------------------------------------------");
        
        
        //Ejercicio 3
        
        System.out.println("Ejercicio 3:");
        Libro libro = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", 1967); 
        libro.mostrarInfoLibro();
        // Probando setters de año de publicacion un valor no válido
        libro.setAnioPublicacion(-100);
        // Ingrese de año valido con setter
        libro.setAnioPublicacion(1991);
        libro.mostrarInfoLibro();
        
        //Getters
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año: " + libro.getAnioPublicacion());
        
        System.out.println("\n---------------------------------------------------");
        
        // Ejercicio 4
        
        System.out.println("Ejercicio 4:");
        Gallina gallina1 = new Gallina(1, 6);  // Gallina  con id #1 de 6 meses
        Gallina gallina2 = new Gallina(2, 3);  // Gallina con id #2 de 3 meses
        // Usamos los metodos de envejecer y poner huevos simulando del dia 1 al 30
        System.out.println("\n=== ESTADO INICIAL ===");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        System.out.println("\n=== SIMULANDO ACCIONES ===");
        System.out.println("--- Dia 1 ---");
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        System.out.println("\n--- Dia 2 ---");
        gallina1.ponerHuevo();
        gallina2.envejecer();  // Gallina 2 suma edad
        System.out.println("\n--- Dia 30 ---");
        gallina1.envejecer();  // Gallina 1 suma edad
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        
        System.out.println("\n=== ESTADO FINAL ===");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    
        System.out.println("\n---------------------------------------------------");
    
        //Ejercicio 5
        
        System.out.println("\nEjercicio 5:");
        
        //Nombramos a la nave y su combustible inicial
        NaveEspacial nave = new NaveEspacial("Explorer", 50);
        nave.mostrarEstado();
        
        // Intentar despegar
        nave.despegar();
        
        // Intentar avanzar sin recargar (debería fallar)
        System.out.println("\nIntentando avanzar 120 km...");
        nave.avanzar(120);
        nave.mostrarEstado();
        
        // Recargar combustible
        System.out.println("\nRecargando combustible...");
        nave.recargarCombustible(40);
        nave.mostrarEstado();
        
        // Intentar avanzar después de recargar (debería funcionar)
        System.out.println("\nIntentando avanzar 120 km despues de recargar...");
        nave.avanzar(120);
        nave.mostrarEstado();
    
    }
    
        
}
