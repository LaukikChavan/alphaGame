package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class OForOrange extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.7;
		int shifX = 220;
		int shifY = 150;
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Orange",Math.round(100*sf+shifX), Math.round(300*sf+shifY));
		
		g.drawOval(Math.round(30*sf+shifX), Math.round(30*sf+shifY), Math.round(250*sf), Math.round(220*sf));
		
		g.setColor(new Color(255,165,0));
		g.fillOval(Math.round(30*sf+shifX), Math.round(30*sf+shifY), Math.round(250*sf), Math.round(220*sf));
		
		g.setColor(Color.black);
		g.drawRect(Math.round(150*sf+shifX), Math.round(0*sf+shifY), Math.round(10*sf), Math.round(40*sf));
		

		g.setColor(new Color(76,49,0));
		g.fillRect(Math.round(150*sf+shifX), Math.round(0*sf+shifY), Math.round(10*sf), Math.round(40*sf));
		
		g.setColor(Color.black);		
		g.drawOval(Math.round(160*sf+shifX), Math.round(0*sf+shifY), Math.round(80*sf), Math.round(20*sf));
		

		g.setColor(Color.green);		
		g.fillOval(Math.round(160*sf+shifX), Math.round(0*sf+shifY), Math.round(80*sf), Math.round(20*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "O;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Orange;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
		
	}
}
