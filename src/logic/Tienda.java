package logic;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Componente> componentes;
	private static Tienda instanciaUnica;
	
	public static Tienda getInstance() {
		if(instanciaUnica == null) {
			instanciaUnica = new Tienda();

		}
		return instanciaUnica;
	}

	private Tienda() {
		componentes = new ArrayList<Componente>();
	}
	
	public ArrayList<Componente> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public void addComponente(Componente componente) {
		componentes.add(componente);
	}
}
