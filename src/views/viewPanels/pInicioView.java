package views.viewPanels;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class pInicioView extends JPanel {

	/**
	 * Create the panel.
	 */
	public pInicioView() {
		this.setPreferredSize(new Dimension(993,620));
		setLayout(null);
		
		JLabel lblInicio = new JLabel("INICIO");
		lblInicio.setBounds(449, 253, 55, 16);
		add(lblInicio);

	}

}
