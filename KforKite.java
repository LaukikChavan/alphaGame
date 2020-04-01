package CGMiniProjectTheGame;
import java.awt.*;
import java.io.IOException;

import javax.swing.*;

public class KforKite extends Canvas{

	public void paint(Graphics g) {
		
		float sf = (float) 1;
		int shifX = 70;
		int shifY = 0;
	
	    g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
	    g.setColor(Color.black);
	    g.drawString("Kite",Math.round(350*sf+shifX),Math.round(670*sf+shifY));
	    
		int x[]= {Math.round(400*sf+shifX),Math.round(250*sf+shifX),Math.round(400*sf+shifX)};
		int y[]= {Math.round(150*sf+shifY),Math.round(350*sf+shifY),Math.round(350*sf+shifY)};
		
		int x1[]= {Math.round(400*sf+shifX),Math.round(550*sf+shifX),Math.round(400*sf+shifX)};
		int y1[]= {Math.round(150*sf+shifY),Math.round(350*sf+shifY),Math.round(350*sf+shifY)};
		
		int x3[]= {Math.round(400*sf+shifX),Math.round(550*sf+shifX),Math.round(400*sf+shifX)};
		int y3[]= {Math.round(350*sf+shifY),Math.round(350*sf+shifY),Math.round(550*sf+shifY)};	
		
		int x4[]= {Math.round(250*sf+shifX),Math.round(400*sf+shifX),Math.round(400*sf+shifX)};
		int y4[]= {Math.round(350*sf+shifY),Math.round(350*sf+shifY),Math.round(550*sf+shifY)};
		
		int x5[]= {Math.round(400*sf+shifX),Math.round(350*sf+shifX),Math.round(450*sf+shifX)};
		int y5[]= {Math.round(550*sf+shifY),Math.round(600*sf+shifY),Math.round(600*sf+shifY)};	

		g.setColor(Color.BLUE);
		g.fillPolygon(x,y,3);
		
		g.setColor(Color.RED);
		g.fillPolygon(x1,y1,3);	
		
		g.setColor(Color.cyan);	
		g.fillPolygon(x3,y3,3);	
		
		g.setColor(Color.orange);		
		g.fillPolygon(x4,y4,3);		
		
		g.setColor(Color.yellow);	
		g.fillPolygon(x5,y5,3);	
		
		g.setColor(Color.black);		
		g.drawPolygon(x,y,3);
		g.drawPolygon(x1,y1,3);	
		g.drawPolygon(x3,y3,3);
		g.drawPolygon(x4,y4,3);	
		g.drawPolygon(x5,y5,3);	
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "K;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Kite;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }

	}
}
