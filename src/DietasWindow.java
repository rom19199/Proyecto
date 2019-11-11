import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class DietasWindow {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DietasWindow window = new DietasWindow();
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
	public DietasWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 922, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dieta Recomendada", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 61, 880, 406);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		label = new JLabel("NutriApp");
		label.setBounds(22, 13, 132, 35);
		frame.getContentPane().add(label);
		label.setFont(new Font("Script MT Bold", Font.BOLD, 28));
	}

}
