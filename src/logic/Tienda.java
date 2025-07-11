package logic;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Componente> componentes;
	private static Tienda uniqueInstance;
	
	public static Tienda getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Tienda();

		}
		return uniqueInstance;
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
