package views;

import java.awt.Dimension;

import javax.swing.JPanel;

import logic.Cliente;
import logic.Componente;
import logic.Tienda;
import logic.Utilidad;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class PClienteView extends JPanel {
	private Tienda controller;
	private JTextField txtQuery;
	private JTable tblClientes;

	/**
	 * Create the panel.
	 */
	public PClienteView() {
		controller = Tienda.getInstance();
		setPreferredSize(
				new Dimension(
						Utilidad.witdhForParentPanelView,
						Utilidad.heightForParentPanelView
				)
		);
		setLayout(null);
		
		JPanel pActions = new JPanel();
		pActions.setBounds(0, 0, 1100, 178);
		add(pActions);
		pActions.setLayout(null);
		
		JButton btnSearch = new JButton("buscar");
		btnSearch.setIcon(null);
		btnSearch.setBounds(335, 80, 97, 25);
		pActions.add(btnSearch);
		
		txtQuery = new JTextField();
		txtQuery.setBounds(189, 81, 116, 22);
		pActions.add(txtQuery);
		txtQuery.setColumns(10);
		
		JButton btnNewCliente = new JButton("Crear Cliente");
		btnNewCliente.setBounds(545, 80, 129, 25);
		pActions.add(btnNewCliente);
		
		JPanel pParentContainer = new JPanel();
		pParentContainer.setBounds(0, 179, 1100, 621);
		add(pParentContainer);
		pParentContainer.setLayout(null);
		
		tblClientes = new JTable(getTableModel());
		tblClientes.setBounds(1015, 501, -927, -419);
		pParentContainer.add(tblClientes);
	}
	
	private DefaultTableModel getTableModel() {
		String[] columns = {"ID", "Nombre", "Telefono", "Direccion"};
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		
		for (Cliente c : controller.getClientes()) {
			Object[] row = {
				c.getId(),
				c.getNombre(),
				c.getTelefono(),
				c.getDireccion(),
			};
			model.addRow(row);
		}
		return model;
	}
}
