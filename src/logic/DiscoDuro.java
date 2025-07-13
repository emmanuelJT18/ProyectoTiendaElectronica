package logic;

public class DiscoDuro extends Componente {
	private String tipoConexion;
	private String cantMemoria;
	
	public DiscoDuro(String id, String numeroSerie, String marca, String modelo, double precio, int cantDisponible,
			String tipoConexion, String cantMemoria) {
		super(id, numeroSerie, marca, modelo, precio, cantDisponible);
		this.tipoConexion = tipoConexion;
		this.cantMemoria = cantMemoria;
	}

	public String getTipoConexion() {
		return tipoConexion;
	}

	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}

	public String getCantMemoria() {
		return cantMemoria;
	}

	public void setCantMemoria(String cantMemoria) {
		this.cantMemoria = cantMemoria;
	}
	
	
}
