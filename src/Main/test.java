package Main;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class test {
	
	public static void draw(Graphics g) throws AWTException {
		Thread t = new Thread() {
			public void run() {
				while(true) {
		try {
			Thread.sleep(16);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Rectangle screenRect = new Rectangle(2188, 1050, 370, 390);
		//System.out.println(mainfrm.canvas.getGraphics());
		BufferedImage capture;
		try {
			capture = new Robot().createScreenCapture(screenRect);
			
			 Image tmp = capture.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
			   
			
			g.drawImage(tmp, 0, 0, null);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				}
			}
		};t.start();
	}

}
