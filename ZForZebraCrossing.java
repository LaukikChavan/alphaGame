package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class ZForZebraCrossing extends Canvas{
	public void paint(Graphics g) {
		float sf = (float) 1.6;
		int shifX = 120;
		int shifY = 20;
		
		int[] polyX1 = {Math.round(20*sf+shifX),Math.round(450*sf+shifX),Math.round(390*sf+shifX),Math.round(80*sf+shifX)};
		int[] polyY1 = {Math.round(450*sf+shifY),Math.round(450*sf+shifY), Math.round(20*sf+shifY), Math.round(20*sf+shifY)};
		
		int[] polyX2 = {Math.round(20*sf+shifX),Math.round(20*sf+shifX),Math.round(80*sf+shifX)};
		int[] polyY2 = {Math.round(20*sf+shifY),Math.round(450*sf+shifY),Math.round(20*sf+shifY)};
		
		int[] polyX3 = {Math.round(450*sf+shifX),Math.round(450*sf+shifX),Math.round(390*sf+shifX)};
		int[] polyY3 = {Math.round(20*sf+shifY),Math.round(450*sf+shifY),Math.round(20*sf+shifY)};

		int[] polyX4 = {Math.round(60*sf+shifX),Math.round(120*sf+shifX),Math.round(105*sf+shifX),Math.round(85*sf+shifX)};
		int[] polyY4 = {Math.round(300*sf+shifY),Math.round(300*sf+shifY), Math.round(130*sf+shifY), Math.round(130*sf+shifY)};

		int[] polyX5 = {Math.round(150*sf+shifX),Math.round(210*sf+shifX),Math.round(195*sf+shifX),Math.round(165*sf+shifX)};
		int[] polyY5 = {Math.round(300*sf+shifY),Math.round(300*sf+shifY), Math.round(130*sf+shifY), Math.round(130*sf+shifY)};

		int[] polyX6 = {Math.round(240*sf+shifX),Math.round(300*sf+shifX),Math.round(285*sf+shifX),Math.round(255*sf+shifX)};
		int[] polyY6 = {Math.round(300*sf+shifY),Math.round(300*sf+shifY), Math.round(130*sf+shifY), Math.round(130*sf+shifY)};

		int[] polyX7 = {Math.round(330*sf+shifX),Math.round(390*sf+shifX),Math.round(375*sf+shifX),Math.round(345*sf+shifX)};
		int[] polyY7 = {Math.round(300*sf+shifY),Math.round(300*sf+shifY), Math.round(130*sf+shifY), Math.round(130*sf+shifY)};
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Zebra-Crossing",Math.round(120*sf+shifX), Math.round(500*sf+shifY));
		
		g.setColor(new Color(84,98,111));
		g.fillPolygon(polyX1, polyY1, 4);
		
		g.setColor(Color.white); 
		
		g.fillRect(Math.round(20*sf+shifX),Math.round(50*sf+shifX),Math.round(430*sf),Math.round(35*sf));
		g.fillRect(Math.round(20*sf+shifX),Math.round(220*sf+shifX),Math.round(430*sf),Math.round(35*sf));
		
		g.fillPolygon(polyX4, polyY4, 4);
		g.fillPolygon(polyX5, polyY5, 4);
		g.fillPolygon(polyX6, polyY6, 4);
		g.fillPolygon(polyX7, polyY7, 4);
		
		g.setColor(Color.green);
		g.fillPolygon(polyX2, polyY2, 3);
		g.fillPolygon(polyX3, polyY3, 3);
		
		g.setColor(Color.black);
		g.drawRect(Math.round(20*sf+shifX), Math.round(20*sf+shifY), Math.round(430*sf), Math.round(430*sf));			
		g.drawPolygon(polyX1, polyY1, 4);			
		g.drawPolygon(polyX2, polyY2, 3);			
		g.drawPolygon(polyX3, polyY3, 3);
	   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "Z;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Zebra;;;;;;;;;crossing;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
