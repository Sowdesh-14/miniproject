package game_app;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Hacking {

	JFrame frame;
	private int lock = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hacking window = new Hacking();
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
	public Hacking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(850, 130, 322, 281);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		Image image = Toolkit.getDefaultToolkit().createImage("C:\\java-game\\hackin.gif");
		ImageIcon Sicon= new ImageIcon(image);
		JLabel lblNewLabel = new JLabel("",Sicon,SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 450, 300);
		frame.getContentPane().add(lblNewLabel);
	}
}
