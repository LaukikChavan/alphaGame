package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class SForStar extends Canvas{
	public void paint(Graphics g) {
		float sf = (float) 1.5;
		int shifX = 100;
		int shifY = 20;
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Star",Math.round(200*sf+shifX), Math.round(510*sf+shifY));
		
		int[] polyX1 = {Math.round(225*sf+shifX),Math.round(350*sf+shifX),Math.round(100*sf+shifX)};
		int[] polyY1 = {Math.round(115*sf+shifY),Math.round(315*sf+shifY),Math.round(315*sf+shifY)};
		
		int[] polyX2 = {Math.round(225*sf+shifX),Math.round(350*sf+shifX),Math.round(100*sf+shifX)};
		int[] polyY2 = {Math.round(390*sf+shifY),Math.round(190*sf+shifY),Math.round(190*sf+shifY)};

		g.drawRect(Math.round(20*sf+shifX), Math.round(20*sf+shifY), Math.round(430*sf), Math.round(430*sf));
		g.setColor(new Color(20, 24, 82));
		g.fillRect(Math.round(20*sf+shifX), Math.round(20*sf+shifY), Math.round(430*sf), Math.round(430*sf));
		
		g.setColor(Color.white);
		for(int i=0; i < 150; i++) {
			int x = (int) Math.round(20*sf+shifX + Math.random()* (430*sf));
			int y = (int) Math.round(20*sf+shifY + Math.random()* (430*sf));
			
			g.fillRect(x, y, 2, 2);
		}		
		
		g.setColor(Color.white);
		g.fillPolygon(polyX1, polyY1, 3);
		g.fillPolygon(polyX2, polyY2, 3);
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "S;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Star;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }		
	}
}
