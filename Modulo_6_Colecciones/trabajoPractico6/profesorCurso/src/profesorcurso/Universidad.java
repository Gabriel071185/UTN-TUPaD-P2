/*
Trabajo Practico N° 6: Colecciones y Sistema de Stock
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package profesorcurso;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    
    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }

    
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("No se pudo asignar: curso o profesor no encontrado.");
        }
    }

    
    public void listarProfesores() {
        System.out.println("=== PROFESORES DE " + nombre.toUpperCase() + " ===");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            System.out.println("-------------------");
        }
    }

    
    public void listarCursos() {
        System.out.println("=== CURSOS DE " + nombre.toUpperCase() + " ===");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
            System.out.println("-------------------");
        }
    }

    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }

    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso " + codigo + " eliminado correctamente.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor " + id + " eliminado correctamente.");
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
        }
    }

    
    public String getNombre() { return nombre; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Curso> getCursos() { return cursos; }
}