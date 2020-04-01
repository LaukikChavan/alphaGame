package CGMiniProjectTheGame;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class HforHat extends Canvas{

	public void paint(Graphics g) { 	
		float sf = (float) 1;
		int shifX = 40;
		int shifY = 40;
	     
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));	    
        g.setColor(Color.black);
        g.drawString("Hat",Math.round(405*sf+shifX),Math.round(540*sf+shifY));
        
		g.setColor(Color.red);
        g.fillOval(Math.round(190*sf+shifX),Math.round(320*sf+shifY),Math.round(500*sf),Math.round(130*sf));
		
		g.setColor(Color.ORANGE);
		g.fillOval(Math.round(190*sf+shifX),Math.round(310*sf+shifY),Math.round(500*sf),Math.round(130*sf));
        			
		g.setColor(Color.black);
		g.drawOval(Math.round(190*sf+shifX),Math.round(310*sf+shifY),Math.round(500*sf),Math.round(130*sf));
		g.drawRect(Math.round(339*sf+shifX),Math.round(165*sf+shifY),Math.round(211*sf),Math.round(200*sf));
				
		g.setColor(Color.red);
		g.fillOval(Math.round(340*sf+shifX),Math.round(140*sf+shifY),Math.round(210*sf),Math.round(50*sf));
		
		g.fillOval(Math.round(340*sf+shifX),Math.round(340*sf+shifY),Math.round(210*sf),Math.round(50*sf));
		
		g.setColor(Color.black);
		g.drawOval(Math.round(340*sf+shifX),Math.round(340*sf+shifY),Math.round(210*sf),Math.round(50*sf));
		
        g.setColor(Color.red);
		g.fillRect(Math.round(340*sf+shifX),Math.round(165*sf+shifY),Math.round(210*sf),Math.round(200*sf));
		
		g.setColor(Color.black);
        g.drawOval(Math.round(340*sf+shifX),Math.round(140*sf+shifY),Math.round(210*sf),Math.round(50*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "H;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Hat;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
        
	}

}
