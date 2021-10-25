package game_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.AudioInputStream;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class StoryMenu extends JFrame implements ActionListener{
	
	JLabel pgtitle,lbl_img;
	JButton jbtn_next;
	
	StoryMenu()
	{
		setLayout(null);
		setTitle("Story Mode Menu Page");
		
		
		pgtitle = new JLabel("Solve the mystery...", JLabel.CENTER);
		pgtitle.setForeground(Color.WHITE);
		pgtitle.setFont(new Font("Castellar",Font.BOLD,30));
		pgtitle.setHorizontalAlignment(JLabel.CENTER);
		pgtitle.setBounds(250, 200, 450, 30);
		add(pgtitle);
		
		jbtn_next = new JButton("Next");
		jbtn_next.setBounds(670, 420, 120, 25);
		jbtn_next.setBackground(new Color(227,136,84,255));
		jbtn_next.setForeground(Color.white);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_next.setBorder(bevelBorder);
		add(jbtn_next);
		jbtn_next.addActionListener(this);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\StartPage3.jpg");
		lbl_img = new JLabel("", img, JLabel.LEFT);
		lbl_img.setBounds(0, 0, 1000, 500);
		add(lbl_img);
		
		pack();
		setResizable(false);
		setVisible(true);
		setLocation(200, 150);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		StoryPage1 sp1 = new StoryPage1();
		dispose();
	}
	
	JFrame frame;
	
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoryMenu sm = new StoryMenu();
		sm.getFrame();
	}
}
