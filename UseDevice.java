package game_app;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class UseDevice {

	JFrame frame;
	protected int lock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UseDevice window = new UseDevice();
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
	public UseDevice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = null;
		frame = new JFrame();
		frame.setBounds(350, 130, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(10, 272, 130, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(123, 11, 22, 63);
		frame.getContentPane().add(lblNewLabel_3);
		
		ImageIcon imge = new ImageIcon("C:\\java-game\\hack.jpg");
		Image img=imge.getImage();
		Image imgscale= img.getScaledInstance(221, 300, Image.SCALE_SMOOTH);
        ImageIcon Sicon= new ImageIcon(imgscale);
		JLabel lblNewLabel = new JLabel("",Sicon,SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 221, 300);
		frame.getContentPane().add(lblNewLabel);
		
		ImageIcon imge_1 = new ImageIcon("C:\\java-game\\det.jpg");
		Image img_1=imge_1.getImage();
		Image imgscale_1= img_1.getScaledInstance(228, 225, Image.SCALE_SMOOTH);
        ImageIcon Sicon_1= new ImageIcon(imgscale_1);
		JLabel lblNewLabel_1 = new JLabel("",Sicon_1,SwingConstants.CENTER);
		lblNewLabel_1.setBounds(222, 0, 228, 225);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Hack NOw");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(247, 222, 175, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){
		    	lblNewLabel_3.setText(".");
		    	lblNewLabel_4.setText("Activating...");
		    	 Hacking window = new Hacking();
			    	window.frame.setVisible(true);
		    	 JOptionPane.showMessageDialog(panel, "DOOR Unlocked",
		                    "PASSWORD HACKING DEVICE", JOptionPane.INFORMATION_MESSAGE);
		         this.dispose();
		         window.frame.setVisible(false);
		         UnLocked window2 = new UnLocked();
				 window2.frame.setVisible(true);
				 
		     }

			private void dispose() {
				// TODO Auto-generated method stub
				frame.dispose();
			}  
		    });
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Press Hack NOw to unlock");
		lblNewLabel_2.setForeground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(247, 256, 175, 44);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
	}
}
