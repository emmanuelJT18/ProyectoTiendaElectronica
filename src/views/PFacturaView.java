package views;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PFacturaView extends JPanel {
	

	/**
	 * Create the panel.
	 */
	public PFacturaView() {
		this.setPreferredSize(new Dimension(1100,800));
		setLayout(null);
		
		JPanel pMenuBar = new JPanel();
		pMenuBar.setLocation(0, 0);
		pMenuBar.setBackground(new Color(205, 206, 210));
		pMenuBar.setSize(1100,60);
		add(pMenuBar);
		
		JLabel lblFacturar = new JLabel("Facturar");
		lblFacturar.setBackground(new Color(205,206,210));
		lblFacturar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblFacturar.setBackground(new Color(205,6,210));
				lblFacturar.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblFacturar.setBackground(new Color(205,206,210));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				lblFacturar.setBackground(new Color(20,206,210));
			}
		});

		
		JLabel lblReportes = new JLabel("Reportes");
		lblReportes.setBackground(new Color(205,206,210));
		lblReportes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblReportes.setBackground(new Color(205,6,210));
				lblReportes.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblReportes.setBackground(new Color(205,206,210));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				lblReportes.setBackground(new Color(20,206,210));
			}
		});
		GroupLayout gl_pMenuBar = new GroupLayout(pMenuBar);
		gl_pMenuBar.setHorizontalGroup(
			gl_pMenuBar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pMenuBar.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblFacturar, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblReportes, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(843, Short.MAX_VALUE))
		);
		gl_pMenuBar.setVerticalGroup(
			gl_pMenuBar.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pMenuBar.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pMenuBar.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFacturar, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
						.addComponent(lblReportes, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
		);
		pMenuBar.setLayout(gl_pMenuBar);
		
	}
}
