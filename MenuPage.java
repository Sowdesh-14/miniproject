package game_app;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class MenuPage extends JFrame{
	
	JLabel welcome;
	JLabel lbl_img;
	JButton jbtn_storymode,jbtn_riddle,jbtn_puzzle;
	
	MenuPage(String name)
	{
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menu Page");
		
		
		welcome = new JLabel("Hi "+name+"!!", JLabel.CENTER);
		welcome.setFont(new Font("Castellar",Font.BOLD,40));
		welcome.setHorizontalAlignment(JLabel.CENTER);
		welcome.setBounds(300, 50, 400, 30);
		add(welcome);
		
		
		jbtn_storymode = new JButton("Story Mode");
		jbtn_storymode.setBounds(400, 200, 120, 25);
		jbtn_storymode.setBackground(Color.cyan);
		jbtn_storymode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_storymode.setBorder(bevelBorder);
		add(jbtn_storymode);
		
		jbtn_riddle = new JButton("Riddles");
		jbtn_riddle.setBounds(400, 250, 120, 25);
		jbtn_riddle.setBackground(Color.cyan);
		jbtn_riddle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_riddle.setBorder(bevelBorder);
		add(jbtn_riddle);
		
		jbtn_puzzle = new JButton("Puzzles");
		jbtn_puzzle.setBounds(400, 300, 120, 25);
		jbtn_puzzle.setBackground(Color.cyan);
		jbtn_puzzle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_puzzle.setBorder(bevelBorder);
		add(jbtn_puzzle);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\bg3.jpg");
		lbl_img = new JLabel("", img, JLabel.LEFT);
		lbl_img.setBounds(0, 0, 1000, 500);
		add(lbl_img);
		
		pack();
		setResizable(false);
		setVisible(true);
		setLocation(200, 150);
		setButtonListener();
	}
	
	public void setButtonListener()
	{
			jbtn_storymode.addActionListener(e -> {
				jbtn_storymodeActionPerformed(e);
			});
			jbtn_riddle.addActionListener(e -> {
				jbtn_riddleActionPerformed(e);
			});
			jbtn_puzzle.addActionListener(e -> {
				jbtn_puzzleActionPerformed(e);
			});

	}
	
	public void jbtn_storymodeActionPerformed(ActionEvent evt) {
		StoryMenu sm = new StoryMenu();
		sm.getFrame();
	}
	
	public void jbtn_riddleActionPerformed(ActionEvent evt) {
		RiddleMenu rm = new RiddleMenu();
		rm.getFrame();
		rm.setVisible(true);
	}
			
	public void jbtn_puzzleActionPerformed(ActionEvent evt) {
		PuzzleMenu pm = new PuzzleMenu();
		pm.getFrame();
		pm.setVisible(true);
	}	
	
	public MenuPage() {
		// TODO Auto-generated constructor stub
	}

	JFrame frame;
	
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuPage mp = new MenuPage();
		mp.getFrame();
	}

}
