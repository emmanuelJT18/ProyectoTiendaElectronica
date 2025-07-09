package views;

import java.awt.Dimension;

import javax.swing.JPanel;

import logic.Utilidad;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setLayout(null);
		
		JButton btnCrearComponente = new JButton("Crear Componente");
		btnCrearComponente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCrearComponente.setBounds(529, 203, 154, 45);
		add(btnCrearComponente);
		
		
	}
}
