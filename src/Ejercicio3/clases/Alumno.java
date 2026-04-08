package laboratorio.clases;

public class Alumno {
	
	private String nombre;
	
	private String apellido;
	
	private final Long dni;
	
	private int cantClasAsist;
	
	public Alumno(String apellido, String nombre, Long dni) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.dni = dni; // Dato Inmutable por eso el uso del final
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getDni() {
		return dni;
	}

	
	public void IrAClase() {
		this.cantClasAsist++;
	}

	public int getCantClasAsist() {
		return cantClasAsist;
	}
	
	public void setCantClasAsist(int clasAsist) {
	  this.cantClasAsist = clasAsist;
	}
	
	

}
