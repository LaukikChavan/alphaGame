package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class NForNight extends Canvas{
	public void paint(Graphics g) {
		float sf = (float) 1.6;
		int shifX = 100;
		int shifY = 20;
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Night",Math.round(190*sf+shifX), Math.round(490*sf+shifY));
		
		g.drawRect(Math.round(20*sf+shifX), Math.round(20*sf+shifY), Math.round(430*sf), Math.round(430*sf));
		g.setColor(new Color(20, 24, 82));
		g.fillRect(Math.round(20*sf+shifX), Math.round(20*sf+shifY), Math.round(430*sf), Math.round(430*sf));
		
		g.setColor(Color.white);		
		g.fillOval(Math.round(270*sf+shifX), Math.round(70*sf+shifY), Math.round(80*sf), Math.round(80*sf));
		

		g.setColor(new Color(20, 24, 82));	
		g.fillOval(Math.round(240*sf+shifX), Math.round(50*sf+shifY), Math.round(80*sf), Math.round(80*sf));
		
		g.setColor(Color.white);
		for(int i=0; i < 300; i++) {
			int x = (int) Math.round(20*sf+shifX + Math.random()* (430*sf));
			int y = (int) Math.round(20*sf+shifY + Math.random()* (430*sf));
			
			g.fillRect(x, y, 2, 2);
		}

	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "N;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Night;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
