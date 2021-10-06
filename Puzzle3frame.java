package game_app;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Puzzle3frame extends JFrame implements ActionListener{
	JLabel lbl_l1,lbl_bgimg,lbl_img;
	JButton jbtn_play;
	
	Puzzle3frame()
	{
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Puzzle 3 Page");
		
		
		lbl_l1 = new JLabel("The image to be solved is", JLabel.CENTER);
		lbl_l1.setFont(new Font("Lucida",Font.BOLD,20));
		lbl_l1.setForeground(Color.BLACK);
		lbl_l1.setBounds(10, 20, 250, 30);
		add(lbl_l1);
		
		jbtn_play = new JButton("Play");
		jbtn_play.setBounds(180, 400, 80, 25);
		jbtn_play.setBackground(Color.cyan);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_play.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_play.setBorder(bevelBorder);
		add(jbtn_play);
		jbtn_play.addActionListener(this);
		
		
		lbl_img = new JLabel(new ImageIcon("C:\\Users\\Mohana Sowdesh\\Pictures\\Camera Roll\\img3.jpg"));
		lbl_img.setPreferredSize(new Dimension(70, 70));
		lbl_img.setBounds(70,80,300,300);
		add(lbl_img);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\bg3.jpg");
		lbl_bgimg = new JLabel("", img, JLabel.LEFT);
		lbl_bgimg.setBounds(0, 0, 1000, 500);
		add(lbl_bgimg);
		
		pack();
		setResizable(false);
		setVisible(true);
		setLocation(200, 150);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		Puzzle3 puzzle3 = new Puzzle3();
        puzzle3.setVisible(true);
	}
	
	JFrame frame;
	
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzle3frame p3 = new Puzzle3frame();
		p3.getFrame();
	}

}
