package views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import views.misComponentes.BtnForSideMenu;
import javax.swing.SwingConstants;


public class Inicio extends JFrame {

	private JPanel contentPane;
	private static JPanel pParentContainer = new JPanel();
	private JPanel pNorthContainer = new JPanel();
	private JPanel pWestContainer = new JPanel();
	private JButton btnGoToInicio = new BtnForSideMenu("Inicio");
	private JButton btnGoToFactura = new BtnForSideMenu("Facturar");
	private JButton btnGoToComponente = new BtnForSideMenu("Componentes");
	private final JLabel lblNombreSistema = new JLabel("EJM Electronica");
	private final JLabel lblCerrarSesion = new JLabel("Cerrar Sesion");
	private final JLabel lblLogo = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
					System.out.println(pParentContainer.getLocationOnScreen());
					System.out.println("Ancho: " + pParentContainer.getWidth());
					System.out.println("Alto: " + pParentContainer.getHeight());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void fitImageInsideLabel(String route, JLabel label) {
		//Make sure to assigned a width and hight to the label otherwise
		//The image wont be resized properly
		ImageIcon originalImg = new ImageIcon(route);
		Image resizedImg = originalImg.getImage().getScaledInstance(
				label.getWidth(), 
				label.getHeight(), 
				Image.SCALE_SMOOTH
		);
		label.setIcon(new ImageIcon(resizedImg));
	}
	private void showMyPanel(JPanel parentPanel, JPanel childPanel) {
		/*
		 * 		childPanel.setSize(593, 382);
		childPanel.setLocation(0,0);
		
		parentPanel.removeAll();
		parentPanel.add(childPanel);
		parentPanel.revalidate();
		parentPanel.repaint();*/
		
		/*
		 * java.awt.Point[x=414,y=213]
	Ancho: 993
	Alto: 620*/
		
		childPanel.setSize(1200,800);
		childPanel.setLocation(414, 200);
		
		parentPanel.removeAll();
		parentPanel.add(childPanel);
		parentPanel.revalidate();
		parentPanel.repaint();
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1431, 889);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlLtHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pNorthContainer.setBackground(new Color(0,2,61));
		pNorthContainer.setPreferredSize(new Dimension(700,70));
		contentPane.add(pNorthContainer, BorderLayout.NORTH);
		pNorthContainer.setLayout(new BorderLayout(0, 0));
		
		lblNombreSistema.setFont(new Font("Arial", Font.BOLD, 40));
		lblNombreSistema.setForeground(Color.WHITE);
		pNorthContainer.add(lblNombreSistema, BorderLayout.CENTER);
		
		lblCerrarSesion.setFont(new Font("Arial", Font.BOLD, 20));
		lblCerrarSesion.setForeground(Color.WHITE);
		pNorthContainer.add(lblCerrarSesion, BorderLayout.EAST);
		

		pWestContainer.setBackground(Color.GREEN);
		pWestContainer.setPreferredSize(new Dimension(300,700));
		contentPane.add(pWestContainer, BorderLayout.WEST);
		
		
		btnGoToInicio.setBounds(0, 191, 300, 49);
		btnGoToInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PInicioView viewInicio = new PInicioView();
				showMyPanel(pParentContainer, viewInicio);
			}
		});
		
		btnGoToFactura.setBounds(0, 253, 300, 49);
		btnGoToFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PFacturaView viewFactura = new PFacturaView();
				showMyPanel(pParentContainer, viewFactura);

			}
		});
		
		pWestContainer.setLayout(null);
		pWestContainer.add(btnGoToInicio);
		pWestContainer.add(btnGoToFactura);
		lblLogo.setBounds(0, 0, 300, 178);
		fitImageInsideLabel(
				"D:\\PUCMM7\\Cam Clim\\Practicas\\Practica 5\\WhatsApp Image 2025-07-06 at 14.44.25_2f7d1c76.jpg", 
				lblLogo
	    );
		lblLogo.setHorizontalAlignment(JLabel.CENTER);
		pWestContainer.add(lblLogo);
		
		
		pParentContainer.setBackground(Color.BLUE);
		contentPane.add(pParentContainer, BorderLayout.CENTER);
	}
}
