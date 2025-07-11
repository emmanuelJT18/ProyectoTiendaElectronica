package logic;

public class TarjetaMadre extends Componente {
	private String tipoConexion;
	private String tipoMemoriaRAM;
	private String conxionesDiscosDuros;
	
	public TarjetaMadre(String id, String numeroSerie, String marca, String modelo, double precio, int cantDisponible,
			String tipoConexion, String tipoMemoriaRAM, String conxionesDiscosDuros) {
		super(id, numeroSerie, marca, modelo, precio, cantDisponible);
		this.tipoConexion = tipoConexion;
		this.tipoMemoriaRAM = tipoMemoriaRAM;
		this.conxionesDiscosDuros = conxionesDiscosDuros;
	}

	public String getTipoConexion() {
		return tipoConexion;
	}

	public void setTipoConexion(String tipoConexion) {
		this.tipoConexion = tipoConexion;
	}

	public String getTipoMemoriaRAM() {
		return tipoMemoriaRAM;
	}

	public void setTipoMemoriaRAM(String tipoMemoriaRAM) {
		this.tipoMemoriaRAM = tipoMemoriaRAM;
	}

	public String getConxionesDiscosDuros() {
		return conxionesDiscosDuros;
	}

	public void setConxionesDiscosDuros(String conxionesDiscosDuros) {
		this.conxionesDiscosDuros = conxionesDiscosDuros;
	}

}
