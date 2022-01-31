package Main;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Main {
	
	public static void start() throws AWTException, InterruptedException {
		
//		for (int i = 0; i < 2; i--) {
//		
//		PointerInfo a = MouseInfo.getPointerInfo();
//		Point b = a.getLocation();
//		int x = (int) b.getX();
//		int y = (int) b.getY();
//		System.out.println("X:" +x );
//		System.out.println("Y:" + y + "\n");
//		
//		Thread.sleep(16);
//		}
		
		Thread t = new Thread() {
			public void run() {
				while(true) {
				try {
					Thread.sleep(16);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Rectangle screenRect = new Rectangle(2188, 1068, 50, 50);
				try {
					System.out.println(mainfrm.canvas.getGraphics());
					BufferedImage capture = new Robot().createScreenCapture(screenRect);
					
					mainfrm.canvas.getGraphics().drawImage(capture, 0,0, null);
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		};
		t.start();
		
		
		
	}

}
