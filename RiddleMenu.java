package game_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class RiddleMenu extends JFrame{
	JLabel pgtitle,lbl_img;
	JButton q1,q2,q3,q4,q5;
	
	RiddleMenu()
	{
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Riddle Menu Page");
		
		
		pgtitle = new JLabel("Riddles Menu", JLabel.CENTER);
		pgtitle.setFont(new Font("Castellar",Font.BOLD,40));
		pgtitle.setHorizontalAlignment(JLabel.CENTER);
		pgtitle.setBounds(300, 50, 400, 30);
		add(pgtitle);
		
		
		q1 = new JButton("Question 1");
		q1.setBounds(400, 200, 120, 25);
		q1.setBackground(Color.cyan);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		q1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		q1.setBorder(bevelBorder);
		add(q1);
		
		q2 = new JButton("Question 2");
		q2.setBounds(400, 250, 120, 25);
		q2.setBackground(Color.cyan);
		q2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		q2.setBorder(bevelBorder);
		add(q2);
		
		q3 = new JButton("Question 3");
		q3.setBounds(400, 300, 120, 25);
		q3.setBackground(Color.cyan);
		q3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		q3.setBorder(bevelBorder);
		add(q3);
		
		q4 = new JButton("Question 4");
		q4.setBounds(400, 350, 120, 25);
		q4.setBackground(Color.cyan);
		q4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		q4.setBorder(bevelBorder);
		add(q4);
		
		q5 = new JButton("Question 5");
		q5.setBounds(400, 400, 120, 25);
		q5.setBackground(Color.cyan);
		q5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		q5.setBorder(bevelBorder);
		add(q5);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\bg3.jpg");
		lbl_img = new JLabel("", img, JLabel.LEFT);
		lbl_img.setBounds(0, 0, 1000, 500);
		add(lbl_img);
		
		pack();
		setResizable(false);
		setVisible(true);
		setButtonListener();
		setLocation(200, 150);
	}
	
	public void setButtonListener()
	{
			q1.addActionListener(e -> {
				q1ActionPerformed(e);
			});
			q2.addActionListener(e -> {
				q2ActionPerformed(e);
			});
			q3.addActionListener(e -> {
				q3ActionPerformed(e);
			});
			q4.addActionListener(e -> {
				q4ActionPerformed(e);
			});
			q5.addActionListener(e -> {
				q5ActionPerformed(e);
			});
	}
	
	public void q1ActionPerformed(ActionEvent evt) {
		Riddle1 r1 = new Riddle1();
		r1.getFrame();
		r1.setVisible(true);	
	}
	
	public void q2ActionPerformed(ActionEvent evt) {
		Riddle2 r2 = new Riddle2();
		r2.getFrame();
		r2.setVisible(true);	
	}
	
	public void q3ActionPerformed(ActionEvent evt) {
		Riddle3 r3 = new Riddle3();
		r3.getFrame();
		r3.setVisible(true);
	}
	
	public void q4ActionPerformed(ActionEvent evt) {
		Riddle4 r4 = new Riddle4();
		r4.getFrame();
		r4.setVisible(true);
	}
	
	public void q5ActionPerformed(ActionEvent evt) {
		Riddle5 r5 = new Riddle5();
		r5.getFrame();
		r5.setVisible(true);
	}
	
	JFrame frame;
	
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RiddleMenu rm = new RiddleMenu();
		rm.getFrame();
	}

}
