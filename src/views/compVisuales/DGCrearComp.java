package views.compVisuales;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DGCrearComp extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DGCrearComp dialog = new DGCrearComp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DGCrearComp() {
		setBounds(100, 100, 655, 441);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("ID del Componente");
				label.setBounds(31, 27, 109, 16);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(152, 24, 116, 22);
				panel.add(textField);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(152, 64, 116, 22);
				panel.add(textField_1);
			}
			{
				JLabel label = new JLabel("Numero de Serie");
				label.setBounds(31, 67, 109, 16);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(411, 64, 116, 22);
				panel.add(textField_2);
			}
			{
				JLabel label = new JLabel("Marca");
				label.setBounds(352, 67, 109, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Modelo");
				label.setBounds(352, 24, 109, 16);
				panel.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(401, 24, 116, 22);
				panel.add(textField_3);
			}
			{
				JLabel label = new JLabel("Precio");
				label.setBounds(31, 102, 109, 16);
				panel.add(label);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(152, 99, 116, 22);
				panel.add(textField_4);
			}
			{
				JLabel label = new JLabel("Cant. Disponible");
				label.setBounds(31, 137, 109, 16);
				panel.add(label);
			}
			{
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(152, 134, 116, 22);
				panel.add(textField_5);
			}
			{
				JLabel label = new JLabel("Tipo Conexion");
				label.setBounds(352, 99, 89, 16);
				panel.add(label);
			}
			{
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(446, 99, 116, 22);
				panel.add(textField_6);
			}
			{
				JLabel label = new JLabel("Velocidad de Procesamiento");
				label.setBounds(280, 137, 181, 16);
				panel.add(label);
			}
			{
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(456, 134, 116, 22);
				panel.add(textField_7);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblCrearComponente = new JLabel("Crear Componente");
				panel.add(lblCrearComponente);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
