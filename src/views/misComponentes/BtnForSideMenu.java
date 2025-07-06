package views.misComponentes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


public class BtnForSideMenu extends JButton{
	
	private final Color colorFondo = new Color(0,0,128);
	private final Color colorHover = new Color(0,0,180);
	
	public BtnForSideMenu(String nameButton) {
		super(nameButton);
		setFont(new Font("Arial", Font.BOLD, 14));
		setForeground(Color.WHITE);//Esto le da color al texto que tiene el boton
		setBackground(new Color(0,0,128));
		
		//Quita los bordes del boton y da un enfoque plano
		setFocusPainted(false);
		setBorderPainted(false);
		setOpaque(true);
		
		eventos();
	}
	
	private void eventos() {
		addMouseListener(new MouseAdapter() {
			@Override 
			public void mouseEntered(MouseEvent e) {
				setBackground(colorHover);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(colorFondo);
			}
		});
	}
}	
