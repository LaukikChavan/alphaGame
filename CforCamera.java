package CGMiniProjectTheGame;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.*;
import javax.swing.border.LineBorder;
import java.awt.font.*;
import java.io.IOException;

public class CforCamera extends Canvas{

	public void paint(Graphics g) { 
		float sf = (float) 1.2;
		int shifX = -70;
		int shifY = 0;
		

	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));	    
        g.drawString("Camera", Math.round(350*sf+shifX),Math.round(520*sf+shifY));	
		
		g.setColor(Color.BLUE);
		g.fillRoundRect(Math.round(200*sf+shifX), Math.round(150*sf+shifY), Math.round(500*sf), Math.round(300*sf), Math.round(100*sf), Math.round(60*sf));	
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(Math.round(220*sf+shifX),Math.round(220*sf+shifY),Math.round(200*sf),Math.round(200*sf)); 
		
        g.setColor(Color.DARK_GRAY);
		g.fillOval(Math.round(255*sf+shifX),Math.round(255*sf+shifY),Math.round(130*sf),Math.round(130*sf));
		
		g.setColor(Color.WHITE);
		g.fillRoundRect(Math.round(550*sf+shifX),Math.round(170*sf+shifY),Math.round(100*sf),Math.round(50*sf),Math.round(50*sf),Math.round(60*sf));	
		
		g.setColor(Color.BLACK);
		g.drawLine(Math.round(200*sf+shifX),Math.round(235*sf+shifY),Math.round(265*sf+shifX),Math.round(235*sf+shifY));
		g.drawLine(Math.round(375*sf+shifX),Math.round(235*sf+shifY),Math.round(700*sf+shifX),Math.round(235*sf+shifY));	
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(Math.round(260*sf+shifX),Math.round(125*sf+shifY),Math.round(100*sf),Math.round(25*sf));	
		
        g.setColor(Color.YELLOW);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));	    
        g.drawString("AMWorks", Math.round(480*sf+shifX),Math.round(390*sf+shifY));	
        
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "C;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Camera;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
	}
}
