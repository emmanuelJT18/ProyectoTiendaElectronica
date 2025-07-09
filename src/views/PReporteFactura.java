package views;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Utilidad;

public class PReporteFactura extends JPanel {

	/**
	 * Create the panel.
	 */
	public PReporteFactura() {
		setBounds(
				Utilidad.xlocationForPanelView, 
				Utilidad.ylocationForPanelView, 
				Utilidad.witdhForPanelView, 
				Utilidad.heightForPanelView
		);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Reportes");
		add(lblTitulo, BorderLayout.NORTH);
	}

}
