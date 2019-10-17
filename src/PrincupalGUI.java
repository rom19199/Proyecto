import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.sun.xml.internal.ws.api.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class PrincupalGUI {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtPassword;
	private JTextField txtPasswordSign;
	private JTextField txtUsuarioSign;
	private JTextField txtApellidoSign;
	private JTextField txtNombreSign;
	private JTextField txtAlturaSign;
	private JTextField txtPesoSign;
	private JTextField txtEdadSign;
	private JTextField txtHorasejercicioDia;
	private JTextField txtVecesEjercicioSemana;
	private JPanel panelLogSign;
	private JPanel panelSignUp;
	private JPanel panelAlimentacion;
	private JPanel panelCondicionFisica;
	private JButton btnSignIn;
	private JButton btnLogIn;
	private JButton btnSuscribirse;
	private JButton btnCalcularImc;
	private JButton btnEjercicio;
	private JLabel lblBienvenido;
	private Calendario calen = new Calendario();
	private Operaciones oper = new Operaciones();
	private JTextArea textAreaAlimentacion;
	private JTextArea textAreaCondicionFisica;
	private JLabel lblMasaCorporal;
	private ArrayList<Usuario> clientes = new ArrayList<Usuario>();
	private JLabel complexion;
	private int clienteActual;
	private Milistener action = new Milistener();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincupalGUI window = new PrincupalGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrincupalGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 778, 923);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList<String> BaseDatos = new ArrayList<String>();
		BaseDatos = oper.leerTxt("BaseDatos.txt");
		clientes = oper.leerBase(BaseDatos);
		System.out.println(BaseDatos);
		
		panelLogSign = new JPanel();
		panelLogSign.setLayout(null);
		panelLogSign.setBorder(new TitledBorder(null, "Log in/Sign in", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLogSign.setBounds(12, 13, 275, 208);
		frame.getContentPane().add(panelLogSign);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(35, 26, 62, 16);
		panelLogSign.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(102, 23, 116, 22);
		panelLogSign.add(txtUsuario);
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setBounds(12, 65, 88, 16);
		panelLogSign.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(102, 62, 116, 22);
		panelLogSign.add(txtPassword);
		
		btnSignIn = new JButton("Sign in");
		btnSignIn.setBounds(76, 114, 97, 25);
		btnSignIn.addActionListener(action);
		panelLogSign.add(btnSignIn);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(76, 149, 97, 25);
		btnLogIn.addActionListener(action);
		panelLogSign.add(btnLogIn);
		
		panelSignUp = new JPanel();
		panelSignUp.setLayout(null);
		panelSignUp.setBorder(new TitledBorder(null, "Sign up", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelSignUp.setBounds(299, 24, 455, 195);
		frame.getContentPane().add(panelSignUp);
		
		JLabel lblNombreSign = new JLabel("Nombre");
		lblNombreSign.setBounds(12, 34, 56, 16);
		panelSignUp.add(lblNombreSign);
		
		JLabel lblApelledioSign = new JLabel("Apellido");
		lblApelledioSign.setBounds(12, 63, 56, 16);
		panelSignUp.add(lblApelledioSign);
		
		JLabel lblUsuarioSign = new JLabel("Usuario");
		lblUsuarioSign.setBounds(12, 92, 56, 16);
		panelSignUp.add(lblUsuarioSign);
		
		JLabel lblContraseñaSign = new JLabel("Contrase\u00F1a");
		lblContraseñaSign.setBounds(12, 121, 76, 16);
		panelSignUp.add(lblContraseñaSign);
		
		txtPasswordSign = new JTextField();
		txtPasswordSign.setColumns(10);
		txtPasswordSign.setBounds(83, 118, 116, 22);
		panelSignUp.add(txtPasswordSign);
		
		txtUsuarioSign = new JTextField();
		txtUsuarioSign.setColumns(10);
		txtUsuarioSign.setBounds(80, 89, 116, 22);
		panelSignUp.add(txtUsuarioSign);
		
		txtApellidoSign = new JTextField();
		txtApellidoSign.setColumns(10);
		txtApellidoSign.setBounds(80, 60, 116, 22);
		panelSignUp.add(txtApellidoSign);
		
		txtNombreSign = new JTextField();
		txtNombreSign.setColumns(10);
		txtNombreSign.setBounds(80, 31, 116, 22);
		panelSignUp.add(txtNombreSign);
		
		btnSuscribirse = new JButton("Suscribirse");
		btnSuscribirse.setBounds(55, 157, 116, 25);
		btnSuscribirse.addActionListener(action);
		panelSignUp.add(btnSuscribirse);
		
		JLabel lblAlturaSign = new JLabel("Altura");
		lblAlturaSign.setBounds(249, 34, 43, 16);
		panelSignUp.add(lblAlturaSign);
		
		JLabel lblPesoSign = new JLabel("Peso");
		lblPesoSign.setBounds(249, 63, 35, 16);
		panelSignUp.add(lblPesoSign);
		
		txtAlturaSign = new JTextField();
		txtAlturaSign.setColumns(10);
		txtAlturaSign.setBounds(294, 31, 116, 22);
		panelSignUp.add(txtAlturaSign);
		
		txtPesoSign = new JTextField();
		txtPesoSign.setColumns(10);
		txtPesoSign.setBounds(294, 60, 116, 22);
		panelSignUp.add(txtPesoSign);
		
		JLabel lblEdadSign = new JLabel("Edad");
		lblEdadSign.setBounds(249, 92, 35, 16);
		panelSignUp.add(lblEdadSign);
		
		txtEdadSign = new JTextField();
		txtEdadSign.setColumns(10);
		txtEdadSign.setBounds(294, 89, 116, 22);
		panelSignUp.add(txtEdadSign);
		
		
		
		panelAlimentacion = new JPanel();
		panelAlimentacion.setLayout(null);
		panelAlimentacion.setBorder(new TitledBorder(null, "Alimentacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelAlimentacion.setBounds(12, 225, 736, 341);
		frame.getContentPane().add(panelAlimentacion);
		
		lblMasaCorporal = new JLabel("Su indice de masa corporal es de: ");
		lblMasaCorporal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMasaCorporal.setBounds(32, 112, 450, 16);
		panelAlimentacion.add(lblMasaCorporal);
		
		lblBienvenido = new JLabel("Bienvendio ");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBienvenido.setBounds(32, 33, 375, 16);
		panelAlimentacion.add(lblBienvenido);
		
		textAreaAlimentacion = new JTextArea();
		textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son:\r\n");
		textAreaAlimentacion.setFont(new Font("Courier New", Font.PLAIN, 12));
		textAreaAlimentacion.setBounds(32, 180, 692, 134);
		panelAlimentacion.add(textAreaAlimentacion);
		
		btnCalcularImc = new JButton("Calcular IMC y recomendaciones");
		btnCalcularImc.setBounds(32, 75, 238, 25);
		btnCalcularImc.addActionListener(action);
		panelAlimentacion.add(btnCalcularImc);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(32, 140, 375, 16);
		panelAlimentacion.add(label_11);
		
		complexion = new JLabel("New label");
		complexion.setBounds(329, 79, 278, 16);
		panelAlimentacion.add(complexion);
		
		panelCondicionFisica = new JPanel();
		panelCondicionFisica.setLayout(null);
		panelCondicionFisica.setBorder(new TitledBorder(null, "Condicion Fisica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCondicionFisica.setBounds(12, 569, 736, 294);
		frame.getContentPane().add(panelCondicionFisica);
		
		JLabel lblHorasEjercicio = new JLabel("\u00BFCuantas horas ejrcita al dia?");
		lblHorasEjercicio.setBounds(12, 32, 169, 16);
		panelCondicionFisica.add(lblHorasEjercicio);
		
		txtHorasejercicioDia = new JTextField();
		txtHorasejercicioDia.setColumns(10);
		txtHorasejercicioDia.setBounds(193, 29, 116, 22);
		panelCondicionFisica.add(txtHorasejercicioDia);
		
		JLabel lblVecesEjercicioSemana = new JLabel("\u00BFCuantas veces a la semana ejercita?");
		lblVecesEjercicioSemana.setBounds(12, 64, 231, 16);
		panelCondicionFisica.add(lblVecesEjercicioSemana);
		
		txtVecesEjercicioSemana = new JTextField();
		txtVecesEjercicioSemana.setColumns(10);
		txtVecesEjercicioSemana.setBounds(232, 61, 116, 22);
		panelCondicionFisica.add(txtVecesEjercicioSemana);
		
		textAreaCondicionFisica = new JTextArea();
		textAreaCondicionFisica.setBounds(12, 93, 712, 188);
		panelCondicionFisica.add(textAreaCondicionFisica);
		
		btnEjercicio = new JButton("Ingresar y mostrar resultados");
		btnEjercicio.setBounds(415, 28, 217, 25);
		btnEjercicio.addActionListener(action);
		panelCondicionFisica.add(btnEjercicio);
		
		for (java.awt.Component component : panelAlimentacion.getComponents()) {
			   component.setEnabled(false); 
			}
		for (java.awt.Component component : panelCondicionFisica.getComponents()) {
			   component.setEnabled(false); 
			}
		for (java.awt.Component component : panelSignUp.getComponents()) {
			   component.setEnabled(false); 
			}
	}
	
	public class Milistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource() == btnEjercicio)
				{
					
				}
				
				if(e.getSource() == btnCalcularImc)
				{
					String complex = oper.encontrarComplexion();
					//calen.setPesoKilogramos(Float.parseFloat(txtPesoSign.getText()));
					//calen.setEstaturaCentimetros(Float.parseFloat(txtAlturaSign.getText()));
					calen.setPesoKilogramos(Float.parseFloat(clientes.get(clienteActual).getPeso()));
					calen.setEstaturaCentimetros(Float.parseFloat(clientes.get(clienteActual).getAltura()));
					float imc = oper.encontrarMIC(calen);
					lblMasaCorporal.setText("Su indice de masa corporal es de: "+ String.valueOf(imc));
					textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son: " + oper.Dieta());
					complexion.setText(oper.encontrarComplexion());
					if(imc > 25)
					{
						textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son: " + (oper.leerTxt("IMCsobrepeso.txt")));
					//complexion.setText(oper.encontrarComplexion());
					}
	                else if (imc < 18){
	                	textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son: " + (oper.leerTxt("IMCbajo.txt")));
	                }
	                                
	                else if  (imc > 18 && imc < 25){
	                    textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son: " + (oper.leerTxt("IMCnormal.txt")));
	                              
	                }	
				}
				
				if(e.getSource() == btnLogIn)
				{
					boolean esta = false;
					for(int i = 0; i < clientes.size(); i++)
					{
						String dato = clientes.get(i).toString();
						if(dato.contains(txtUsuario.getText()) && dato.contains(txtPassword.getText()))
						{
							lblBienvenido.setText("Bienvenido "+ clientes.get(i).getNombre());
							clienteActual = oper.clienteActual(clientes.get(i).getNombre(), clientes);
							
							for (java.awt.Component component : panelLogSign.getComponents()) {
								   component.setEnabled(false); 
								}
							for (java.awt.Component component : panelAlimentacion.getComponents()) {
								   component.setEnabled(true); 
								}
							for (java.awt.Component component : panelCondicionFisica.getComponents()) {
								   component.setEnabled(true); 
								}
							esta = true;
						}
					}
					if(esta == false)
					{
						JOptionPane.showMessageDialog(null, "Los datos son incorectos porfavor intentelo de nuevo.");
					}
				}
				
				if(e.getSource() == btnSignIn)
				{
					for (java.awt.Component component : panelLogSign.getComponents()) {
						   component.setEnabled(false); 
						}
					for (java.awt.Component component : panelSignUp.getComponents()) {
						   component.setEnabled(true); 
						}
				}
				
				if(e.getSource() == btnSuscribirse)
				{
					Usuario persona;
					persona = new Usuario(txtNombreSign.getText(), txtApellidoSign.getText(), txtUsuarioSign.getText(), txtPasswordSign.getText(),
							txtAlturaSign.getText(), txtPesoSign.getText(), txtEdadSign.getText());
					clientes.add(persona);
					JOptionPane.showMessageDialog(null, "Se suscribido exitosamente, ahora haga el log in.");
					panelLogSign.setEnabled(true);
					panelSignUp.setEnabled(false);
					oper.escribir(clientes);
					
					for (java.awt.Component component : panelSignUp.getComponents()) {
						   component.setEnabled(false); 
						}
					for (java.awt.Component component : panelLogSign.getComponents()) {
						   component.setEnabled(true); 
						}
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Error en los datos.");
			}
		}
	}
}
