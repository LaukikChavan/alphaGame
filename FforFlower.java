package CGMiniProjectTheGame;

import java.awt.*;
import java.io.IOException;

import javax.swing.JFrame;
public class FforFlower extends Canvas{

	public void paint(Graphics g) {	
		float sf = (float) 1;
		int shifX = 40;
		int shifY = -20;
		
		g.setColor(Color.BLACK);
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));	    
	    g.drawString("Flower",Math.round(340*sf+shifX),Math.round(680*sf+shifY)); 
	    
		g.setColor(Color.GREEN);
		g.fillRect(Math.round(427*sf+shifX),Math.round(380*sf+shifY),Math.round(10*sf),Math.round(250*sf));
		g.fillOval(Math.round(440*sf+shifX),Math.round(460*sf+shifY),Math.round(80*sf),Math.round(50*sf));
		
		g.fillOval(Math.round(345*sf+shifX),Math.round(480*sf+shifY),Math.round(80*sf),Math.round(50*sf));
	
		g.setColor(Color.orange);
		g.fillOval(Math.round(280*sf+shifX),Math.round(150*sf+shifY),Math.round(150*sf),Math.round(150*sf));
		g.fillOval(Math.round(430*sf+shifX),Math.round(150*sf+shifY),Math.round(150*sf),Math.round(150*sf));
		g.fillOval(Math.round(280*sf+shifX),Math.round(300*sf+shifY),Math.round(150*sf),Math.round(150*sf));
		g.fillOval(Math.round(430*sf+shifX),Math.round(300*sf+shifY),Math.round(150*sf),Math.round(150*sf));
		
		g.setColor(Color.yellow);
		g.fillOval(Math.round(355*sf+shifX),Math.round(225*sf+shifY),Math.round(150*sf),Math.round(150*sf));
		
		g.setColor(Color.gray);
		g.fillOval(Math.round(390*sf+shifX),Math.round(250*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(440*sf+shifX),Math.round(250*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.drawArc(Math.round(380*sf+shifX),Math.round(250*sf+shifY),Math.round(100*sf),Math.round(100*sf),180,180);	
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "F;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Flower;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}

}

