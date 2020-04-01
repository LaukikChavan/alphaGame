package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class VForVase extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.5;
		int shifX = 250;
		int shifY = 250;
		
		int[] polyX1 = {Math.round(90*sf+shifX),Math.round(200*sf+shifX),Math.round(200*sf+shifX),Math.round(90*sf+shifX)};
		int[] polyY1 = {Math.round(-50*sf+shifY),Math.round(-50*sf+shifY),Math.round(60*sf+shifY),Math.round(60*sf+shifY)};
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Vase",Math.round(100*sf+shifX), Math.round(310*sf+shifY));
		
		g.setColor(new Color(177,117,58));
		g.fillRect(Math.round(80*sf+shifX), Math.round(220*sf+shifY), Math.round(130*sf), Math.round(30*sf));
		g.fillOval(Math.round(80*sf+shifX), Math.round(240*sf+shifY), Math.round(130*sf), Math.round(20*sf));

		g.setColor(new Color(0,179,179));
		g.fillPolygon(polyX1, polyY1, 4);
		
		g.setColor(Color.black);
		g.drawPolygon(polyX1, polyY1, 4);
		
		g.setColor(new Color(0,179,179));
		g.fillOval(Math.round(10*sf+shifX), Math.round(40*sf+shifY), Math.round(270*sf), Math.round(200*sf));

		g.setColor(Color.black);
		g.drawOval(Math.round(10*sf+shifX), Math.round(40*sf+shifY), Math.round(270*sf), Math.round(200*sf));
		
		g.setColor(new Color(6,144,203));
		g.fillRoundRect(Math.round(85*sf+shifX), Math.round(-70*sf+shifY), Math.round(120*sf), Math.round(20*sf), Math.round(15*sf), Math.round(15*sf));
		
		g.setColor(Color.black);
		g.drawRoundRect(Math.round(85*sf+shifX), Math.round(-70*sf+shifY), Math.round(120*sf), Math.round(20*sf), Math.round(15*sf), Math.round(15*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "V;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Vase;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }			
	}
}
