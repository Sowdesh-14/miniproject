package game_app;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

public class HomePage extends JFrame implements ActionListener{
	JLabel lbl_l1,lbl_l2,lbl_img;
	TextField txt_t1;
	JButton jbtn_b1;
	
	
	HomePage() 
	{
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Home Page");
		
		lbl_l1 = new JLabel("Aventura", JLabel.CENTER);
		lbl_l1.setForeground(Color.WHITE);
		lbl_l2 = new JLabel("How can we call you? ");
		lbl_l2.setForeground(Color.WHITE);
		txt_t1 = new TextField();
		jbtn_b1 = new JButton("Submit");
		
		
		lbl_l1.setFont(new Font("Castellar",Font.BOLD,40));
		lbl_l1.setHorizontalAlignment(JLabel.CENTER);
		lbl_l2.setFont(new Font("Lucida",Font.BOLD,16));
		lbl_l1.setBounds(300, 50, 300, 30);
		lbl_l2.setBounds(300, 200, 200, 25);
		txt_t1.setBounds(500, 200, 100, 30);
		jbtn_b1.setBounds(400, 300, 80, 25);
		jbtn_b1.setBackground(Color.cyan);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_b1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_b1.setBorder(bevelBorder);
		
		jbtn_b1.addActionListener(this);
		
		
		add(lbl_l1);
		add(lbl_l2);
		add(txt_t1);
		add(jbtn_b1);
		
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\bg3.jpg");
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
		String name = txt_t1.getText();
		try 
		{
			if(name.length()>5)
			{
				JOptionPane.showMessageDialog(this, "Ok!!");
				MenuPage p = new MenuPage(name);
				p.getFrame();
				p.setVisible(true);
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Please enter a valid name!!");
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, ex.toString());
		}
	}
	
	JFrame frame;
	
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new HomePage().getFrame();
	}
}
