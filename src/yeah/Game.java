package yeah;


import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;

	private JFrame frame;
	private Thread thread;
	public int x = 300;
	public int y = 30;
	public int addedx = 0;
	public int addedy = 0;
	public boolean q = false;
	
	
	
	
	
	
	

	public Game() {
		frame = new JFrame("Unicycle Posse");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Input.setup(this);
		this.setLayout(null);
		this.setFocusable(true);
		this.setVisible(true);
		frame.getContentPane().add(this);

		
	
		// fill the piece array ^

		frame.setUndecorated(true);
		JButton quitButton = new JButton("Quit");
		quitButton.setSize(frame.getWidth() / 15, frame.getHeight() / 50);
		quitButton.setLocation((int) (frame.getWidth() / 2 - quitButton.getWidth() / 2), 5);
		quitButton.addActionListener((e) -> {
			System.exit(0);
		});
		this.add(quitButton);

		JButton PASS = new JButton("Pass");
		PASS.setSize(1, 1);
		PASS.setLocation((int) (300), 30);
		PASS.addActionListener((e) -> {
			
		});
		//this.add(PASS);

		
		frame.setVisible(true);
	}

	public void start() {
		
		thread = new Thread(this, "Updater");
		thread.start();
	}
	public void update() {
		
		try{
			
			Robot robot = new Robot();
			if (Input.getKey(Key.D)) {
			addedx+=10;
			}
			if (Input.getKey(Key.A)) {
			addedx-=10;
			}
			if (Input.getKey(Key.W)) {
			addedy-=10;
			}
			if (Input.getKey(Key.S)) {
			addedy+=10;
			}
			if (Input.getKey(Key.ALT)) {
				addedy+=0;
				}
			if (Input.getKey(Key.DELETE)) {
				addedy+=0;
				}
			if (Input.getKey(Key.CONTROL)) {
				addedy+=0;
				}
			robot.mouseMove(x+addedx, y+addedy);
	        robot.mousePress(InputEvent.BUTTON1_MASK);
			if (Input.getKey(Key.K)) {
				
			System.out.println("click");
			
			 robot.mousePress(InputEvent.BUTTON1_MASK);
			}
			if (Input.getKey(Key.M)) {
				System.out.println("click");
				
				
				 robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
		}
			catch(AWTException e)
			{
				e.printStackTrace();
			}
		}

		// if dragging is true
		// draw the piece at the current mouse position

		// if dragging is true and mouse is released
		// set dragging to false
	




	public int getWidth() {
		return frame.getWidth();
	}

	public int getHeight() {
		return frame.getHeight();
	}



	@Override
	public void run() {
		try {
			while(true){
				this.update();
				Input.update();
				frame.repaint();
				Thread.sleep(1000 / 60);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void paintComponent(Graphics g) {
		
		
			
			}
		
	

	

	public static void main(String[] args) {

		new Game().start();
	}

}