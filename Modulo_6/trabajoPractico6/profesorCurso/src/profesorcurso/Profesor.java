/*
Trabajo Practico N° 6: Colecciones y Sistema de Stock
Tecnicatura Universitaria en programación UTN
Materia: Programación 2
Estudiante: Etchegoyen Gabriel
*/
package profesorcurso;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            this.cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }

    
    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            this.cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }

    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no tiene cursos asignados.");
        } else {
            System.out.println("Cursos del profesor " + nombre + ":");
            for (Curso curso : cursos) {
                System.out.println(" - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }

    
    public void mostrarInfo() {
        System.out.println("Profesor ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos asignados: " + cursos.size());
        listarCursos();
    }

    
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }
}