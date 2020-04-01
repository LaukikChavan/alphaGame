package CGMiniProjectTheGame;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class GforGlue extends Canvas{

	public void paint(Graphics g) {
		float sf = (float) 1;
		int shifX = 75;
		int shifY = 40;          
		
		g.setColor(Color.BLACK);
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.drawString("Glue", Math.round(350*sf+shifX), Math.round(640*sf+shifY));
		
		g.drawOval(Math.round(382*sf+shifX),Math.round(80*sf+shifY),Math.round(50*sf),Math.round(120*sf));
		
		g.setColor(Color.orange);
		g.fillOval(Math.round(382*sf+shifX), Math.round(80*sf+shifY),Math.round(50*sf),Math.round(120*sf));
		g.fillRect(Math.round(335*sf+shifX),Math.round(150*sf+shifY),Math.round(150*sf),Math.round(50*sf));
		g.fillRoundRect(Math.round(310*sf+shifX),Math.round(250*sf+shifY),Math.round(200*sf),Math.round(250*sf),Math.round(50*sf),Math.round(60*sf));
		
		g.setColor(Color.BLACK);
		g.drawRoundRect(Math.round(260*sf+shifX),Math.round(200*sf+shifY),Math.round(300*sf),Math.round(350*sf),Math.round(30*sf),Math.round(30*sf));
		
		g.drawRect(Math.round(335*sf+shifX),Math.round(150*sf+shifY),Math.round(150*sf),Math.round(50*sf));
		g.drawRoundRect(Math.round(310*sf+shifX),Math.round(250*sf+shifY),Math.round(200*sf),Math.round(250*sf),Math.round(50*sf),Math.round(60*sf));        
		
		g.setColor(Color.RED); 
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g.drawString("Febicole", Math.round(350*sf+shifX), Math.round(330*sf+shifY));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "G;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Glue;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
		
	}
}
