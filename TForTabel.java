package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class TForTabel extends Canvas{
	public void paint(Graphics g) {
		float sf = (float) 4.2;
		int shifX = 100;
		int shifY = 100;
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Tabel",Math.round(70*sf+shifX), Math.round(130*sf+shifY));
		
		int polyX1[] = {Math.round(20*sf+shifX),Math.round(60*sf+shifX),Math.round(160*sf+shifX),Math.round(120*sf+shifX)};
		int polyY1[] = {Math.round(60*sf+shifY),Math.round(30*sf+shifY),Math.round(30*sf+shifY),Math.round(60*sf+shifY)};

		int polyX2[] = {Math.round(160*sf+shifX),Math.round(160*sf+shifX),Math.round(120*sf+shifX),Math.round(120*sf+shifX)};
		int polyY2[] = {Math.round(30*sf+shifY),Math.round(35*sf+shifY), Math.round(65*sf+shifY),Math.round(60*sf+shifY)};
		
		int polyX3[] = {Math.round(30*sf+shifX),Math.round(30*sf+shifX),Math.round(35*sf+shifX),Math.round(35*sf+shifX)};
		int polyY3[] = {Math.round(60*sf+shifY),Math.round(110*sf+shifY),Math.round(110*sf+shifY),Math.round(60*sf+shifY)};
		
		int polyX4[] = {Math.round(38*sf+shifX),Math.round(38*sf+shifX),Math.round(35*sf+shifX),Math.round(35*sf+shifX)};
		int polyY4[] = {Math.round(65*sf+shifY),Math.round(105*sf+shifY),Math.round(110*sf+shifY),Math.round(65*sf+shifY)};		

		int polyX5[] = {Math.round(115*sf+shifX),Math.round(115*sf+shifX),Math.round(110*sf+shifX),Math.round(110*sf+shifX)};
		int polyY5[] = {Math.round(65*sf+shifY),Math.round(110*sf+shifY),Math.round(110*sf+shifY),Math.round(65*sf+shifY)};

		int polyX6[] = {Math.round(118*sf+shifX),Math.round(118*sf+shifX),Math.round(115*sf+shifX),Math.round(115*sf+shifX)};
		int polyY6[] = {Math.round(65*sf+shifY),Math.round(105*sf+shifY),Math.round(110*sf+shifY),Math.round(65*sf+shifY)};		

		int polyX7[] = {Math.round(155*sf+shifX),Math.round(155*sf+shifX),Math.round(150*sf+shifX),Math.round(150*sf+shifX)};
		int polyY7[] = {Math.round(35*sf+shifY),Math.round(80*sf+shifY),Math.round(80*sf+shifY),Math.round(35*sf+shifY)};
		
		int polyX8[] = {Math.round(158*sf+shifX),Math.round(158*sf+shifX),Math.round(155*sf+shifX),Math.round(155*sf+shifX)};
		int polyY8[] = {Math.round(35*sf+shifY),Math.round(75*sf+shifY),Math.round(80*sf+shifY),Math.round(35*sf+shifY)};			

		int polyX9[] = {Math.round(65*sf+shifX),Math.round(65*sf+shifX),Math.round(60*sf+shifX),Math.round(60*sf+shifX)};
		int polyY9[] = {Math.round(35*sf+shifY),Math.round(80*sf+shifY),Math.round(80*sf+shifY),Math.round(35*sf+shifY)};
		
		int polyX10[] = {Math.round(68*sf+shifX),Math.round(68*sf+shifX),Math.round(65*sf+shifX),Math.round(65*sf+shifX)};
		int polyY10[] = {Math.round(35*sf+shifY),Math.round(75*sf+shifY),Math.round(80*sf+shifY),Math.round(35*sf+shifY)};	
		
		g.setColor(new Color(76,49,0));		
		g.fillPolygon(polyX9, polyY9,4);		
		g.fillPolygon(polyX3, polyY3,4);
		g.fillPolygon(polyX5, polyY5,4);
		g.fillPolygon(polyX7, polyY7,4);
		
		g.setColor(new Color(177,117,58));
		g.fillPolygon(polyX10, polyY10, 4);
		g.fillPolygon(polyX2, polyY2, 4);
		g.fillPolygon(polyX4, polyY4, 4);
		g.fillPolygon(polyX6, polyY6, 4);
		g.fillPolygon(polyX8, polyY8, 4);
		

		g.setColor(new Color(76,49,0));		
		g.fillRect(Math.round(20*sf+shifX), Math.round(60*sf+shifY), Math.round(100*sf), Math.round(5*sf));
		
		g.setColor(new Color(139,91,45));		
		g.fillPolygon(polyX1, polyY1, 4);
		g.setColor(Color.black);

		g.drawRect(Math.round(20*sf+shifX), Math.round(60*sf+shifY), Math.round(100*sf), Math.round(5*sf));
		g.drawPolygon(polyX1, polyY1, 4);
		g.drawPolygon(polyX2, polyY2, 4);
		g.drawPolygon(polyX4, polyY4, 4);
		g.drawPolygon(polyX5, polyY5, 4);
		g.drawPolygon(polyX6, polyY6, 4);
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "T;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Tabel;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }			
	}
}
