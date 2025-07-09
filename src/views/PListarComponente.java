package views;

import javax.swing.JPanel;

import logic.Utilidad;

public class PListarComponente extends JPanel {

	/**
	 * Create the panel.
	 */
	public PListarComponente() {
		setBounds(
				Utilidad.xlocationForChildPanelView, 
				Utilidad.ylocationForChildPanelView, 
				Utilidad.witdhForChildPanelView, 
				Utilidad.heightForChildPanelView
		);
	}

}
