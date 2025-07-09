package views.compVisuales;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import logic.Utilidad;

public class LblMenuTab extends JLabel {

	private final JPanel childPanel;
	private final JPanel parentPanel;
	private static LblMenuTab currentSelectedTab = null;//This will help me to identify which object of the class was clicked 
	//to un-clicked the previous one if other tab was clicked before
	
	private final Color lineColor = new Color(6, 57, 112); //Azul marino
	private final Border normalBorder = BorderFactory.createBevelBorder(1);//creaProfundidad
	private final Border hoverBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, lineColor);
	private final Border clickedBorder = BorderFactory.createMatteBorder(0, 0, 4, 0, lineColor);

	public LblMenuTab(String text, JPanel parentPanel, JPanel childPanel) {
		super(text);

		this.childPanel = childPanel;
		this.parentPanel = parentPanel;

		setOpaque(true); 
		setHorizontalAlignment(JLabel.CENTER);
		setBorder(normalBorder);

		eventos();
	}

	private void eventos() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(currentSelectedTab != LblMenuTab.this) {
					//If an object of this class is different from the static variable of this class
					//the following code will be executed
					
					setBorder(hoverBorder);//set a hover effect of a underline on the tab
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if(currentSelectedTab != LblMenuTab.this) {
					setBorder(normalBorder);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if(currentSelectedTab != null && currentSelectedTab != LblMenuTab.this) {
					currentSelectedTab.setBorder(normalBorder);
				}
				
				currentSelectedTab = LblMenuTab.this;
				setBorder(clickedBorder);
				if (parentPanel != null && childPanel != null) {
					Utilidad.showMyPanel(parentPanel, childPanel);
				}
			}
		});
	}
}
