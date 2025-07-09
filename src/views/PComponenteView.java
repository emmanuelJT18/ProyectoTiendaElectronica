package views;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import logic.Utilidad;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import logic.Componente;
import logic.Tienda;

import java.awt.BorderLayout;

public class PComponenteView extends JPanel {
	private Tienda controller = Tienda.getInstance();
	private JTable table;
	/**
	 * Create the panel.
	 */
	public PComponenteView() {
		setPreferredSize(
				new Dimension(
						Utilidad.witdhForParentPanelView,
						Utilidad.heightForParentPanelView
				)
		);
		setLayout(new BorderLayout(0, 0));
		
		JPanel pActions = new JPanel();
		pActions.setPreferredSize(new Dimension(super.getWidth(), 200));
		add(pActions, BorderLayout.NORTH);
		
		JButton btnNuevoComponente = new JButton("Nuevo Componente");
		btnNuevoComponente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DGCrearCompMicroProcesador crearMicroProcesadorView = new DGCrearCompMicroProcesador(PComponenteView.this);
				crearMicroProcesadorView.setVisible(true);
			}
		});
		pActions.add(btnNuevoComponente);
		 
		JPanel pShowData = new JPanel();
		add(pShowData, BorderLayout.CENTER);
		pShowData.setLayout(new BorderLayout(0, 0));
		
		table = new JTable(getTableModel());
		JScrollPane scrollPane = new JScrollPane(table);
		pShowData.add(scrollPane, BorderLayout.CENTER);
		
	}
	
	private DefaultTableModel getTableModel() {
		/*
		 *  String id = txtId.getText();                      
			String numeroSerie = txtNumeroSerie.getText();                 
			String marca = txtMarca.getText();                       
			String modelo = txtModelo.getText();                      
			Double precio = Double.parseDouble(txtPrecio.getText());                      
			int cantDisponible = Integer.parseInt(txtCantidadDisponible.getText());          
			String tipoConexion = txtTipoConexion.getText();                
			String velocidadProcesamiento = txtVelocidadProcesamiento.getText();*/
		String[] columns = {"ID", "Num. Serie", "Marca", "Modelo", "Precio", "Stock"};
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		
		for(Componente c : controller.getComponentes()) {
			Object[] row = {
					c.getId(),
					c.getNumeroSerie(),
					c.getMarca(),
					c.getModelo(),
					c.getPrecio(),
					c.getCantDisponible(),
			};
			model.addRow(row);
		}
		return model;
	}
	
	public void updateTable() {
		DefaultTableModel updatedModel = getTableModel();
		table.setModel(updatedModel);
	}
}
