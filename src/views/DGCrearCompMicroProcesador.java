package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Componente;
import logic.MicroProcesador;
import logic.Tienda;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DGCrearCompMicroProcesador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtId;
	private JTextField txtNumeroSerie;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidadDisponible;
	private JTextField txtTipoConexion;
	private JTextField txtVelocidadProcesamiento;
	private Tienda controlador = Tienda.getInstance();
	private PComponenteView componenteView;
	/**
	 * Create the dialog.
	 */
	public DGCrearCompMicroProcesador(PComponenteView componenteView) {
		this.componenteView = componenteView;
		setBounds(100, 100, 655, 441);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel pTitlePanel = new JPanel();
		contentPanel.add(pTitlePanel, BorderLayout.NORTH);
		{
			JLabel lblTitle = new JLabel("Micro Procesador");
			pTitlePanel.add(lblTitle);
		}
		{
			JPanel pParentContainer = new JPanel();
			contentPanel.add(pParentContainer, BorderLayout.CENTER);
			pParentContainer.setLayout(null);
			{
				JLabel lblIdComponente = new JLabel("ID del Componente");
				lblIdComponente.setBounds(31, 27, 109, 16);
				pParentContainer.add(lblIdComponente);
			}
			
			txtId = new JTextField();
			txtId.setBounds(152, 24, 116, 22);
			pParentContainer.add(txtId);
			txtId.setColumns(10);
			
			txtNumeroSerie = new JTextField();
			txtNumeroSerie.setColumns(10);
			txtNumeroSerie.setBounds(152, 64, 116, 22);
			pParentContainer.add(txtNumeroSerie);
			
			JLabel lblNumeroSerie = new JLabel("Numero de Serie");
			lblNumeroSerie.setBounds(31, 67, 109, 16);
			pParentContainer.add(lblNumeroSerie);
			
			txtMarca = new JTextField();
			txtMarca.setColumns(10);
			txtMarca.setBounds(411, 64, 116, 22);
			pParentContainer.add(txtMarca);
			
			JLabel lblMarca = new JLabel("Marca");
			lblMarca.setBounds(352, 67, 109, 16);
			pParentContainer.add(lblMarca);
			
			JLabel lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(352, 24, 109, 16);
			pParentContainer.add(lblModelo);
			
			txtModelo = new JTextField();
			txtModelo.setColumns(10);
			txtModelo.setBounds(401, 24, 116, 22);
			pParentContainer.add(txtModelo);
			
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setBounds(31, 102, 109, 16);
			pParentContainer.add(lblPrecio);
			
			txtPrecio = new JTextField();
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(152, 99, 116, 22);
			pParentContainer.add(txtPrecio);
			
			JLabel lblCantidadDisponible = new JLabel("Cant. Disponible");
			lblCantidadDisponible.setBounds(31, 137, 109, 16);
			pParentContainer.add(lblCantidadDisponible);
			
			txtCantidadDisponible = new JTextField();
			txtCantidadDisponible.setColumns(10);
			txtCantidadDisponible.setBounds(152, 134, 116, 22);
			pParentContainer.add(txtCantidadDisponible);
			
			JLabel lblTipoConexion = new JLabel("Tipo Conexion");
			lblTipoConexion.setBounds(352, 99, 89, 16);
			pParentContainer.add(lblTipoConexion);
			
			txtTipoConexion = new JTextField();
			txtTipoConexion.setColumns(10);
			txtTipoConexion.setBounds(446, 99, 116, 22);
			pParentContainer.add(txtTipoConexion);
			
			JLabel lblVelocidadProcesamiento = new JLabel("Velocidad de Procesamiento");
			lblVelocidadProcesamiento.setBounds(280, 137, 181, 16);
			pParentContainer.add(lblVelocidadProcesamiento);
			
			txtVelocidadProcesamiento = new JTextField();
			txtVelocidadProcesamiento.setColumns(10);
			txtVelocidadProcesamiento.setBounds(456, 134, 116, 22);
			pParentContainer.add(txtVelocidadProcesamiento);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCreate = new JButton("Crear Componente");
				btnCreate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							
							String id = txtId.getText();                      
							String numeroSerie = txtNumeroSerie.getText();                 
							String marca = txtMarca.getText();                       
							String modelo = txtModelo.getText();                      
							Double precio = Double.parseDouble(txtPrecio.getText());                      
							int cantDisponible = Integer.parseInt(txtCantidadDisponible.getText());          
							String tipoConexion = txtTipoConexion.getText();                
							String velocidadProcesamiento = txtVelocidadProcesamiento.getText();      
							
							MicroProcesador nuevoComponente = new MicroProcesador(id, numeroSerie, marca, modelo, precio, cantDisponible, tipoConexion, velocidadProcesamiento);
							controlador.addComponente(nuevoComponente);
							
							String test = controlador.getComponentes().get(0).getId();
							JOptionPane.showConfirmDialog(null, "Se guardo bien: " + test);
							componenteView.updateTable();//Refreshes the table
						}catch(Exception ex) {
							JOptionPane.showConfirmDialog(null, "Description: " + ex);
						}
					}
				});
				btnCreate.setActionCommand("OK");
				buttonPane.add(btnCreate);
				getRootPane().setDefaultButton(btnCreate);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
