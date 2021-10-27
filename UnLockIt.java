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

public class UnLockIt {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnLockIt window = new UnLockIt();
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
	public UnLockIt() {
		initialize();
	}
    private int lock;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(280, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		if(lock==1) {
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(772, 427, 89, 23);
			frame.getContentPane().add(btnNewButton_1);
		}
		
		JTextArea txtrJblugo = new JTextArea();
		txtrJblugo.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrJblugo.setTabSize(15);
		txtrJblugo.setForeground(Color.WHITE);
		txtrJblugo.setBackground(Color.DARK_GRAY);
		txtrJblugo.setText("Locked !.. There's definitely something out there. Let's See...");
		txtrJblugo.setBounds(10, 467, 518, 22);
		frame.getContentPane().add(txtrJblugo);
		
        if(lock==0) {
		JButton btnNewButton = new JButton("Unlock");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(751, 461, 139, 32);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){  
		    public void actionPerformed(ActionEvent e){  
		    	PuzzleDevice p2 = new PuzzleDevice();
		        p2.setVisible(true);
		       
		     }  
		    });
        }
		ImageIcon imge = new ImageIcon("C:\\T1 HACK\\wall.jpeg");
		Image img=imge.getImage();
		Image imgscale= img.getScaledInstance(900,500, Image.SCALE_SMOOTH);
        ImageIcon Sicon= new ImageIcon(imgscale);
		JLabel lblNewLabel = new JLabel("",Sicon,SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 900, 500);
		frame.getContentPane().add(lblNewLabel);

	}
}
