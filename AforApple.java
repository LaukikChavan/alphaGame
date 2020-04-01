package CGMiniProjectTheGame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class AforApple extends Canvas{
	
	public void paint(Graphics g) {
		float sf = (float) 1.3;
		int shifX = -50;
		int shifY = -50;
		
		g.setColor(Color.black);
		g.setFont(new Font("TimesRoman", Font.PLAIN, Math.round(50*sf)));    
		g.drawString("Apple",Math.round(330*sf+shifX),Math.round(520*sf+shifY)); 
		
		g.setColor(Color.red);
		g.fillOval(Math.round(250*sf+shifX),Math.round(200*sf+shifY),Math.round(200*sf),Math.round(250*sf));
		g.fillOval(Math.round(350*sf+shifX),Math.round(200*sf+shifY),Math.round(200*sf),Math.round(250*sf));
		
		g.setColor(Color.green);
		g.fillRect(Math.round(395*sf+shifX),Math.round(105*sf+shifY),Math.round(10*sf),Math.round(110*sf));
		g.fillOval(Math.round(405*sf+shifX),Math.round(150*sf+shifY),Math.round(150*sf),Math.round(40*sf));
		
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "A;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;apple;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
		
	}
}
