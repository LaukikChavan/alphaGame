package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class UForUmbrella extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.7;
		int shifX = 190;
		int shifY = 60;
		
		this.setBackground(Color.white);		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Umbrella",Math.round(100*sf+shifX), Math.round(360*sf+shifY));
		
		g.setColor(new Color(179,0,179));
		g.fillArc(Math.round(30*sf+shifX), Math.round(30*sf+shifY), Math.round(250*sf), Math.round(250*sf), 0, 180);
		
		g.setColor(new Color(128,0,128));
		g.fillOval(Math.round(30*sf+shifX), Math.round(140*sf+shifY), Math.round(250*sf), Math.round(30*sf));
		
		g.setColor(Color.black);
		g.fillArc(Math.round(153*sf+shifX), Math.round(290*sf+shifY), Math.round(30*sf), Math.round(30*sf), 180, 180);
		g.fillArc(Math.round(177*sf+shifX), Math.round(303*sf+shifY), Math.round(6*sf), Math.round(6*sf), 0, 180);
		
		g.setColor(Color.white);
		g.fillArc(Math.round(159*sf+shifX), Math.round(296*sf+shifY), Math.round(18*sf), Math.round(17*sf), 180, 180);
				
		g.setColor(Color.black);
		g.fillRect(Math.round(153*sf+shifX), Math.round(140*sf+shifY), Math.round(6*sf), Math.round(165*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "U;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Umbrella;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
