import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincupalGUI {

	private JFrame frame;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JButton btnSignUn;
	private JButton btnLogIn;
	private JPanel panelSignUp;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblUsuario_1;
	private JLabel lblContrasea_1;
	private JTextField txtContrasenaSingup;
	private JTextField txtUsuarioSignUp;
	private JTextField txtApellidoSignUp;
	private JTextField txtNombreSignUp;
	private JButton btnSuscribirse;
	private JLabel lblAltura;
	private JLabel lblPeso;
	private JTextField txtAlturaSignUp;
	private JTextField txtPesoSignUp;
	private JPanel panel_1;
	private JLabel lblIMC;
	private JLabel lblEdad;
	private JTextField txtEdadSignUp;
	private JLabel lblBienvenido;
	private JButton btnCalcularImc;
	private JPanel panel_2;
	private JLabel lblHorasEjercicio;
	private JTextField txtHorasEjercicio;
	private JLabel lblcuantasVecesA;
	private JTextField txtSemanaEjercicio;
	private JTextArea textAreaejercicio;
	private JButton btnIngresarYMostrar;
	private JLabel complexion;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private String peso;
	private String altura;
	private String edad;
	

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
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Log in/Sign in", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 13, 275, 208);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(54, 26, 43, 16);
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(102, 23, 116, 22);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(35, 65, 65, 16);
		panel.add(lblContrasea);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(102, 62, 116, 22);
		panel.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		btnSignUn = new JButton("Sign in");
		btnSignUn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSignUn.setBounds(76, 114, 97, 25);
		panel.add(btnSignUn);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setBounds(76, 149, 97, 25);
		panel.add(btnLogIn);
		
		panelSignUp = new JPanel();
		panelSignUp.setBorder(new TitledBorder(null, "Sign up", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelSignUp.setBounds(299, 24, 455, 195);
		frame.getContentPane().add(panelSignUp);
		panelSignUp.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 34, 56, 16);
		panelSignUp.add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(12, 63, 56, 16);
		panelSignUp.add(lblApellido);
		
		lblUsuario_1 = new JLabel("Usuario");
		lblUsuario_1.setBounds(12, 92, 56, 16);
		panelSignUp.add(lblUsuario_1);
		
		lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setBounds(12, 121, 76, 16);
		panelSignUp.add(lblContrasea_1);
		
		txtContrasenaSingup = new JTextField();
		txtContrasenaSingup.setBounds(83, 118, 116, 22);
		panelSignUp.add(txtContrasenaSingup);
		txtContrasenaSingup.setColumns(10);
		
		txtUsuarioSignUp = new JTextField();
		txtUsuarioSignUp.setBounds(80, 89, 116, 22);
		panelSignUp.add(txtUsuarioSignUp);
		txtUsuarioSignUp.setColumns(10);
		
		txtApellidoSignUp = new JTextField();
		txtApellidoSignUp.setBounds(80, 60, 116, 22);
		panelSignUp.add(txtApellidoSignUp);
		txtApellidoSignUp.setColumns(10);
		
		txtNombreSignUp = new JTextField();
		txtNombreSignUp.setBounds(80, 31, 116, 22);
		panelSignUp.add(txtNombreSignUp);
		txtNombreSignUp.setColumns(10);
		
		btnSuscribirse = new JButton("Suscribirse");
		btnSuscribirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombre = txtNombreSignUp.getText();
				apellido = txtApellidoSignUp.getText();
				usuario = txtUsuarioSignUp.getText();
				//contrasena = ttxtContrasenaSingup.getText();
				
				
			}
		});
		btnSuscribirse.setBounds(55, 157, 116, 25);
		panelSignUp.add(btnSuscribirse);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(249, 34, 43, 16);
		panelSignUp.add(lblAltura);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(249, 63, 35, 16);
		panelSignUp.add(lblPeso);
		
		txtAlturaSignUp = new JTextField();
		txtAlturaSignUp.setBounds(294, 31, 116, 22);
		panelSignUp.add(txtAlturaSignUp);
		txtAlturaSignUp.setColumns(10);
		
		txtPesoSignUp = new JTextField();
		txtPesoSignUp.setBounds(294, 60, 116, 22);
		panelSignUp.add(txtPesoSignUp);
		txtPesoSignUp.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(249, 92, 35, 16);
		panelSignUp.add(lblEdad);
		
		txtEdadSignUp = new JTextField();
		txtEdadSignUp.setBounds(294, 89, 116, 22);
		panelSignUp.add(txtEdadSignUp);
		txtEdadSignUp.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Alimentacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(12, 225, 736, 341);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblIMC = new JLabel("Su indice de masa corporal es de: ");
		lblIMC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIMC.setBounds(32, 112, 450, 16);
		panel_1.add(lblIMC);
		
		lblBienvenido = new JLabel("Bienvendio ");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBienvenido.setBounds(32, 33, 164, 16);
		panel_1.add(lblBienvenido);
		
		JTextArea textAreaAlimentacion = new JTextArea();
		textAreaAlimentacion.setFont(new Font("Courier New", Font.PLAIN, 12));
		textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son:\r\n");
		textAreaAlimentacion.setBounds(32, 180, 692, 134);
		panel_1.add(textAreaAlimentacion);
		
		btnCalcularImc = new JButton("Calcular IMC y recomendaciones");
		btnCalcularImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendario calen = new Calendario();
				Operaciones oper = new Operaciones();
				String complex = oper.encontrarComplexion();
				calen.setPesoKilogramos(Float.parseFloat(txtPesoSignUp.getText()));
				calen.setEstaturaCentimetros(Float.parseFloat(txtAlturaSignUp.getText()));
				float imc = oper.encontrarMIC(calen);
				lblIMC.setText("Su indice de masa corporal es de: "+ String.valueOf(imc));
				textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son: " + oper.Dieta());
				complexion.setText(oper.encontrarComplexion());
				
			}
		});
		btnCalcularImc.setBounds(32, 75, 238, 25);
		panel_1.add(btnCalcularImc);
		
		complexion = new JLabel("");
		complexion.setBounds(32, 140, 375, 16);
		panel_1.add(complexion);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Condicion Fisica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(12, 569, 736, 294);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblHorasEjercicio = new JLabel("\u00BFCuantas horas ejrcita al dia?");
		lblHorasEjercicio.setBounds(12, 32, 169, 16);
		panel_2.add(lblHorasEjercicio);
		
		txtHorasEjercicio = new JTextField();
		txtHorasEjercicio.setBounds(193, 29, 116, 22);
		panel_2.add(txtHorasEjercicio);
		txtHorasEjercicio.setColumns(10);
		
		lblcuantasVecesA = new JLabel("\u00BFCuantas veces a la semana ejercita?");
		lblcuantasVecesA.setBounds(12, 64, 231, 16);
		panel_2.add(lblcuantasVecesA);
		
		txtSemanaEjercicio = new JTextField();
		txtSemanaEjercicio.setBounds(232, 61, 116, 22);
		panel_2.add(txtSemanaEjercicio);
		txtSemanaEjercicio.setColumns(10);
		
		textAreaejercicio = new JTextArea();
		textAreaejercicio.setBounds(12, 93, 712, 188);
		panel_2.add(textAreaejercicio);
		
		btnIngresarYMostrar = new JButton("Ingresar y mostrar resultados");
		btnIngresarYMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones oper = new Operaciones();
				textAreaejercicio.setText(oper.Ejercicio());
			}
		});
		btnIngresarYMostrar.setBounds(415, 28, 217, 25);
		panel_2.add(btnIngresarYMostrar);
	}
}
