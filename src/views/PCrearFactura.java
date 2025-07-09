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
				Utilidad.xlocationForPanelView, 
				Utilidad.ylocationForPanelView, 
				Utilidad.witdhForPanelView, 
				Utilidad.heightForPanelView
		);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Facturar");
		add(lblTitulo, BorderLayout.NORTH);

	}

}
