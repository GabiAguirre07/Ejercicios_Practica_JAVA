package laboratorio.clases;

public class Profesor {
	
	private String apellido;
	
	private String nombre;
	
	private final Long nroLegajo;
	
	public Profesor(String apellido, String nombre, Long nroLegajo) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.nroLegajo = nroLegajo;
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

	public Long getNroLegajo() {
		return nroLegajo;
	}
	
}
