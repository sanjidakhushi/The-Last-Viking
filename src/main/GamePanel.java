package main;

import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.Mouseinputs;


public class GamePanel extends JPanel{
	
	private Mouseinputs mouseInputs;
	private int xDelta = 100 , yDelta= 100;
	
	
	
	public GamePanel() {
		
		mouseInputs= new Mouseinputs(this);
		
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs) ;
		addMouseMotionListener(mouseInputs);
		
		 setFocusable(true);        
	     requestFocusInWindow();
		
		
	}
	
	public void changeXDelta(int value) {
		this.xDelta += value;
		repaint();
	}
	public void changeYDelta(int value) {
		this.yDelta += value;
		repaint();
		
	}
	
	public void setRectPos(int x, int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(xDelta, yDelta, 200, 50);
	}

}
