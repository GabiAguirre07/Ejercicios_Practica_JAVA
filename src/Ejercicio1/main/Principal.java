package laboratorio.main;

import laboratorio.clases.Alumno;
import laboratorio.clases.Curso;
import laboratorio.clases.Profesor;

public class Principal {

	public static void main(String[] args) {

	 Profesor p = new Profesor();
	 p.setApellido("Gimenez");
	 p.setNroLegajo("18934");
	 
	 Alumno a1 = new Alumno();
	 a1.setNombre("Gabriel");
	 a1.setApellido("Aguirre");
	 a1.setDni("47.891.543");
	 
	 Alumno a2 = new Alumno();
	 a2.setNombre("Pedro");
	 a2.setApellido("Gonzalez");
	 a2.setDni("44.831.513");
	 
	 Curso curso = new Curso();
	 curso.setNombre("Programación III");
	 curso.setProfesor(p);
	 curso.addAlumnos(a1);
	 curso.addAlumnos(a2);
	 
	 curso.Imprimir();	
	}

}
