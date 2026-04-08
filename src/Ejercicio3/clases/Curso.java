package laboratorio.clases;

import java.util.Vector;

public class Curso {
	
	private String nombre;
	
	private Vector<Alumno> alumnos = new Vector<Alumno>();
	
	private final int cantTotClases;
	
	private int cantClasDict;
	
	private static double porcAsisAprob = 75;
	
	private Profesor profesor;
	
	public Curso(int cantTotClases, String nombre, Profesor p) {
		this.cantTotClases = cantTotClases;
		this.setNombre(nombre);
		this.setProfesor(p);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Alumno> getAlumnos() {
		return alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	private void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public void addAlumno(Alumno alumno) {
		if(alumno != null) {
			alumnos.add(alumno);
		}
	}
	
	private String CalcularPorcAsis(int cantAsis)
	{
		double porcAsis = (double)cantAsis / this.getCantTotClases() * 100;
		if(porcAsis >= porcAsisAprob)
		{
			return "Aprobado";
		}
		return "Desaprobado";
	}
	
	public int getCantTotClases() {
		return cantTotClases;
	}
	
	public int DarClase() {
		cantClasDict++;
		return this.getCantClasDict();
	}

	public void ImprimirResumenFinal() {
		System.out.println("Nombre del Curso: " + this.getNombre());
		System.out.println("===============================================================");
		System.out.println("Cantidad De Clases: " + this.getCantTotClases());
		System.out.println("===============================================================");
		System.out.println("Profesor: " + this.profesor.getApellido() + "," + this.profesor.getNombre() + "- Legajo:" + profesor.getNroLegajo());
		System.out.println("===============================================================");
		for(Alumno a:this.alumnos) {
			System.out.println("Alumno: " + a.getApellido() + ", " + a.getNombre() + " - DNI:" + a.getDni() + " - Estado: " + this.CalcularPorcAsis(a.getCantClasAsist()));
		}
	}
	
	public void ImprimirPorClase()
	{
		System.out.println("Nombre del Curso: " + this.getNombre());
		System.out.println("===============================================================");
		System.out.println("Cantidad De Clases: " + this.getCantTotClases());
		System.out.println("===============================================================");
		System.out.println("Clases Dictadas: " + this.getCantClasDict());
		System.out.println("===============================================================");
		System.out.println("Profesor: " + this.profesor.getApellido() + "," + this.profesor.getNombre() + "- Legajo:" + profesor.getNroLegajo());
		System.out.println("===============================================================");
		for(Alumno a:this.alumnos) {
			System.out.println("Alumno: " + a.getApellido() + ", " + a.getNombre() + " - DNI:" + a.getDni());
		}
	}

	public int getCantClasDict() {
		return cantClasDict;
	}

}
