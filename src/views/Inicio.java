package views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private static JPanel pParentContainer = new JPanel();
	private JPanel pNorthContainer = new JPanel();
	private JPanel pWestContainer = new JPanel();
	private JButton btnGoToInicio = new JButton("Inicio");
	private JButton btnGoToFactura = new JButton("Facturar");

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
		
		pNorthContainer.setBackground(Color.RED);
		pNorthContainer.setPreferredSize(new Dimension(700,70));
		contentPane.add(pNorthContainer, BorderLayout.NORTH);
		

		pWestContainer.setBackground(Color.GREEN);
		pWestContainer.setPreferredSize(new Dimension(300,700));
		contentPane.add(pWestContainer, BorderLayout.WEST);
		
		
		btnGoToInicio.setBounds(0, 47, 300, 49);
		btnGoToInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pInicioView viewInicio = new pInicioView();
				showMyPanel(pParentContainer, viewInicio);
			}
		});
		
		btnGoToFactura.setBounds(0, 109, 300, 49);
		btnGoToFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pFacturaView viewFactura = new pFacturaView();
				showMyPanel(pParentContainer, viewFactura);

			}
		});
		pWestContainer.setLayout(null);
		
		pWestContainer.add(btnGoToInicio);
		pWestContainer.add(btnGoToFactura);
		
		
		pParentContainer.setBackground(Color.BLUE);
		contentPane.add(pParentContainer, BorderLayout.CENTER);
	}
}
