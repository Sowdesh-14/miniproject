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

public class PuzzleMenu extends JFrame{
	
	JLabel pgtitle,lbl_img;
	JButton l1,l2,l3,l4;
	
	PuzzleMenu()
	{
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Puzzle Menu Page");
		
		
		pgtitle = new JLabel("Puzzles Menu", JLabel.CENTER);
		pgtitle.setFont(new Font("Castellar",Font.BOLD,40));
		pgtitle.setHorizontalAlignment(JLabel.CENTER);
		pgtitle.setBounds(300, 50, 400, 30);
		add(pgtitle);
		
		
		l1 = new JButton("Level 1");
		l1.setBounds(400, 200, 120, 25);
		l1.setBackground(Color.cyan);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		l1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		l1.setBorder(bevelBorder);
		add(l1);
		
		l2 = new JButton("Level 2");
		l2.setBounds(400, 250, 120, 25);
		l2.setBackground(Color.cyan);
		l2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		l2.setBorder(bevelBorder);
		add(l2);
		
		l3 = new JButton("Level 3");
		l3.setBounds(400, 300, 120, 25);
		l3.setBackground(Color.cyan);
		l3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		l3.setBorder(bevelBorder);
		add(l3);
		
		//l4 = new JButton("Level 4");
		//l4.setBounds(400, 350, 120, 25);
		//add(l4);
		
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
			l1.addActionListener(e -> {
				l1ActionPerformed(e);
			});
			l2.addActionListener(e -> {
				l2ActionPerformed(e);
			});
			l3.addActionListener(e -> {
				l3ActionPerformed(e);
			});
			/*l4.addActionListener(e -> {
				l4ActionPerformed(e);
			});*/
	}
	
	public void l1ActionPerformed(ActionEvent evt) {
		Puzzle1 p1 = new Puzzle1();
		p1.setVisible(true);	
	}
	
	public void l2ActionPerformed(ActionEvent evt) {
		Puzzle2 p2 = new Puzzle2();
		p2.setVisible(true);	
	}
	
	public void l3ActionPerformed(ActionEvent evt) {
		Puzzle3frame p3 = new Puzzle3frame();
		p3.getFrame();
	}
	
	public void l4ActionPerformed(ActionEvent evt) {
		//PuzzleMenu pm = new PuzzleMenu();
		//pm.getFrame();
		//pm.setVisible(true);
		
	}
	
	JFrame frame;
	
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuzzleMenu pm = new PuzzleMenu();
		pm.getFrame();
	}

}
