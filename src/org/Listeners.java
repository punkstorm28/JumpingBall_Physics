package org;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Listeners implements KeyListener, MouseMotionListener ,MouseListener {
 private static int mouseX;
 private static int mouseY;

void setMouseX(int CX){
	this.mouseX = CX;
}
void setMouseY(int CY)
{
	this.mouseY = CY;
}
 
static int getMouseX()
{
	return Listeners.mouseX;
}
static int getMouseY()
{
	return Listeners.mouseY;
}
	@Override
	public void mouseDragged(MouseEvent ae) {
		 mouseX = ae.getX();
	      mouseY = ae.getY();
	   //   System.out.println("mouseX :"+mouseX);
	     // System.out.println("mouseY :"+mouseY);
	}

	@Override
	public void mouseMoved(MouseEvent ae) {
		 mouseX = ae.getX();
	      mouseY = ae.getY();
	     // System.out.println("mouseX :"+mouseX);
	      //System.out.println("mouseY :"+mouseY);
	      
	      CanShotM.FrameGame.repaint();
	}

	@Override
	public void keyPressed(KeyEvent ae) {
		
	}

	@Override
	public void keyReleased(KeyEvent ae) {
		
	}

	@Override
	public void keyTyped(KeyEvent ae) {
		
	}

	@Override
 	public void mouseClicked(MouseEvent ae) {
      mouseX = ae.getX();
      mouseY = (ae.getY());
      //System.out.println("mouseX :"+mouseX);
      //System.out.println("mouseY :"+mouseY);
 	}

	@Override
	public void mouseEntered(MouseEvent ae) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
