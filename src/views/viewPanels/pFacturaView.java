package views.viewPanels;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class pFacturaView extends JPanel {

	/**
	 * Create the panel.
	 */
	public pFacturaView() {
		this.setPreferredSize(new Dimension(993,620));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FACTURA");
		lblNewLabel.setBounds(417, 244, 56, 16);
		add(lblNewLabel);
	}

}
