package laboratorio.clases;

import java.util.Date;

public class Libro {
	
	private String nombre;
	
	private Autor autor;
	
	private Editorial editorial;
	
	private Date añoPub;
	
	private int cantEj;
	
	private double costo;
	
	private String isbn;
	
	public Libro() {}
	
	public void addDatosAutor(String nombrAut, String apellido, Date fechaNac, String Sexo, String Email)
	{
		Autor a = this.getAutor();
		a.setNombre(nombrAut);
		a.setApellido(apellido);
		a.setFechaNac(fechaNac);
		a.setSexo(Sexo);
		a.setEmail(Email);
	}
	
	public void addDatosEditorial(String nombrEdit, String telefono, String direccion, String localidad, String email, String cuit)
	{
		Editorial e = this.getEditorial();
		e.setNombre(nombrEdit);
		e.setTelefono(telefono);
		e.setDireccion(direccion);
		e.setLocalidad(localidad);
		e.setEmail(email);
		e.setCuit(cuit);
	}
	
	private double PrecioTotal() {
		return this.getCantEj() * this.getCosto();
	}
	public void Imprimir() {
		System.out.println("Libro:" + this.getNombre());
		System.out.println("===========================================");
		System.out.println("Autor:" + autor.getNombre());
		System.out.println("===========================================");
		System.out.println("Editorial:" + editorial.getNombre());
		System.out.println("===========================================");
		System.out.println("Ejemplares Comprados:" + this.getCantEj());
		System.out.println("===========================================");
		System.out.println("Precio Total:" + "$" + this.PrecioTotal());
		System.out.println("===========================================");
		System.out.println("Contacto:" + " Teléfono:" + editorial.getTelefono() + " - Email:" + editorial.getEmail());
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Date getAñoPub() {
		return añoPub;
	}

	public void setAñoPub(Date añoPub) {
		this.añoPub = añoPub;
	}

	public int getCantEj() {
		return cantEj;
	}

	public void setCantEj(int cantEj) {
		this.cantEj = cantEj;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	

}
