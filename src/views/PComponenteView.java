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
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class PComponenteView extends JPanel {
	private Tienda controller = Tienda.getInstance();
	private JTable table;
	private JComboBox cbxTiposComponentes;
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
		btnNuevoComponente.setBounds(392, 82, 143, 25);
		btnNuevoComponente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DGCrearMicroProcesador crearMicroProcesadorView = new DGCrearMicroProcesador(PComponenteView.this);
				//crearMicroProcesadorView.setVisible(true);
				
				openViewForNewComponent();
			}
		});
		pActions.setLayout(null);
		pActions.add(btnNuevoComponente);
		
		cbxTiposComponentes = new JComboBox();
		cbxTiposComponentes.setModel(new DefaultComboBoxModel(new String[] {"seleccione", "Microprocesador", "Tarjeta Madre", "Memoria RAM", "Disco Duro"}));
		cbxTiposComponentes.setBounds(231, 83, 119, 22);
		pActions.add(cbxTiposComponentes);
		
		JLabel lblNewLabel = new JLabel("Tipo de Componente");
		lblNewLabel.setBounds(100, 86, 119, 16);
		pActions.add(lblNewLabel);
		 
		JPanel pShowData = new JPanel();
		add(pShowData, BorderLayout.CENTER);
		pShowData.setLayout(null);
		
		table = new JTable(getTableModel());
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(100, 0, 900, 400);
		pShowData.add(scrollPane/*, BorderLayout.CENTER*/);
		
	}
	
	private void openViewForNewComponent() {
		JDialog createComponentForm;
		DGCrearMicroProcesador microProcesadorForm = new DGCrearMicroProcesador(PComponenteView.this);
		DGCrearTarjetaMadre tarjetaMadreForm = new DGCrearTarjetaMadre(PComponenteView.this);
		DGCrearMemoriaRAM memoriaRAMForm = new DGCrearMemoriaRAM(PComponenteView.this);
		DGCrearDiscoDuro discoDuroForm = new DGCrearDiscoDuro(PComponenteView.this);
		
		JDialog[] forms = { microProcesadorForm, tarjetaMadreForm, memoriaRAMForm, discoDuroForm };
		
		for(JDialog form : forms) {
			form.setModal(true);
		}
		
		if(cbxTiposComponentes.getSelectedIndex() != 0) {
			createComponentForm = forms[cbxTiposComponentes.getSelectedIndex()-1];
			createComponentForm.setLocationRelativeTo(null);
			createComponentForm.setVisible(true);
		}
	}
	
	private DefaultTableModel getTableModel() {

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
