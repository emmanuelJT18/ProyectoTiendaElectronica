package logic;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Utilidad {
	
	public static void fitImageInsideLabel(String route, JLabel label) {
		//Make sure to assign a width and hight to the label before using
		//this method otherwise the image wont be resized properly
		ImageIcon originalImg = new ImageIcon(route);
		Image resizedImg = originalImg.getImage().getScaledInstance(
				label.getWidth(), 
				label.getHeight(), 
				Image.SCALE_SMOOTH
		);
		label.setIcon(new ImageIcon(resizedImg));
	}
	public static void showMyPanel(JPanel parentPanel, JPanel childPanel) {	
		
		childPanel.setSize(parentPanel.getWidth(),parentPanel.getHeight());
		childPanel.setLocation(parentPanel.getLocationOnScreen());
		
		parentPanel.removeAll();
		parentPanel.add(childPanel);
		parentPanel.revalidate();
		parentPanel.repaint();
	}

}
