import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class NutriExcersiceWindow {

	private JFrame frame;
	private JPanel panelAlimentacion;
	private JLabel lblIMC;
	private JLabel lblBienvenido;
	private JTextArea textAreaAlimentacion;
	private JButton btnIMC;
	private JLabel lblComplexion;
	private JPanel panelCondicionFisica;
	private JLabel lblHorasEjercicio;
	private JTextField txtHorasEjercicio;
	private JLabel lblVecesSemana;
	private JTextField txtVecesSemana;
	private JTextArea textArea;
	private JButton btnResultados;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NutriExcersiceWindow window = new NutriExcersiceWindow();
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
	public NutriExcersiceWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1111, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panelAlimentacion = new JPanel();
		panelAlimentacion.setLayout(null);
		panelAlimentacion.setBorder(new TitledBorder(null, "Alimentacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelAlimentacion.setBounds(12, 13, 539, 478);
		frame.getContentPane().add(panelAlimentacion);
		
		lblIMC = new JLabel("Su indice de masa corporal es de: ");
		lblIMC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIMC.setBounds(32, 112, 450, 16);
		panelAlimentacion.add(lblIMC);
		
		lblBienvenido = new JLabel("Bienvendio ");
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBienvenido.setBounds(32, 33, 164, 16);
		panelAlimentacion.add(lblBienvenido);
		
		textAreaAlimentacion = new JTextArea();
		textAreaAlimentacion.setText("Algunas recomendaciones de alimentacion son:\r\n");
		textAreaAlimentacion.setFont(new Font("Courier New", Font.PLAIN, 12));
		textAreaAlimentacion.setBounds(12, 189, 504, 276);
		panelAlimentacion.add(textAreaAlimentacion);
		
		btnIMC = new JButton("Calcular IMC y recomendaciones");
		btnIMC.setBounds(32, 75, 238, 25);
		panelAlimentacion.add(btnIMC);
		
		lblComplexion = new JLabel("");
		lblComplexion.setBounds(32, 140, 375, 16);
		panelAlimentacion.add(lblComplexion);
		
		panelCondicionFisica = new JPanel();
		panelCondicionFisica.setLayout(null);
		panelCondicionFisica.setBorder(new TitledBorder(null, "Condicion Fisica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCondicionFisica.setBounds(556, 68, 532, 423);
		frame.getContentPane().add(panelCondicionFisica);
		
		lblHorasEjercicio = new JLabel("\u00BFCuantas horas ejrcita al dia?");
		lblHorasEjercicio.setBounds(12, 34, 169, 16);
		panelCondicionFisica.add(lblHorasEjercicio);
		
		txtHorasEjercicio = new JTextField();
		txtHorasEjercicio.setColumns(10);
		txtHorasEjercicio.setBounds(193, 32, 116, 22);
		panelCondicionFisica.add(txtHorasEjercicio);
		
		lblVecesSemana = new JLabel("\u00BFCuantas veces a la semana ejercita?");
		lblVecesSemana.setBounds(12, 67, 231, 16);
		panelCondicionFisica.add(lblVecesSemana);
		
		txtVecesSemana = new JTextField();
		txtVecesSemana.setColumns(10);
		txtVecesSemana.setBounds(232, 64, 116, 22);
		panelCondicionFisica.add(txtVecesSemana);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 130, 508, 280);
		panelCondicionFisica.add(textArea);
		
		btnResultados = new JButton("Resultados\r\n");
		btnResultados.setBounds(370, 62, 116, 25);
		panelCondicionFisica.add(btnResultados);
		
		label = new JLabel("NutriApp");
		label.setFont(new Font("Script MT Bold", Font.BOLD, 28));
		label.setBounds(563, 13, 200, 42);
		frame.getContentPane().add(label);
	}

	public class Milistener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			try
			{
				if(e.getSource() == btnIMC)
				{
					
				}
				
				if(e.getSource() == btnResultados)
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
