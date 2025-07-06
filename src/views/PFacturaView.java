package views;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import views.compVisuales.LblMenuTab;

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
		
		JPanel pContainer = new JPanel();
		pContainer.setBounds(0, 60, 1100, 740);
		add(pContainer);
		pContainer.setLayout(null);
		
		JPanel crearFacturaView = new PCrearFactura();
		JLabel lblFacturar = new LblMenuTab("Facturar", pContainer, crearFacturaView);
		lblFacturar.setBounds(12, 13, 119, 47);
		
		JPanel reporteFacturaView = new PReporteFactura();
		JLabel lblReportes = new LblMenuTab("Reportes", pContainer, reporteFacturaView);
		lblReportes.setBounds(130, 13, 119, 47);
		pMenuBar.setLayout(null);
		pMenuBar.add(lblFacturar);
		pMenuBar.add(lblReportes);
		
		JPanel panel = new JPanel();
		panel.setBounds(502, 12, 1, 1);
		pContainer.add(panel);
		panel.setLayout(null);
		
		JLabel lblFacturasContianer = new JLabel("FacturasContainer");
		lblFacturasContianer.setBounds(508, 5, 104, 16);
		pContainer.add(lblFacturasContianer);
		
	}
}
