package views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class PCrearFactura extends JPanel {

	/**
	 * Create the panel.
	 */
	public PCrearFactura() {
		setBounds(0,60,1100,740);
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("Facturar");
		add(lblTitulo, BorderLayout.NORTH);

	}

}
