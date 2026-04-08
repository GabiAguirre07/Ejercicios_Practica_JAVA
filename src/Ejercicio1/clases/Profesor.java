package laboratorio.clases;

public class Profesor {
	
	public Profesor() {}
	
	private String apellido;
	
	private String nroLE;
	
	public String getApellido()
	{
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNroLegajo() {
		
		return nroLE;
	}
	
    public void setNroLegajo(String nroLE) {
		
		this.nroLE = nroLE;
	}
	
}
