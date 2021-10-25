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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.border.Border;

public class StoryPage8 extends JFrame implements ActionListener{
	JFrame window;
    JPanel textPanel;
    JTextArea textArea;
    JButton jbtn_next;
    JLabel lbl_img;
    Font normalFont = new Font("Courier New", Font.PLAIN, 23);
     
    String text;
    int i =0;
     
    Timer timer = new Timer(50, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             
            char character[] = text.toCharArray();
            int arrayNumber = character.length;
             
            String s = String.valueOf(character[i]);
             
            textArea.append(s);
             
            i++;
     
            if(i == arrayNumber){
                i = 0;
                timer.stop();
            }
        }       
    });
     
 
    public static void main(String[] args) {
        new StoryPage8();
    }
    
	
    public StoryPage8(){
         
        window = new JFrame();
        window.setSize(900,500);
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setLocation(200, 150);
        //window.pack();
        window.setResizable(false);
        
        jbtn_next = new JButton("Next");
		jbtn_next.setBounds(670, 420, 120, 25);
		jbtn_next.setBackground(Color.CYAN);
		jbtn_next.setForeground(Color.black);
        Border bevelBorder=BorderFactory.createBevelBorder(DEFAULT_CURSOR);
		jbtn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		jbtn_next.setBorder(bevelBorder);
		window.add(jbtn_next);
		jbtn_next.addActionListener(this);
		
		ImageIcon img = new ImageIcon("C:\\Users\\Mohana Sowdesh\\Desktop\\Mini project\\barguy.jpg");
    	lbl_img = new JLabel("", img, JLabel.LEFT);
    	lbl_img.setBounds(0, 0, 1000, 500);
    	window.add(lbl_img);
		
        textPanel = new JPanel();
        textPanel.setBounds(100, 100, 600, 250);
        textPanel.setBackground(Color.black);
        window.add(textPanel);
         
        textArea = new JTextArea();
        textArea.setBounds(100, 100, 600, 250);
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setFont(normalFont);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textPanel.add(textArea);
         
        window.setVisible(true);
         
        
		
		text = "BAR GUY: Hey!! You seem to be so busy with your tricky picky job always. What would you like to have?\r\n"
        		+ "YOU: Gimme the usual.Listen buddy. You know the recent theft happened in city bank ryt ! I found this there. Are you familiar with this ?";
        		
         
        timer.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	StoryPage9 sp9 = new StoryPage9();
		window.dispose();
	}
}
