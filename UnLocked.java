package game_app;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class UnLocked {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnLocked window = new UnLocked();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public UnLocked() {
		initialize();
	}
   
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(280, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		
		
		JTextArea txtrJblugo = new JTextArea();
		txtrJblugo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrJblugo.setTabSize(15);
		txtrJblugo.setForeground(Color.WHITE);
		txtrJblugo.setBackground(Color.DARK_GRAY);
		txtrJblugo.setText("Wow.. This New Device i got as gift in Hubble Town is Amazing...");
		txtrJblugo.setBounds(10, 467, 518, 22);
		frame.getContentPane().add(txtrJblugo);
		
       
		JButton btnNewButton = new JButton("Open Door");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(751, 461, 139, 32);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		    	frame.dispose();
		        
		     }  
		    });
		ImageIcon imge = new ImageIcon("C:\\T1 HACK\\wall.jpeg");
		Image img=imge.getImage();
		Image imgscale= img.getScaledInstance(900,500, Image.SCALE_SMOOTH);
        ImageIcon Sicon= new ImageIcon(imgscale);
		JLabel lblNewLabel = new JLabel("",Sicon,SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 900, 500);
		frame.getContentPane().add(lblNewLabel);

	}
}
