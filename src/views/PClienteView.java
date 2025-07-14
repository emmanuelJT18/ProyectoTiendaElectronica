package views;

import java.awt.Dimension;

import javax.swing.JPanel;

import logic.Utilidad;

public class PClienteView extends JPanel {

	/**
	 * Create the panel.
	 */
	public PClienteView() {
		setPreferredSize(
				new Dimension(
						Utilidad.witdhForParentPanelView,
						Utilidad.heightForParentPanelView
				)
		);
		setLayout(null);
	}

}
