import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpWindow {

	private JFrame frame;
	private JTextField txtNombreSignUp;
	private JLabel lblNutriApp;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblUsuario;
	private JLabel lblPasswordSignUp;
	private JLabel lblPassword;
	private JTextField txtApellidoSignUp;
	private JTextField txtUsuarioSignUp;
	private JPasswordField PasswordSignUp;
	private JLabel lblAltura;
	private JLabel lblPeso;
	private JLabel lblEdad;
	private JTextField txtAlturaSignUp;
	private JTextField txtPesoSignUp;
	private JTextField txtEdadSignUp;
	private JButton btnEmpezar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpWindow window = new SignUpWindow();
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
	public SignUpWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 634, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNutriApp = new JLabel("NutriApp");
		lblNutriApp.setFont(new Font("Segoe Script", Font.BOLD, 20));
		lblNutriApp.setBounds(24, 26, 122, 29);
		frame.getContentPane().add(lblNutriApp);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(52, 89, 56, 16);
		frame.getContentPane().add(lblNombre);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(52, 133, 56, 16);
		frame.getContentPane().add(lblApellido);
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(52, 183, 56, 16);
		frame.getContentPane().add(lblUsuario);
		
		lblPasswordSignUp = new JLabel("Password");
		lblPasswordSignUp.setBounds(52, 225, 56, 16);
		frame.getContentPane().add(lblPasswordSignUp);
		
		txtNombreSignUp = new JTextField();
		txtNombreSignUp.setBounds(119, 86, 116, 22);
		frame.getContentPane().add(txtNombreSignUp);
		txtNombreSignUp.setColumns(10);
		
		txtApellidoSignUp = new JTextField();
		txtApellidoSignUp.setBounds(120, 130, 116, 22);
		frame.getContentPane().add(txtApellidoSignUp);
		txtApellidoSignUp.setColumns(10);
		
		txtUsuarioSignUp = new JTextField();
		txtUsuarioSignUp.setBounds(120, 180, 116, 22);
		frame.getContentPane().add(txtUsuarioSignUp);
		txtUsuarioSignUp.setColumns(10);
		
		PasswordSignUp = new JPasswordField();
		PasswordSignUp.setBounds(120, 222, 116, 22);
		frame.getContentPane().add(PasswordSignUp);
		
		lblAltura = new JLabel("Altura");
		lblAltura.setBounds(294, 89, 56, 16);
		frame.getContentPane().add(lblAltura);
		
		lblPeso = new JLabel("Peso (kg)");
		lblPeso.setBounds(294, 133, 56, 16);
		frame.getContentPane().add(lblPeso);
		
		lblEdad = new JLabel("Edad (a\u00F1os)");
		lblEdad.setBounds(294, 183, 69, 16);
		frame.getContentPane().add(lblEdad);
		
		txtAlturaSignUp = new JTextField();
		txtAlturaSignUp.setBounds(376, 86, 116, 22);
		frame.getContentPane().add(txtAlturaSignUp);
		txtAlturaSignUp.setColumns(10);
		
		txtPesoSignUp = new JTextField();
		txtPesoSignUp.setBounds(376, 133, 116, 22);
		frame.getContentPane().add(txtPesoSignUp);
		txtPesoSignUp.setColumns(10);
		
		txtEdadSignUp = new JTextField();
		txtEdadSignUp.setBounds(375, 180, 116, 22);
		frame.getContentPane().add(txtEdadSignUp);
		txtEdadSignUp.setColumns(10);
		
		btnEmpezar = new JButton("Empezar");
		btnEmpezar.setBounds(49, 309, 97, 25);
		frame.getContentPane().add(btnEmpezar);
	}

	public class Milistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource() == btnEmpezar)
				{
					
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Alguno de los datos no es valido.");
			}
		}
	}
}
