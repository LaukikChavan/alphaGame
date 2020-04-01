package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class MForMan extends Canvas{
	public void paint(Graphics g) {
		this.setSize(800,700);
		
	float sf = (float) 0.4;
	int shifY = 40;	
	int shifX = 300;

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
				    
		g.setColor(Color.black);
		g.drawString("Man",Math.round(300*sf+shifX), Math.round(1600*sf+shifY));
		
	// head
		g.setColor(new Color(255,224,189, 100));
		g.fillOval(Math.round(340*sf+shifX) , Math.round(130*sf+shifY), Math.round(220*sf), Math.round(220*sf));
		
		g.setColor(Color.BLACK);
		g.drawOval(Math.round(340*sf+shifX) , Math.round(130*sf+shifY), Math.round(220*sf), Math.round(220*sf));
		
	// neck
		g.setColor(new Color(255,224,189, 100));
		g.fillRect(Math.round(425*sf+shifX), Math.round(350*sf+shifY), Math.round(50*sf), Math.round(50*sf));
		
		
		g.setColor(Color.BLACK);
		g.drawRect(Math.round(425*sf+shifX), Math.round(350*sf+shifY), Math.round(50*sf), Math.round(50*sf));
		
	//tourso
		g.setColor(Color.blue);
		g.fillRect(Math.round(300*sf+shifX), Math.round(400*sf+shifY), Math.round(300*sf), Math.round(500*sf));
		
		g.setColor(Color.BLACK);
		g.drawRect(Math.round(300*sf+shifX), Math.round(400*sf+shifY), Math.round(300*sf), Math.round(500*sf));
		
	//legs
		g.setColor(new Color(107,68,35,100));
		g.fillRect(Math.round(300*sf+shifX), Math.round(900*sf+shifY), Math.round(100*sf), Math.round(500*sf));
		g.fillRect(Math.round(500*sf+shifX), Math.round(900*sf+shifY), Math.round(100*sf), Math.round(500*sf));
		
		g.setColor(Color.BLACK);
		g.fillRect(Math.round(300*sf+shifX), Math.round(1400*sf+shifY), Math.round(100*sf), Math.round(50*sf));
		g.fillRect(Math.round(500*sf+shifX), Math.round(1400*sf+shifY), Math.round(100*sf), Math.round(50*sf));
		
		g.drawRect(Math.round(300*sf+shifX), Math.round(900*sf+shifY), Math.round(100*sf), Math.round(550*sf));
		g.drawRect(Math.round(500*sf+shifX), Math.round(900*sf+shifY), Math.round(100*sf), Math.round(550*sf));
		
	//hands
		g.setColor(new Color(255,224,189, 100));
		g.fillRect(Math.round(600*sf+shifX), Math.round(400*sf+shifY), Math.round(400*sf), Math.round(75*sf));
		g.fillRect(Math.round(-100*sf+shifX), Math.round(400*sf+shifY), Math.round(400*sf), Math.round(75*sf));
		

		g.setColor(Color.blue);
		g.fillRect(Math.round(600*sf+shifX), Math.round(400*sf+shifY), Math.round(50*sf), Math.round(75*sf));
		g.fillRect(Math.round(250*sf+shifX), Math.round(400*sf+shifY), Math.round(50*sf), Math.round(75*sf));
		
		g.setColor(Color.BLACK);
		g.drawRect(Math.round(600*sf+shifX), Math.round(400*sf+shifY), Math.round(400*sf), Math.round(75*sf));
		g.drawRect(Math.round(-100*sf+shifX), Math.round(400*sf+shifY), Math.round(400*sf), Math.round(75*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "M;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Man;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
		
	}
}
