/*
Trabajo Practico N° 5; Relaciones UML 1 a 1
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package ejercicio9;
/*
9. CitaMédica - Paciente - Profesional
a. Asociación unidireccional: CitaMédica → Paciente,
b. Asociación unidirecciona: CitaMédica → Profesional
Clases y atributos:
i. CitaMédica: fecha, hora
ii. Paciente: nombre, obraSocial
iii. Profesional: nombre, especialidad
*/
public class Ejercicio9 {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Maria Lopez", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Garcia", "Cardiologia");
        
        CitaMedica cita1 = new CitaMedica(
            "2024-05-20", 
            "10:30", 
            paciente1, 
            profesional1
        );
        
        System.out.println("=== Cita Medica ===");
        System.out.println(cita1);
        
        System.out.println("\n--- Informacion  ---");
        System.out.println("Paciente: " + cita1.getPaciente().getNombre());
        System.out.println("Profesional: " + cita1.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita1.getProfesional().getEspecialidad());
    }
        
}
