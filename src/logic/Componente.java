package logic;

public abstract class Componente {
	protected String id;
	protected String numeroSerie;
	protected String marca;
	protected String modelo;
	protected double precio;
	protected int cantDisponible;
	
	public Componente(String id, String numeroSerie, String marca, String modelo, double precio, int cantDisponible) {
		super();
		this.id = id;
		this.numeroSerie = numeroSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.cantDisponible = cantDisponible;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantDisponible() {
		return cantDisponible;
	}

	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}

	public String getId() {
		return id;
	}
	
	
}
