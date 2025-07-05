package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1321, 747);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlLtHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pNorthContainer = new JPanel();
		pNorthContainer.setBackground(Color.RED);
		pNorthContainer.setPreferredSize(new Dimension(700,70));
		contentPane.add(pNorthContainer, BorderLayout.NORTH);
		
		JPanel pWestContainer = new JPanel();
		pWestContainer.setBackground(Color.GREEN);
		pWestContainer.setPreferredSize(new Dimension(300,700));
		contentPane.add(pWestContainer, BorderLayout.WEST);
		
		JPanel pParentContainer = new JPanel();
		pParentContainer.setBackground(SystemColor.activeCaption);
		contentPane.add(pParentContainer, BorderLayout.CENTER);
	}
}
