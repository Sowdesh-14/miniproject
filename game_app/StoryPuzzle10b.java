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

public class StoryPuzzle10b extends JFrame{
	JLabel lbl_l1,lbl_bgimg,lbl_img;
	JButton jbtn_play,jbtn_next;
	
	StoryPuzzle10b()
	{
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Story Puzzle 10 Frame");
		
		jbtn_play = new JButton("Clue");
		jbtn_play.setBounds(180, 400, 80, 25);
		jbtn_play.setBackground(Color.cyan);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_play.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_play.setBorder(bevelBorder);
		add(jbtn_play);

		
		jbtn_next = new JButton("Next");
		jbtn_next.setBounds(670, 420, 120, 25);
		jbtn_next.setBackground(Color.CYAN);
		jbtn_next.setForeground(Color.black);
		jbtn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_next.setBorder(bevelBorder);
		add(jbtn_next);

		
		/*lbl_img = new JLabel(new ImageIcon("C:\\Users\\Mohana Sowdesh\\Pictures\\Camera Roll\\img3.jpg"));
		lbl_img.setPreferredSize(new Dimension(70, 70));
		lbl_img.setBounds(70,80,300,300);
		add(lbl_img);*/
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\thinking.jfif");
		lbl_bgimg = new JLabel("", img, JLabel.LEFT);
		lbl_bgimg.setBounds(0, 0, 1000, 500);
		add(lbl_bgimg);
		
		pack();
		setResizable(false);
		setVisible(true);
		setLocation(200, 150);
		setButtonListener();
	}
	
	public void setButtonListener()
	{
			jbtn_play.addActionListener(e -> {
				q1ActionPerformed(e);
			});
			jbtn_next.addActionListener(e -> {
				q2ActionPerformed(e);
			});
	}
	
	public void q1ActionPerformed(ActionEvent evt) {
		StoryPuzzle10a sp10a = new StoryPuzzle10a();
    	sp10a.setVisible(true);	
	}
	
	public void q2ActionPerformed(ActionEvent evt) {
		StoryPage11 sp11 = new StoryPage11();
    	sp11.setVisible(true);	
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
		StoryPuzzle10b sp10b = new StoryPuzzle10b();
		sp10b.getFrame();
	}

}
