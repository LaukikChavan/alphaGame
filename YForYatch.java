package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class YForYatch extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.9;
		int shifX = 100;
		int shifY = 200;
		
		int[] polyX1 = {Math.round(0*sf+shifX),Math.round(45*sf+shifX),Math.round(345*sf+shifX),Math.round(390*sf+shifX)};
		int[] polyY1 = {Math.round(150*sf+shifY),Math.round(200*sf+shifY),Math.round(200*sf+shifY),Math.round(150*sf+shifY)};
		
		int[] polyX2 = {Math.round(130*sf+shifX),Math.round(190*sf+shifX),Math.round(130*sf+shifX)};
		int[] polyY2 = {Math.round(-20*sf+shifY),Math.round(-15*sf+shifY),Math.round(-5*sf+shifY)};
		
		int[] polyX3 = {Math.round(255*sf+shifX),Math.round(300*sf+shifX),Math.round(255*sf+shifX)};
		int[] polyY3 = {Math.round(-20*sf+shifY),Math.round(-15*sf+shifY),Math.round(-5*sf+shifY)};
		
		int[] polyX4 = {Math.round(130*sf+shifX),Math.round(230*sf+shifX),Math.round(130*sf+shifX)};
		int[] polyY4 = {Math.round(-5*sf+shifY),Math.round(125*sf+shifY),Math.round(125*sf+shifY)};
		
		int[] polyX5 = {Math.round(125*sf+shifX),Math.round(0*sf+shifX),Math.round(125*sf+shifX)};
		int[] polyY5 = {Math.round(-5*sf+shifY),Math.round(125*sf+shifY),Math.round(125*sf+shifY)};
		
		int[] polyX6 = {Math.round(255*sf+shifX),Math.round(390*sf+shifX),Math.round(255*sf+shifX)};
		int[] polyY6 = {Math.round(-5*sf+shifY),Math.round(115*sf+shifY),Math.round(115*sf+shifY)};
		
		int[] polyX7 = {Math.round(250*sf+shifX),Math.round(150*sf+shifX),Math.round(250*sf+shifX)};
		int[] polyY7 = {Math.round(-5*sf+shifY),Math.round(115*sf+shifY),Math.round(115*sf+shifY)};
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Yatch",Math.round(160*sf+shifX), Math.round(270*sf+shifY));

		g.setColor(new Color(76,49,0));		
		g.fillPolygon(polyX1, polyY1, 4);
		
		g.setColor(Color.black);			
		g.drawPolygon(polyX1, polyY1, 4);
		
		g.setColor(new Color(84,98,111));
		
		g.fillRect(Math.round(125*sf+shifX),Math.round(-20*sf+shifY),Math.round(5*sf),Math.round(170*sf));
		g.fillRect(Math.round(250*sf+shifX),Math.round(-20*sf+shifY),Math.round(5*sf),Math.round(170*sf));
	
		g.setColor(Color.black);		
		g.drawRect(Math.round(125*sf+shifX),Math.round(-20*sf+shifY),Math.round(5*sf),Math.round(170*sf));
		g.drawRect(Math.round(250*sf+shifX),Math.round(-20*sf+shifY),Math.round(5*sf),Math.round(170*sf));
		
		g.setColor(Color.red);
		g.fillPolygon(polyX2, polyY2, 3);
		g.fillPolygon(polyX3, polyY3, 3);
		g.setColor(Color.black);	
		g.drawPolygon(polyX2, polyY2, 3);
		g.drawPolygon(polyX3, polyY3, 3);
				
		g.setColor(new Color(255,250,240));
		g.fillPolygon(polyX6, polyY6, 3);
		g.fillPolygon(polyX7, polyY7, 3);
		
		g.setColor(Color.black);		
		g.drawPolygon(polyX6, polyY6, 3);
		g.drawPolygon(polyX7, polyY7, 3);

		g.setColor(new Color(255,250,240));
		g.fillPolygon(polyX4, polyY4, 3);
		g.fillPolygon(polyX5, polyY5, 3);
		
		g.setColor(Color.black);			
		g.drawPolygon(polyX4, polyY4, 3);
		g.drawPolygon(polyX5, polyY5, 3);
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "Y;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Yatch;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
