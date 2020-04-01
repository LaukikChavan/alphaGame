package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class RForRing extends Canvas{
	public void paint(Graphics g) {	
		float sf = (float)1.5;
		int shifX = 250;
		int shifY = 140;		
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Ring",Math.round(110*sf+shifX), Math.round(370*sf+shifY));
		
		int[] polyX1 = {
				Math.round(150*sf+shifX),
				Math.round(100*sf+shifX),
				Math.round(150*sf+shifX),
				Math.round(200*sf+shifX)
		};
		
		
		int[] polyY1 = {
				 Math.round(40*sf+shifY),
				 Math.round(20*sf+shifY),
				 Math.round(10*sf+shifY),
				 Math.round(20*sf+shifY)
		};
		
		int[] polyX2 = {
				Math.round(150*sf+shifX),
				Math.round(100*sf+shifX),
				Math.round(150*sf+shifX),
				Math.round(200*sf+shifX)
		};
		
		
		int[] polyY2 = {
				 Math.round(0*sf+shifY),
				 Math.round(20*sf+shifY),
				 Math.round(10*sf+shifY),
				 Math.round(20*sf+shifY)
		};
		
		g.setColor(new Color(255,215,0));
		g.fillOval(Math.round(0*sf+shifX), Math.round(0*sf+shifY), Math.round(300*sf), Math.round(300*sf));	

		g.setColor(Color.black);
		g.drawOval(Math.round(0*sf+shifX), Math.round(0*sf+shifY), Math.round(300*sf), Math.round(300*sf));	

		g.setColor(Color.white);
		g.fillOval(Math.round(15*sf+shifX), Math.round(40*sf+shifY), Math.round(270*sf), Math.round(230*sf));	
		
		g.setColor(Color.black);
		g.drawOval(Math.round(15*sf+shifX), Math.round(40*sf+shifY), Math.round(270*sf), Math.round(230*sf));	
		
		g.setColor(Color.red);		
		g.fillPolygon(polyX1, polyY1, 4);
		
		g.setColor(new Color(196,2,51));
		g.fillPolygon(polyX2, polyY2, 4);
		
		g.setColor(Color.black);
		g.drawLine(Math.round(150*sf+shifX), Math.round(40*sf+shifY), Math.round(150*sf+shifX), Math.round(0*sf+shifY));	
		g.drawLine(Math.round(150*sf+shifX), Math.round(40*sf+shifY), Math.round(100*sf+shifX), Math.round(20*sf+shifY));	
		g.drawLine(Math.round(150*sf+shifX), Math.round(0*sf+shifY), Math.round(100*sf+shifX), Math.round(20*sf+shifY));	
		g.drawLine(Math.round(150*sf+shifX), Math.round(0*sf+shifY), Math.round(200*sf+shifX), Math.round(20*sf+shifY));	
		g.drawLine(Math.round(150*sf+shifX), Math.round(40*sf+shifY), Math.round(200*sf+shifX), Math.round(20*sf+shifY));	
		g.drawLine(Math.round(100*sf+shifX), Math.round(20*sf+shifY), Math.round(150*sf+shifX), Math.round(10*sf+shifY));
		g.drawLine(Math.round(200*sf+shifX), Math.round(20*sf+shifY), Math.round(150*sf+shifX), Math.round(10*sf+shifY));	
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "R;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Ring;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
	}
}














