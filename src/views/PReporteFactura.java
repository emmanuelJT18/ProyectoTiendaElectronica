package views;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PReporteFactura extends JPanel {

	/**
	 * Create the panel.
	 */
	public PReporteFactura() {
		setBounds(0,60,1100,740);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Reportes");
		add(lblTitulo, BorderLayout.NORTH);
	}

}
