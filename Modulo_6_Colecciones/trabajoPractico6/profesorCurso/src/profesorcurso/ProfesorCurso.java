/*
Trabajo Practico N° 6: Colecciones y Sistema de Stock
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package profesorcurso;
/*
Caso Práctico 3

Descripción general

Se debe modelar un sistema académico donde un Profesor dicta muchos Cursos y
cada Curso tiene exactamente un Profesor responsable. La relación Profesor–
Curso es bidireccional:
• Desde Curso se accede a su Profesor.
• Desde Profesor se accede a la lista de Cursos que dicta.
Además, existe la clase Universidad que administra el alta/baja y consulta
de profesores y cursos.
Invariante de asociación: cada vez que se asigne o cambie el profesor de un curso,
debe actualizarse en los dos lados (agregar/quitar en la lista del profesor
correspondiente).

Tareas a realizar

1. Crear al menos 3 profesores y 5 cursos.
2. Agregar profesores y cursos a la universidad.
3. Asignar profesores a cursos usando asignarProfesorACurso(...).
4. Listar cursos con su profesor y profesores con sus cursos.
5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
7. Remover un profesor y dejar profesor = null,
8. Mostrar un reporte: cantidad de cursos por profesor.
*/


public class ProfesorCurso {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA UNIVERSITARIO ===\n");
        
        // 1. Crear una universidad
        Universidad universidad = new Universidad("UTN - Facultad Regional Buenos Aires");
        
        // 2. Crear al menos 3 profesores
        Profesor prof1 = new Profesor("P001", "Ana Garcia", "Programacion");
        Profesor prof2 = new Profesor("P002", "Carlos Lopez", "Base de Datos");
        Profesor prof3 = new Profesor("P003", "Maria Rodriguez", "Redes");
        
        // 3. Crear 5 cursos
        Curso curso1 = new Curso("C001", "Programacion II");
        Curso curso2 = new Curso("C002", "Base de Datos I");
        Curso curso3 = new Curso("C003", "Redes y Comunicaciones");
        Curso curso4 = new Curso("C004", "Estructura de Datos");
        Curso curso5 = new Curso("C005", "Programacion Avanzada");
        
        // 4. Agregar profesores y cursos a la universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        System.out.println("=== TAREA 1: PROFESORES Y CURSOS CREADOS ===\n");
        
        // 5. Asignar profesores a cursos usando asignarProfesorACurso(...)
        System.out.println("=== TAREA 2: ASIGNANDO PROFESORES A CURSOS ===");
        universidad.asignarProfesorACurso("C001", "P001"); // Ana -> Programación II
        universidad.asignarProfesorACurso("C002", "P002"); // Carlos -> Base de Datos I
        universidad.asignarProfesorACurso("C003", "P003"); // María -> Redes
        universidad.asignarProfesorACurso("C004", "P001"); // Ana -> Estructura de Datos
        universidad.asignarProfesorACurso("C005", "P001"); // Ana -> Programación Avanzada
        
        System.out.println();
        
        // 6. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("=== TAREA 3: LISTANDO CURSOS ===");
        universidad.listarCursos();
        
        System.out.println("\n=== TAREA 4: LISTANDO PROFESORES ===");
        universidad.listarProfesores();
        
        // 7. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados
        System.out.println("=== TAREA 5: CAMBIANDO PROFESOR DE CURSO ===");
        System.out.println("Antes del cambio - Curso C004:");
        curso4.mostrarInfo();
        System.out.println("\nProfesor Carlos Lopez antes del cambio:");
        prof2.listarCursos();
        
        // Cambiar profesor del curso C004 de Ana a Carlos
        universidad.asignarProfesorACurso("C004", "P002");
        
        System.out.println("\nDespues del cambio - Curso C004:");
        curso4.mostrarInfo();
        System.out.println("\nProfesor Ana Garcia despues del cambio:");
        prof1.listarCursos();
        System.out.println("\nProfesor Carlos López despues del cambio:");
        prof2.listarCursos();
        
        // 8. Remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("=== TAREA 6: ELIMINANDO CURSO ===");
        System.out.println("Antes de eliminar - Profesor Ana Garcia:");
        prof1.listarCursos();
        
        universidad.eliminarCurso("C005");
        
        System.out.println("\nDespues de eliminar - Profesor Ana Garcia:");
        prof1.listarCursos();
        
        // 9. Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("=== TAREA 7: ELIMINANDO PROFESOR ===");
        System.out.println("Antes de eliminar profesor - Curso C003:");
        curso3.mostrarInfo();
        
        universidad.eliminarProfesor("P003");
        
        System.out.println("\nDespues de eliminar profesor - Curso C003:");
        curso3.mostrarInfo();
        
        // 10. Mostrar un reporte: cantidad de cursos por profesor
        System.out.println("=== TAREA 8: REPORTE FINAL ===");
        universidad.mostrarReporteCursosPorProfesor();
        
        // Verificación adicional de la sincronización bidireccional
        System.out.println("\n=== VERIFICACIoN DE SINCRONIZACIÓN BIDIRECCIONAL ===");
        
        // Crear un curso y profesor nuevos para probar la relación directa
        Profesor profTest = new Profesor("P999", "Profesor Test", "Testing");
        Curso cursoTest = new Curso("C999", "Curso Test");
        
        // Agregar a la universidad
        universidad.agregarProfesor(profTest);
        universidad.agregarCurso(cursoTest);
        
        // Probar la asignación directa desde el curso
        System.out.println("\nAsignando profesor desde el curso:");
        cursoTest.setProfesor(profTest);
        
        System.out.println("Desde el profesor:");
        profTest.listarCursos();
        System.out.println("Desde el curso:");
        cursoTest.mostrarInfo();
        
        // Probar la asignación directa desde el profesor
        System.out.println("\nCreando otro curso y asignando desde el profesor:");
        Curso cursoTest2 = new Curso("C888", "Curso Test 2");
        universidad.agregarCurso(cursoTest2);
        
        profTest.agregarCurso(cursoTest2);
        
        System.out.println("Desde el profesor:");
        profTest.listarCursos();
        System.out.println("Desde el curso:");
        cursoTest2.mostrarInfo();
        
        System.out.println("\n=== SISTEMA FINALIZADO ===");
    }
}
