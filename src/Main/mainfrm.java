package Main;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class mainfrm extends JFrame {

	private JPanel contentPane;
	public static Canvas canvas;

	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainfrm frame = new mainfrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public mainfrm() throws AWTException, InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		canvas = new Canvas();
		//canvas.paint(getGraphics());
		canvas.setBounds(0, 0, 884, 861);
		canvas.setVisible(true);
		contentPane.add(canvas);
//		Main.start();
//		
//		boolean running = true;
//
//	    BufferStrategy bufferStrategy;
//	    Graphics graphics;
//
//	    while (running) {
//	        bufferStrategy = canvas.getBufferStrategy();
//	        graphics = bufferStrategy.getDrawGraphics();
//	        graphics.clearRect(0, 0, 100, 100);
//
//	        graphics.setColor(Color.GREEN);
//	        graphics.drawString("This is some text placed in the top left corner.", 5, 15);
//
//	        bufferStrategy.show();
//	        graphics.dispose();
//	    }
	}
}
