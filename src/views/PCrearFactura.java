package views;

import javax.swing.JPanel;

import logic.Utilidad;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;

public class PCrearFactura extends JPanel {
	private JTextField txtIdComponente;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtCantidadDisponible;
	private JTextField txtCantidadVender;
	private JTextField txtNombreCliente;
	private JTextField txtDireccion;
	private JTextField txtIdCliente;

	/**
	 * Create the panel.
	 */
	
	public PCrearFactura() {
		setBounds(
				Utilidad.xlocationForChildPanelView, 
				Utilidad.ylocationForChildPanelView, 
				Utilidad.witdhForChildPanelView, 
				Utilidad.heightForChildPanelView
		);
		setLayout(null);
		
		JPanel pComponente = new JPanel();
		pComponente.setBounds(12, 87, 535, 191);
		add(pComponente);
		pComponente.setLayout(null);
		
		JLabel lblComponenteId = new JLabel("Componente ID");
		lblComponenteId.setBounds(2, 10, 111, 16);
		pComponente.add(lblComponenteId);
		
		txtIdComponente = new JTextField();
		txtIdComponente.setBounds(103, 7, 116, 22);
		pComponente.add(txtIdComponente);
		txtIdComponente.setColumns(10);
		
		JButton btnSearchComponente = new JButton("Buscar Componente");
		btnSearchComponente.setBounds(243, 9, 206, 33);
		pComponente.add(btnSearchComponente);
		
		JLabel lblNombreComponente = new JLabel("Nombre");
		lblNombreComponente.setBounds(2, 48, 111, 16);
		pComponente.add(lblNombreComponente);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(59, 45, 160, 22);
		pComponente.add(txtNombre);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(3, 90, 111, 16);
		pComponente.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEnabled(true);
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(59, 87, 160, 22);
		pComponente.add(txtPrecio);
		
		JButton btnAddComponente = new JButton("Agregar");
		btnAddComponente.setBounds(12, 139, 97, 25);
		pComponente.add(btnAddComponente);
		
		JButton btnDeleteComponente = new JButton("borrar");
		btnDeleteComponente.setBounds(134, 139, 97, 25);
		pComponente.add(btnDeleteComponente);
		
		JLabel lblCantidadDisponible = new JLabel("Cant. Disponible");
		lblCantidadDisponible.setBounds(239, 51, 111, 16);
		pComponente.add(lblCantidadDisponible);
		
		txtCantidadDisponible = new JTextField();
		txtCantidadDisponible.setEditable(false);
		txtCantidadDisponible.setColumns(10);
		txtCantidadDisponible.setBounds(338, 48, 111, 22);
		pComponente.add(txtCantidadDisponible);
		
		JLabel lblCantidadVender = new JLabel("Cant. a Vender");
		lblCantidadVender.setBounds(239, 93, 111, 16);
		pComponente.add(lblCantidadVender);
		
		txtCantidadVender = new JTextField();
		txtCantidadVender.setEnabled(true);
		txtCantidadVender.setEditable(false);
		txtCantidadVender.setColumns(10);
		txtCantidadVender.setBounds(338, 90, 111, 22);
		pComponente.add(txtCantidadVender);
		
		JComboBox cbxCombos = new JComboBox();
		cbxCombos.setBounds(338, 140, 185, 22);
		pComponente.add(cbxCombos);
		
		JLabel lblCombo = new JLabel("Combos");
		lblCombo.setBounds(252, 143, 111, 16);
		pComponente.add(lblCombo);
		
		JPanel pCliente = new JPanel();
		pCliente.setBounds(649, 87, 372, 165);
		add(pCliente);
		pCliente.setLayout(null);
		
		JLabel lblNombreCliente = new JLabel("Nombre");
		lblNombreCliente.setBounds(12, 53, 111, 16);
		pCliente.add(lblNombreCliente);
		
		txtNombreCliente = new JTextField();
		txtNombreCliente.setEditable(false);
		txtNombreCliente.setColumns(10);
		txtNombreCliente.setBounds(82, 50, 251, 22);
		pCliente.add(txtNombreCliente);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(13, 95, 111, 16);
		pCliente.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setEnabled(true);
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(82, 92, 251, 22);
		pCliente.add(txtDireccion);
		
		JLabel lblClienteId = new JLabel("Cliente");
		lblClienteId.setBounds(12, 16, 111, 16);
		pCliente.add(lblClienteId);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setColumns(10);
		txtIdCliente.setBounds(82, 13, 126, 22);
		pCliente.add(txtIdCliente);
		
		JButton btnSearchCliente = new JButton("buscar");
		btnSearchCliente.setBounds(222, 8, 111, 33);
		pCliente.add(btnSearchCliente);

	}
}
