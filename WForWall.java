package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class WForWall extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.7;
		int shifX = 210;
		int shifY = 130;
		
		int[] polyX1 = {Math.round(-20*sf+shifX),Math.round(300*sf+shifX),Math.round(300*sf+shifX),Math.round(-20*sf+shifX)};
		int[] polyY1 = {Math.round(20*sf+shifY),Math.round(30*sf+shifY),Math.round(300*sf+shifY),Math.round(290*sf+shifY)};
		

		int[] polyX2 = {Math.round(-20*sf+shifX),Math.round(20*sf+shifX),Math.round(340*sf+shifX),Math.round(300*sf+shifX)};
		int[] polyY2 = {Math.round(20*sf+shifY),Math.round(-10*sf+shifY),Math.round(0*sf+shifY),Math.round(30*sf+shifY)};
		

		int[] polyX3 = {Math.round(340*sf+shifX),Math.round(300*sf+shifX),Math.round(300*sf+shifX),Math.round(340*sf+shifX)};
		int[] polyY3 = {Math.round(0*sf+shifY),Math.round(30*sf+shifY),Math.round(300*sf+shifY),Math.round(270*sf+shifY)};

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Wall",Math.round(100*sf+shifX), Math.round(340*sf+shifY));
		
		g.setColor(new Color(165,42,42));
		g.fillPolygon(polyX2, polyY2, 4);
		g.fillPolygon(polyX3, polyY3, 4);
		
		g.setColor(new Color(203,52,52));
		g.fillPolygon(polyX1, polyY1, 4);
		
		g.setColor(new Color(239,223,187));
		for(int i = Math.round(17*sf); i <= Math.round(260*sf); i = i + Math.round(17*sf)) {
			g.drawLine(Math.round(-20*sf+shifX),Math.round(20*sf+shifY+i),Math.round(300*sf+shifX),Math.round(30*sf+shifY+i));
			g.drawLine(Math.round(340*sf+shifX),Math.round(0*sf+shifY+i),Math.round(300*sf+shifX),Math.round(30*sf+shifY+i));
		}
		
		int j = Math.round(2*sf);
		
		for(int i = Math.round(45*sf); i <= Math.round(300*sf); i = i + Math.round(45*sf)) {
			g.drawLine(Math.round(-20*sf+shifX+i),Math.round(20*sf+shifY+j),Math.round(-20*sf+shifX+i),Math.round(290*sf+shifY+j));
			
			g.drawLine(Math.round(-20*sf+shifX+i),Math.round(20*sf+shifY+j),Math.round(20*sf+shifX+i),Math.round(-10*sf+shifY+j));

			j += Math.round(1*sf);
		}

		g.drawLine(Math.round(0*sf+shifX),Math.round(5*sf+shifY),Math.round(320*sf+shifX),Math.round(15*sf+shifY));	
		g.drawLine(Math.round(320*sf+shifX),Math.round(15*sf+shifY),Math.round(320*sf+shifX),Math.round(290*sf+shifY));			
		
		g.setColor(Color.black);
		g.drawPolygon(polyX1, polyY1, 4);
		g.drawPolygon(polyX2, polyY2, 4);
		g.drawPolygon(polyX3, polyY3, 4);
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "W;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Wall;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
	}
}
