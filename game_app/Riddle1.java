package game_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Riddle1 extends JFrame implements ActionListener{
	JLabel pgtitle,lbl_img,qn;
	JButton jbtn_submit;
	TextField txt_t1;
	
	Riddle1()
	{
		setLayout(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Riddle1 Page");
		
		pgtitle = new JLabel("Riddle 1", JLabel.CENTER);
		pgtitle.setFont(new Font("Castellar",Font.BOLD,35));
		pgtitle.setHorizontalAlignment(JLabel.CENTER);
		pgtitle.setBounds(250, 45, 400, 30);
		add(pgtitle);
		
		qn = new JLabel("What is found in the middle of both America and Australia?");
		qn.setFont(new Font("Times New Roman",Font.BOLD,25));
		qn.setHorizontalAlignment(JLabel.CENTER);
		qn.setForeground(Color.white);
		qn.setBounds(100, 150, 650, 30);
		add(qn);
		
		txt_t1 = new TextField();
		txt_t1.setBounds(350, 200, 200, 30);
		add(txt_t1);
		
		jbtn_submit = new JButton("Submit");
		jbtn_submit.setBounds(400, 300, 80, 25);
		jbtn_submit.setBackground(Color.cyan);
		Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_submit.setBorder(bevelBorder);
		add(jbtn_submit);
		jbtn_submit.addActionListener(this);
				
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\bg3.jpg");
		lbl_img = new JLabel("", img, JLabel.LEFT);
		lbl_img.setBounds(0, 0, 1000, 500);
		add(lbl_img);
		
		pack();
		setResizable(false);
		setVisible(true);
		setLocation(200, 150);
	}
	
	JFrame frame;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String a1 = txt_t1.getText();
		if(a1.length()==0 || a1==null)
			JOptionPane.showMessageDialog(this,"Please enter an answer!!");
		else {
		  try {
			BufferedReader br = null;
			br = new BufferedReader(new FileReader("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\qs.txt"));
			String str1 = "";
			if((str1=br.readLine())!=null)
			{
				String ss1[] = str1.split("@");
				if(a1.equals(ss1[0]) || a1.equals(ss1[1]) || a1.equals(ss1[2]) || a1.equals(ss1[3]) || a1.equals(ss1[4]))
				{
					JOptionPane.showMessageDialog(this,"Correct!!");
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(this,"Uh-oh!! Try again!!");
					txt_t1.setText("");
				}
			}
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this,ex.toString());
			
		}
	   }
	}
		
	public void getFrame()
	{
		setSize(900,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Riddle1 r1 = new Riddle1();
		r1.getFrame();
	}
}
