package views;

import javax.swing.JPanel;

import logic.Utilidad;

import java.awt.BorderLayout;
import javax.swing.JLabel;

public class PCrearFactura extends JPanel {

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
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Facturar");
		add(lblTitulo, BorderLayout.NORTH);

	}

}
