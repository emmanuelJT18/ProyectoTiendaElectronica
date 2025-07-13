package logic;

public class Cliente {
	private String id;
	private String nombre;
	private String telefono;
	private String direccion;
	
	public Cliente(String id, String nombre, String telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
