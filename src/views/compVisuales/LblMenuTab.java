package views.compVisuales;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import logic.Utilidad;

public class LblMenuTab extends JLabel{
	
	private final Color bgColor;
	private final Color hoverColor;
	private final Color clickedColor;
	private final JPanel childPanel;
	private final JPanel parentPanel;
	
	public LblMenuTab(String text, JPanel parentPanel, JPanel childPanel) {
		super(text);
		
		this.bgColor = new Color(205,206,210);
		this.hoverColor = new Color(205,6,210);
		this.clickedColor = new Color(20,206,210);
		this.childPanel = childPanel;
		this.parentPanel = parentPanel;
		
		setBackground(bgColor);
		setOpaque(true);
		setHorizontalAlignment(JLabel.CENTER);
		
		eventos();
	}
	
	private void eventos() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setBackground(hoverColor);
				setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(205,206,210));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(clickedColor);
				if(parentPanel != null && childPanel != null) Utilidad.showMyPanel(parentPanel, childPanel);

			}
		});
	}
}
