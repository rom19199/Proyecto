import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LogInWindow {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JPanel panel;
	private JLabel lblNutriapp;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JButton btnLogIn;
	private JButton btnSignUp;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInWindow window = new LogInWindow();
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
	public LogInWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(12, 13, 408, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNutriapp = new JLabel("\uD835\uDCA9\uD835\uDCCA\uD835\uDCC9\uD835\uDCC7\uD835\uDCBE\uD835\uDC9C\uD835\uDCC5\uD835\uDCC5");
		lblNutriapp.setBounds(22, 13, 104, 22);
		panel.add(lblNutriapp);
		
		lblUsuario = new JLabel("Usuario ");
		lblUsuario.setBounds(76, 80, 56, 16);
		panel.add(lblUsuario);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(76, 121, 66, 16);
		panel.add(lblPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(159, 77, 116, 22);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(158, 118, 117, 22);
		panel.add(txtPassword);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(256, 189, 97, 25);
		panel.add(btnLogIn);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(81, 189, 97, 25);
		panel.add(btnSignUp);
	}
	
	public class Milistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource() == btnLogIn)
				{
					
				}
				
				if(e.getSource() == btnSignUp)
				{
					
				}
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(null, "Alguno de los datos ingresados es incorecto. Por favor reviselos.");
			}
		}
	}
}
