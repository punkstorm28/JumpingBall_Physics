package org;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class CanShotM  {
	BufferedImage ImageShot;
	BufferedImage ImageBrick;
	private int frameWidth = 1366;
	private int frameHeight = 700;
	static JFrame FrameGame;
	static Physics P;
	CanShotM() throws IOException {
		FrameGame = new JFrame();
		P = new Physics();
    FrameGame.setTitle("CanShot");
  
    FrameGame.setSize(frameWidth,frameHeight);
    FrameGame.setBackground(new Color(0,0,0));
    FrameGame.addMouseListener(new Listeners());
    FrameGame.addMouseMotionListener(new Listeners());
    FrameGame.add(getGamePanel());
    FrameGame.repaint();
    FrameGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameGame.setVisible(true);
    ImageShot = ImageIO.read(new File("Ball.png"));
    ImageBrick = ImageIO.read(new File("Brick.png"));
 	}

	JPanel getGamePanel()
	{
		
		JPanel GamePanel = new JPanel()
		{
			
			public void paintComponent(Graphics g)
			{
				
				g.drawImage(ImageShot,(int) P.getXpos(), (int)P.getYpos(),40,40, null);
				for(int x=0;x<frameWidth;x=x+92)
				{
					g.drawImage(ImageBrick,x, 620, null);
					FrameGame.repaint();
				//	System.out.println("x is :"+x);
				}
				//System.out.println("Xpos is :"+(int)P.getXpos()+100);
				//System.out.println("Y pos is "+(int)P.getYpos());
			}
		};
		GamePanel.repaint();
		FrameGame.repaint();
		GamePanel.setPreferredSize(new Dimension(frameWidth,frameHeight));
		return GamePanel;
	}
	
	public static void main(String... args) throws IOException
	{
		new CanShotM();
	}
}
