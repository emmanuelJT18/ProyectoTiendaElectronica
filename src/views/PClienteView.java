package views;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import logic.Cliente;
import logic.Componente;
import logic.Tienda;
import logic.Utilidad;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PClienteView extends JPanel {
	private Tienda controller;
	private JTextField txtParameter;
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
		
		txtParameter = new JTextField();
		txtParameter.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				DefaultTableModel tableModel = (DefaultTableModel) tblClientes.getModel();
				TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(tableModel);
				tblClientes.setRowSorter(rowSorter);
				rowSorter.setRowFilter(RowFilter.regexFilter(txtParameter.getText()));
			}
		});
		txtParameter.setBounds(189, 81, 116, 22);
		pActions.add(txtParameter);
		txtParameter.setColumns(10);
		
		JButton btnNewCliente = new JButton("Crear Cliente");
		btnNewCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DGCrearCliente newClienteForm = new DGCrearCliente(PClienteView.this);
				newClienteForm.setLocationRelativeTo(null);
				newClienteForm.setModal(true);
				newClienteForm.setVisible(true);
			}
		});
		btnNewCliente.setBounds(545, 80, 129, 25);
		pActions.add(btnNewCliente);
		
		JPanel pParentContainer = new JPanel();
		pParentContainer.setBounds(0, 179, 1100, 621);
		add(pParentContainer);
		pParentContainer.setLayout(null);
		
		tblClientes = new JTable(getTableModel());
		JScrollPane scrollPane = new JScrollPane(tblClientes);
		scrollPane.setBounds(85, 10, 927, 419);
		pParentContainer.add(scrollPane);
		
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
	
	public void updateTable() {
		DefaultTableModel updatedModel = getTableModel();
		tblClientes.setModel(updatedModel);
	}
}
