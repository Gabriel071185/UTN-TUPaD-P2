/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio2;

/*
2. Celular - Batería - Usuario
a. Agregación: Celular → Batería
b. Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i. Celular: imei, marca, modelo
ii. Batería: modelo, capacidad
iii. Usuario: nombre, dni
*/

public class Ejercicio2 {

    
    public static void main(String[] args) {
        // Crear objetos
        Bateria bateria = new Bateria("Litio", "1500mah"); 
        Usuario usuario = new Usuario("Carlos", "12345678A");
        Celular celular = new Celular(987654321, "Samsung", "Galaxy S22", bateria);
        // Establecer relación bidireccional 
        usuario.setCelular(celular);
        // Verificar la relación
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca());
        System.out.println("Usuario del celular: " + celular.getUsuario().getNombre());
        // Datos del celular
        System.out.println(celular);
        
    }
    
}
