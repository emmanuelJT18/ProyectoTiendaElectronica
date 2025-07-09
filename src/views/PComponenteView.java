package views;

import java.awt.Dimension;

import javax.swing.JPanel;

import logic.Utilidad;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class PComponenteView extends JPanel {

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
		add(pActions, BorderLayout.NORTH);
		
		JPanel pShowData = new JPanel();
		add(pShowData, BorderLayout.CENTER);
		
		
	}
}
