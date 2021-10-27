package game_app;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class TheLock {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheLock window = new TheLock();
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
	public TheLock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(470, 150, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(207, 11, 233, 216);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(270, 252, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		ImageIcon imge = new ImageIcon("C:\\java-game\\wall.jpg");
		Image img=imge.getImage();
		Image imgscale= img.getScaledInstance(900,500, Image.SCALE_SMOOTH);
        ImageIcon Sicon= new ImageIcon(imgscale);
		JLabel lblNewLabel = new JLabel("",Sicon,SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 450, 300);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
