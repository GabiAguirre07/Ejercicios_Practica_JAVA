package laboratorio.clases;

import java.util.Vector;

public class Curso {
	
	private String nombre;
	
	private Profesor profesor;
	
	private Vector<Alumno> alumnos;
	
	public Curso() {
		this.alumnos = new Vector<Alumno>();
	}
	
	public void addAlumnos(Alumno alumno){
		alumnos.add(alumno);
	}
	
	public void Imprimir() {
		System.out.println("Nombre del Curso: " + this.getNombre());
		System.out.println("===========================================");
		System.out.println("Profesor: " + this.profesor.getApellido() + " - Legajo:" + profesor.getNroLegajo());
		System.out.println("===========================================");
		for(Alumno a:this.alumnos) {
			System.out.println("Alumno: " + a.getApellido() + ", " + a.getNombre() + " - DNI:" + a.getDni());
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {	
		this.profesor = profesor;
	}

	public Vector<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Vector<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	}
