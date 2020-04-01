package CGMiniProjectTheGame;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class JforJuice extends Canvas{

	public void paint(Graphics g) {
		float sf = (float) 1;
		int shifX = 30;
		int shifY = 20;
		
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        g.setColor(Color.black);
        g.drawString("Juice", Math.round(400*sf+shifX),Math.round(600*sf+shifY));
        
		g.setColor(Color.white);
	 	g.fillRect(Math.round(330*sf+shifX),Math.round(200*sf+shifY),Math.round(250*sf),Math.round(300*sf));
	 	
	 	g.setColor(Color.black);
	 	g.drawRect(Math.round(329*sf+shifX),Math.round(199*sf+shifY),Math.round(251*sf),Math.round(301*sf));
	 	g.drawOval(Math.round(329*sf+shifX),Math.round(474*sf+shifY),Math.round(252*sf),Math.round(52*sf));
		
	 	g.setColor(Color.white);	 	
	 	g.fillOval(Math.round(330*sf+shifX),Math.round(175*sf+shifY),Math.round(250*sf),Math.round(50*sf));
	 	
	 	g.setColor(Color.white);
	 	g.fillRect(Math.round(330*sf+shifX),Math.round(200*sf+shifY),Math.round(250*sf),Math.round(300*sf));
	 	g.fillOval(Math.round(329*sf+shifX),Math.round(474*sf+shifY),Math.round(251*sf),Math.round(51*sf));
	 	
	 	g.setColor(Color.black);
	 	g.drawOval(Math.round(330*sf+shifX),Math.round(175*sf+shifY),Math.round(250*sf),Math.round(50*sf));
	 	
	 	g.setColor(Color.ORANGE);
	 	g.fillOval(Math.round(345*sf+shifX),Math.round(450*sf+shifY),Math.round(220*sf),Math.round(50*sf));
	 	
        g.setColor(Color.black);        
	    g.drawRect(Math.round(344*sf+shifX),Math.round(274*sf+shifY),Math.round(221*sf),Math.round(201*sf)); 	    
	    g.drawOval(Math.round(345*sf+shifX),Math.round(250*sf+shifY),Math.round(220*sf),Math.round(50*sf));         
	    g.drawOval(Math.round(344*sf+shifX),Math.round(449*sf+shifY),Math.round(222*sf),Math.round(52*sf));
	    
	 	g.setColor(Color.ORANGE);  	 	
	    g.fillOval(Math.round(345*sf+shifX),Math.round(250*sf+shifY),Math.round(220*sf),Math.round(50*sf));	    
	    g.fillOval(Math.round(345*sf+shifX),Math.round(450*sf+shifY),Math.round(220*sf),Math.round(50*sf));
	    g.fillRect(Math.round(345*sf+shifX),Math.round(275*sf+shifY),Math.round(220*sf),Math.round(200*sf));
	 	
	    g.setColor(Color.black);
	    g.drawOval(Math.round(345*sf+shifX),Math.round(250*sf+shifY),Math.round(220*sf),Math.round(50*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "J;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Juice;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
