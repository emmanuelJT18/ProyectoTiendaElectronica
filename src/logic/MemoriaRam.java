package logic;

public class MemoriaRam extends Componente {
	private String cantMemoria;
	private String velocidadProcesamiento;
	
	public MemoriaRam(String id, String numeroSerie, String marca, String modelo, double precio, int cantDisponible,
			String cantMemoria, String velocidadProcesamiento) {
		super(id, numeroSerie, marca, modelo, precio, cantDisponible);
		this.cantMemoria = cantMemoria;
		this.velocidadProcesamiento = velocidadProcesamiento;
	}

	public String getCantMemoria() {
		return cantMemoria;
	}

	public void setCantMemoria(String cantMemoria) {
		this.cantMemoria = cantMemoria;
	}

	public String getVelocidadProcesamiento() {
		return velocidadProcesamiento;
	}

	public void setVelocidadProcesamiento(String velocidadProcesamiento) {
		this.velocidadProcesamiento = velocidadProcesamiento;
	}
	
	
}
