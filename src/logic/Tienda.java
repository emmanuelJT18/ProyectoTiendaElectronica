package logic;

import java.util.ArrayList;

public class Tienda {
	private ArrayList<Componente> componentes;
	private ArrayList<Cliente> clientes;
	private static Tienda uniqueInstance;
	
	public static Tienda getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Tienda();

		}
		return uniqueInstance;
	}

	private Tienda() {
		componentes = new ArrayList<Componente>();
		clientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<Componente> getComponentes() {
		return componentes;
	}
	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void addComponente(Componente componente) {
		componentes.add(componente);
	}
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
}
