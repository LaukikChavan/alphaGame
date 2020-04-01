package CGMiniProjectTheGame;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;
public class IforIcecreame extends Canvas {

	public void paint(Graphics g)
	{
		float sf = (float) 1;
		int shifX = 0;
		int shifY = 0;

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.setColor(Color.black);
		g.drawString("Ice-Cream",Math.round(325*sf+shifX),Math.round(650*sf+shifY));
		
		g.setColor(Color.black);
		g.drawOval(Math.round(349*sf+shifX),Math.round(179*sf+shifY),Math.round(201*sf),Math.round(201*sf));
		g.drawOval(Math.round(424*sf+shifX),Math.round(149*sf+shifY),Math.round(51*sf),Math.round(51*sf));
		
		g.setColor(Color.red);
		g.fillOval(Math.round(425*sf+shifX),Math.round(150*sf+shifY),Math.round(50*sf),Math.round(50*sf));
		
		g.setColor(Color.yellow);
		g.fillOval(Math.round(350*sf+shifX),Math.round(180*sf+shifY),Math.round(200*sf),Math.round(200*sf));
		
		
		int a[]= {Math.round(350*sf+shifX),Math.round(550*sf+shifX),Math.round(450*sf+shifX)};
		int b[]={Math.round(300*sf+shifY),Math.round(300*sf+shifY),Math.round(560*sf+shifY)};
		g.setColor(Color.ORANGE);
		g.fillPolygon(a,b,3);
		
		g.setColor(Color.black);
		
	    g.drawLine(Math.round(350*sf+shifX),Math.round(300*sf+shifY),Math.round(510*sf+shifX),Math.round(400*sf+shifY));
	    g.drawLine(Math.round(390*sf+shifX),Math.round(400*sf+shifY),Math.round(485*sf+shifX),Math.round(465*sf+shifY));
	    g.drawLine(Math.round(450*sf+shifX),Math.round(300*sf+shifY),Math.round(530*sf+shifX),Math.round(350*sf+shifY));
	    g.drawLine(Math.round(425*sf+shifX),Math.round(500*sf+shifY),Math.round(465*sf+shifX),Math.round(530*sf+shifY));
	    
	    g.drawPolygon(a,b,3);
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "I;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Ice;;;;;;;;Creame;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
		 	 
	}
}
