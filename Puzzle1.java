package game_app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



class MyButton1 extends JButton {

    private boolean isLastButton;

    public MyButton1() {

        super();

        initUI();
    }

    public MyButton1(Image image) {

        super(new ImageIcon(image));

        initUI();
    }

    private void initUI() {

        isLastButton = false;
        BorderFactory.createLineBorder(Color.gray);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.red));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
    }

    public void setLastButton() {
        
        isLastButton = true;
    }

    public boolean isLastButton() {

        return isLastButton;
    }
}

public class Puzzle1 extends JFrame {
	
    private JPanel panel;
    private BufferedImage source;
    private BufferedImage resized;    
    private Image image;
    private MyButton1 lastButton;
    private int width, height;    
    
    private List<MyButton1> buttons;
    private List<Point> solution;

    private final int NUMBER_OF_BUTTONS = 4;
    private final int DESIRED_WIDTH = 300;

    public Puzzle1() {

        initUI();
    }

    private void initUI() {

        solution = new ArrayList<>();
        
        solution.add(new Point(0, 0));
        solution.add(new Point(0, 1));
        
        solution.add(new Point(1, 0));
        solution.add(new Point(1, 1));
        

        buttons = new ArrayList<>();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel.setLayout(new GridLayout(2, 2, 0, 0));

        try {
            source = loadImage();
            int h = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, h,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            Logger.getLogger(Puzzle1.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

        width = resized.getWidth(null);
        height = resized.getHeight(null);

        add(panel, BorderLayout.CENTER);

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                image = createImage(new FilteredImageSource(resized.getSource(),
                        new CropImageFilter(j * width / 2, i * height / 2,
                                (width / 2), height / 2)));
                
                MyButton1 button = new MyButton1(image);
                button.putClientProperty("position", new Point(i, j));

                if (i == 1 && j == 1) {
                    lastButton = new MyButton1();
                    lastButton.setBorderPainted(false);
                    lastButton.setContentAreaFilled(false);
                    lastButton.setLastButton();
                    lastButton.putClientProperty("position", new Point(i, j));
                } else {
                    buttons.add(button);
                }
            }
        }

        Collections.shuffle(buttons);
        buttons.add(lastButton);

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {

            MyButton1 btn = buttons.get(i);
            panel.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.gray));
            btn.addActionListener(new ClickAction());
        }

        pack();
        setTitle("Puzzle 1");
        setResizable(false);
        setLocation(500, 150);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private int getNewHeight(int w, int h) {

        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }

    private BufferedImage loadImage() throws IOException {

        BufferedImage bimg = ImageIO.read(new File("C:\\Users\\Mohana Sowdesh\\Pictures\\Camera Roll\\img1.jpg"));

        return bimg;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width,
            int height, int type) throws IOException {

        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }

    private class ClickAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            checkButton(e);
            checkSolution();
        }

        private void checkButton(ActionEvent e) {

            int lidx = 0;
            
            for (MyButton1 button : buttons) {
                if (button.isLastButton()) {
                    lidx = buttons.indexOf(button);
                }
            }

            JButton button = (JButton) e.getSource();
            int bidx = buttons.indexOf(button);

            if ((bidx - 1 == lidx) || (bidx + 1 == lidx)
                    || (bidx - 2 == lidx) || (bidx + 2 == lidx)) {
                Collections.swap(buttons, bidx, lidx);
                updateButtons();
            }
        }

        private void updateButtons() {

            panel.removeAll();

            for (JComponent btn : buttons) {

                panel.add(btn);
            }

            panel.validate();
        }
    }

    private void checkSolution() {

        List<Point> current = new ArrayList<>();

        for (JComponent btn : buttons) {
            current.add((Point) btn.getClientProperty("position"));
        }

        if (compareList(solution, current)) {
            JOptionPane.showMessageDialog(panel, "Finished!!",
                    "Congratulation", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static boolean compareList(List ls1, List ls2) {
        
        return ls1.toString().contentEquals(ls2.toString());
    }

    public static void main(String[] args) {
    	Puzzle1 puzzle = new Puzzle1();
        puzzle.setVisible(true);
    }
}
