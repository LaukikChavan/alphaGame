package CGMiniProjectTheGame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class EforEyes extends Canvas  {

	public void paint(Graphics g) {
		float sf = (float) 1;
		int shifX = 60;
		int shifY = 0;
		
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));          
	    g.drawString("Eyes",Math.round(360*sf+shifX),Math.round(550*sf+shifY));
		
		g.drawOval(Math.round(230*sf+shifX),Math.round(200*sf+shifY),Math.round(200*sf),Math.round(250*sf));
	 	g.fillOval(Math.round(340*sf+shifX),Math.round(330*sf+shifY),Math.round(70*sf),Math.round(70*sf));
	 
	 	g.drawOval(Math.round(430*sf+shifX),Math.round(200*sf+shifY),Math.round(200*sf),Math.round(250*sf));
	 	g.fillOval(Math.round(445*sf+shifX),Math.round(250*sf+shifY),Math.round(70*sf),Math.round(70*sf));
	 
	 	g.drawArc(Math.round(230*sf+shifX),Math.round(450*sf+shifY),Math.round(190*sf),Math.round(70*sf),20,150);
	 	g.drawArc(Math.round(430*sf+shifX),Math.round(450*sf+shifY),Math.round(190*sf),Math.round(70*sf),20,150);
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "E;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Eyes;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }

	}
}
