package CGMiniProjectTheGame;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class DforDictionary extends Canvas {
	
	public void paint(Graphics g) {
		float sf = (float) 0.9;
		int shifX = 130;
		int shifY = 0;

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.setColor(Color.black);
		g.drawString("Dictionary",Math.round(270*sf+shifX),Math.round(740*sf+shifY));
		
		g.setColor(Color.CYAN);
		g.fillRect(Math.round(230*sf+shifX), Math.round(150*sf+shifY), Math.round(400*sf), Math.round(500*sf));	
		
		g.setColor(Color.black);
		g.fillRect(Math.round(190*sf+shifX),Math.round(150*sf+shifY),Math.round(40*sf),Math.round(500*sf));
		
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g.setColor(Color.DARK_GRAY);
		g.drawString("Dictionary",Math.round(290*sf+shifX),Math.round(260*sf+shifY));
		
		g.setColor(Color.black);
		g.drawRect(Math.round(230*sf+shifX), Math.round(150*sf+shifY), Math.round(400*sf), Math.round(500*sf));	
		
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "D;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Dictionary;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
	}
}
