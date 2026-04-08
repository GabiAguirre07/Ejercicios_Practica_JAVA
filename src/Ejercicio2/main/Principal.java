package laboratorio.main;

import java.util.Calendar;
import java.util.Date;

import laboratorio.clases.Autor;
import laboratorio.clases.Editorial;
import laboratorio.clases.Libro;

public class Principal {

	public static void main(String[] args) {
		
		Libro l = new Libro();
		String isbn = "978-3-16-148410-0";
		String nombre = "Don Quijote De La Mancha";
		Calendar cal = Calendar.getInstance();
        cal.set(1605, Calendar.JANUARY, 16);
        Date fechaPub = cal.getTime();
		
		Autor a = new Autor();
		String nombrAut = "Miguel De Cervantes";
		String apellido = "Saavedra";
        cal.set(1547, Calendar.SEPTEMBER, 29);
        Date fechaNac = cal.getTime();
        String sexo = "Masculino";
        String emailA = "cervantesaavedra@gmail.com";
        
        Editorial e = new Editorial();
        String nombrEdit = "Grupo Planeta";
		String telefono = "+54 9 343 431-2164";
		String direccion = "Don Bosco 321";
		String localidad = "Paraná";
		String emailE = "grupoplaneta@gmail.com";
		String cuit = "20-34561043-3";
	
		l.setNombre(nombre);
        l.setAñoPub(fechaPub);
        l.setCantEj(10);
        l.setCosto(50);
        l.setISBN(isbn);
        l.setAutor(a);
        l.addDatosAutor(nombrAut, apellido, fechaNac, sexo, emailA);
        l.setEditorial(e);
        l.addDatosEditorial(nombrEdit, telefono, direccion, localidad, emailE, cuit);
        
        l.Imprimir();
	}

}
