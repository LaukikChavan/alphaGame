package CGMiniProjectTheGame;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class BforBall extends Canvas{

	
	public void paint(Graphics g) { 
		float sf = (float) 1;
		int shifX = 70;
		int shifY = -40;

		g.setColor(Color.BLACK);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.drawString("Ball",Math.round(350*sf+shifX),Math.round(670*sf+shifY)); 
		
		g.setColor(Color.blue);			
		g.fillOval(Math.round(540*sf+shifX),Math.round(310*sf+shifY),Math.round(50*sf),Math.round(180*sf));		
		
		g.setColor(Color.red);		
		g.fillOval(Math.round(200*sf+shifX),Math.round(200*sf+shifY),Math.round(400*sf),Math.round(400*sf));
		
		g.setColor(Color.blue);
		g.fillOval(Math.round(200*sf+shifX),Math.round(260*sf+shifY),Math.round(150*sf),Math.round(280*sf));
		
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "B;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Ball;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
