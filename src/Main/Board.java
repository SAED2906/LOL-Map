package Main;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Board extends JPanel {

    boolean black = true;

    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawOval(0, 0, 24, 523);
//        System.out.println("test");
//        
//        try {
//			test.draw(g);
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
    }

    public static void createAndShowGui() throws AWTException {
        JFrame frame = new JFrame();
        frame.add(new Board());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 800);
        test.draw(frame.getGraphics());
       

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
					createAndShowGui();
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
}