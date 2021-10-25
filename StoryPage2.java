package game_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class StoryPage2 extends JFrame implements ActionListener{
	JLabel pgtitle,lbl_img;
	JButton jbtn_next;
	
	StoryPage2()
	{
		setLayout(null);
		setTitle("Story Mode Page 2");
		
		jbtn_next = new JButton("Next");
		jbtn_next.setBounds(670, 420, 120, 25);
		jbtn_next.setBackground(new Color(173,20,84));
		jbtn_next.setForeground(Color.white);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_next.setBorder(bevelBorder);
		add(jbtn_next);
		jbtn_next.addActionListener(this);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\StartPage4.jpg");
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
		StoryPage4 sp4 = new StoryPage4();
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
		StoryPage2 sp2 = new StoryPage2();
		sp2.getFrame();
	}
}
