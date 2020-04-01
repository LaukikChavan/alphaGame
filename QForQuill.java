package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class QForQuill extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.7;
		int shifX = 350;
		int shifY = 250;		
		
		int[] polyX1 = {Math.round(150*sf+shifX),Math.round(158*sf+shifX),Math.round(165*sf+shifX)};
		int[] polyY1 = {Math.round(200*sf+shifY),Math.round(215*sf+shifY),Math.round(200*sf+shifY)};

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Quill",Math.round(30*sf+shifX), Math.round(280*sf+shifY));


		Font f=new Font("Homemade apple",Font.PLAIN,Math.round(35*sf));
		g.setFont(f);
		g.setColor(new Color(0,63,142));
		g.drawString("ABCD",Math.round(43*sf+shifX), Math.round(225*sf+shifY));
		
		g.setColor(new Color(255,215,0));
		g.fillRect(Math.round(150*sf+shifX), Math.round(152*sf+shifY),Math.round(15*sf), Math.round(50*sf));

		g.setColor(new Color(61,110,255));
		g.fillOval(Math.round(112*sf+shifX), Math.round(-105*sf+shifY),Math.round(90*sf), Math.round(255*sf));

		g.setColor(new Color(0,43,132));		
		g.fillRect(Math.round(-60*sf+shifX), Math.round(-24*sf+shifY),Math.round(60*sf), Math.round(20*sf));
		
		g.setColor(Color.black);
		g.drawRect(Math.round(-60*sf+shifX), Math.round(-24*sf+shifY),Math.round(60*sf), Math.round(20*sf));

		g.setColor(new Color(0,43,132));		
		g.fillOval(Math.round(-60*sf+shifX), Math.round(-30*sf+shifY),Math.round(60*sf), Math.round(10*sf));
		g.fillRoundRect(Math.round(-80*sf+shifX), Math.round(-5*sf+shifY),Math.round(100*sf), Math.round(60*sf),Math.round(15*sf),Math.round(15*sf));
		
		g.setColor(Color.black);		
		g.drawOval(Math.round(-60*sf+shifX), Math.round(-30*sf+shifY),Math.round(60*sf), Math.round(10*sf));
		g.drawRoundRect(Math.round(-80*sf+shifX), Math.round(-5*sf+shifY),Math.round(100*sf), Math.round(60*sf),Math.round(15*sf),Math.round(15*sf));
		
		g.setColor(Color.white);
		g.fillRect(Math.round(-80*sf+shifX), Math.round(10*sf+shifY),Math.round(100*sf), Math.round(20*sf));

		g.setColor(Color.black);
		g.drawRect(Math.round(-80*sf+shifX), Math.round(10*sf+shifY),Math.round(100*sf), Math.round(20*sf));

		
		g.setFont(new Font("Times New Roman",Font.PLAIN,Math.round(15*sf)));
		g.setColor(new Color(0,63,142));
		g.drawString("Ink",Math.round(-40*sf+shifX), Math.round(24*sf+shifY));
		
		g.setColor(Color.black);		
		int j = 0;
		float q = (float) 0.6;
		for(int i=0; i < (48*sf); i++) {
			g.drawLine(Math.round(155*sf+shifX), Math.round(155*sf+shifY-j),Math.round(152*sf+shifX - Math.round(q)), Math.round(150*sf+shifY-j));
			g.drawLine(Math.round(158*sf+shifX), Math.round(155*sf+shifY-j),Math.round(161*sf+shifX + Math.round(q)), Math.round(150*sf+shifY-j));
			
			j += 3;
			
			if(i < (15*sf)) {
				q += 1.7;
				g.setColor(new Color(255,213,61));
			} else if (i < (35*sf)) {
				q += 0.5;
			}
			else {
				q += 0.2;
				g.setColor(new Color(61,255,216));
			}
		}
		
		for(int i=0; i < (33*sf); i++) {
			g.drawLine(Math.round(155*sf+shifX), Math.round(155*sf+shifY-j),Math.round(152*sf+shifX - Math.round(q)), Math.round(150*sf+shifY-j));
			g.drawLine(Math.round(158*sf+shifX), Math.round(155*sf+shifY-j),Math.round(161*sf+shifX + Math.round(q)), Math.round(150*sf+shifY-j));
			
			j += 3;
			if(i < (10*sf)) {
				q -= 0.2;
				g.setColor(new Color(61,255,216));
			} else if (i < (20*sf)) {
				q -= 0.7;
				g.setColor(new Color(255,61,113));
			}
			else {
				q -= 1.3;
			}
		}
		
		g.setColor(Color.black);
		g.drawRect(Math.round(150*sf+shifX), Math.round(152*sf+shifY),Math.round(15*sf), Math.round(50*sf));
		g.drawOval(Math.round(150*sf+shifX), Math.round(200*sf+shifY),Math.round(15*sf), Math.round(5*sf));
		

		g.setColor(new Color(255,215,0));
		g.fillOval(Math.round(150*sf+shifX), Math.round(200*sf+shifY),Math.round(15*sf), Math.round(5*sf));

		g.setColor(new Color(255,215,0));
		g.fillOval(Math.round(155*sf+shifX), Math.round(215*sf+shifY),Math.round(5*sf), Math.round(5*sf));

		g.setColor(new Color(255,215,0));
		g.fillPolygon(polyX1, polyY1, 3);
		
		g.setColor(new Color(255,250,240));
		g.fillRect(Math.round(155*sf+shifX), Math.round(-90*sf+shifY),Math.round(3*sf), Math.round(245*sf));		
		
		g.setColor(Color.black);
		g.drawOval(Math.round(155*sf+shifX), Math.round(215*sf+shifY),Math.round(5*sf), Math.round(5*sf));
		g.drawPolygon(polyX1, polyY1, 3);
		
		g.drawRect(Math.round(155*sf+shifX), Math.round(-90*sf+shifY),Math.round(3*sf), Math.round(245*sf));
		g.drawOval(Math.round(112*sf+shifX), Math.round(-105*sf+shifY),Math.round(90*sf), Math.round(255*sf));
		
		g.setColor(new Color(255,215,0));
		g.fillOval(Math.round(150*sf+shifX), Math.round(150*sf+shifY),Math.round(15*sf), Math.round(5*sf));
		
		g.setColor(Color.black);
		g.drawOval(Math.round(150*sf+shifX), Math.round(150*sf+shifY),Math.round(15*sf), Math.round(5*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "Q;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Quill;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
	}
}
