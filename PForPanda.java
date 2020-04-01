package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class PForPanda extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.7;
		int shifX = 220;
		int shifY = 110;
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Panda",Math.round(110*sf+shifX), Math.round(310*sf+shifY));
		
		g.setColor(Color.black);
		g.fillOval(Math.round(10*sf+shifX), Math.round(10*sf+shifY), Math.round(100*sf), Math.round(100*sf));
		g.fillOval(Math.round(200*sf+shifX), Math.round(10*sf+shifY), Math.round(100*sf), Math.round(100*sf));	
		
		g.setColor(new Color(236,121,184));
		g.fillOval(Math.round(25*sf+shifX), Math.round(30*sf+shifY), Math.round(75*sf), Math.round(75*sf));
		g.fillOval(Math.round(200*sf+shifX), Math.round(35*sf+shifY), Math.round(75*sf), Math.round(75*sf));	
		
		
		g.setColor(Color.black);
		g.drawOval(Math.round(29*sf+shifX), Math.round(29*sf+shifY), Math.round(252*sf), Math.round(242*sf));
		g.setColor(Color.white);		
		g.fillOval(Math.round(30*sf+shifX), Math.round(30*sf+shifY), Math.round(250*sf), Math.round(240*sf));
		

		g.setColor(Color.black);
		g.fillOval(Math.round(50*sf+shifX), Math.round(90*sf+shifY), Math.round(80*sf), Math.round(80*sf));
		g.fillOval(Math.round(180*sf+shifX), Math.round(90*sf+shifY), Math.round(80*sf), Math.round(80*sf));		
		
		g.setColor(Color.white);
		g.fillOval(Math.round(70*sf+shifX), Math.round(120*sf+shifY), Math.round(40*sf), Math.round(40*sf));
		g.fillOval(Math.round(200*sf+shifX), Math.round(120*sf+shifY), Math.round(40*sf), Math.round(40*sf));
		

		g.setColor(Color.black);
		g.fillOval(Math.round(80*sf+shifX), Math.round(130*sf+shifY), Math.round(20*sf), Math.round(20*sf));
		g.fillOval(Math.round(210*sf+shifX), Math.round(130*sf+shifY), Math.round(20*sf), Math.round(20*sf));
		
		g.fillOval(Math.round(135*sf+shifX), Math.round(170*sf+shifY), Math.round(40*sf), Math.round(20*sf));

		g.drawArc(Math.round(115*sf+shifX), Math.round(170*sf+shifY), Math.round(40*sf), Math.round(40*sf), Math.round(180), Math.round(240));
		g.drawArc(Math.round(155*sf+shifX), Math.round(170*sf+shifY), Math.round(40*sf), Math.round(40*sf), Math.round(140), Math.round(220));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "P;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Panda;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
				
	}
}



















