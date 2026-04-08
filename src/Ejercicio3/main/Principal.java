package laboratorio.main;

import laboratorio.clases.Alumno;
import laboratorio.clases.Curso;
import laboratorio.clases.Profesor;

public class Principal {

	public static void main(String[] args) {
     
	 String Apellido = "Gimenez";
	 String Nombre = "Francisco";
	 Long nroLegajo = 18934L;
	 Profesor p = new Profesor(Apellido,Nombre,nroLegajo);
	 
	 
	 Apellido = "Aguirre";
	 Nombre = "Gabriel";
	 Long dni = 47845649L;
	 Alumno a1 = new Alumno(Apellido,Nombre,dni);
	 
	 
	 Apellido = "Rodriguez";
	 Nombre = "Julian";
	 dni = 42835679L;
	 Alumno a2 = new Alumno(Apellido,Nombre,dni);
	 
	Nombre = "Programación III";
	Curso c = new Curso(40,Nombre,p);
	c.addAlumno(a1);
	c.addAlumno(a2);
	int CantClasAsist = 35; // Alumno 1
	a1.setCantClasAsist(CantClasAsist);
	CantClasAsist = 20; // Alumno 2
	a2.setCantClasAsist(CantClasAsist);
	c.ImprimirResumenFinal();
	
	// Otro Caso
	a1.setCantClasAsist(0);
	a2.setCantClasAsist(0);
	c.DarClase();
	a1.IrAClase();
	a2.IrAClase();
	System.out.println("===============================================================");
	c.ImprimirPorClase();  // Resumén diferente
	}

}
