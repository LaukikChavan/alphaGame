package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class XForXylophone extends Canvas{
	public void paint(Graphics g) {
		float sf = (float)1.5;
		int shifX = 150;
		int shifY = 120;
		

		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));				    
		g.setColor(Color.black);
		g.drawString("Xylophone",Math.round(145*sf+shifX), Math.round(380*sf+shifY));
		
		g.setColor(new Color(76,49,0));
		g.fillRect(Math.round(-10*sf+shifX),Math.round(20*sf+shifY),Math.round(20*sf),Math.round(320*sf));
		g.fillRect(Math.round(405*sf+shifX),Math.round(20*sf+shifY),Math.round(20*sf),Math.round(320*sf));
		g.fillRect(Math.round(-10*sf+shifX),Math.round(160*sf+shifY),Math.round(435*sf),Math.round(20*sf));
		
		g.setColor(new Color(255, 0 , 0));
		g.fillRoundRect(Math.round(20*sf+shifX),Math.round(20*sf+shifY),Math.round(45*sf),Math.round(320*sf),Math.round(15*sf),Math.round(15*sf));
		g.setColor(new Color(255, 127, 0));
		g.fillRoundRect(Math.round(75*sf+shifX),Math.round(30*sf+shifY),Math.round(45*sf),Math.round(300*sf),Math.round(15*sf),Math.round(15*sf));
		g.setColor(new Color(255, 255, 0));
		g.fillRoundRect(Math.round(130*sf+shifX),Math.round(40*sf+shifY),Math.round(45*sf),Math.round(280*sf),Math.round(15*sf),Math.round(15*sf));
		g.setColor(new Color(0, 255, 0));
		g.fillRoundRect(Math.round(185*sf+shifX),Math.round(50*sf+shifY),Math.round(45*sf),Math.round(260*sf),Math.round(15*sf),Math.round(15*sf));
		g.setColor(new Color(0, 0, 255));
		g.fillRoundRect(Math.round(240*sf+shifX),Math.round(60*sf+shifY),Math.round(45*sf),Math.round(240*sf),Math.round(15*sf),Math.round(15*sf));
		g.setColor(new Color(148, 0, 211));
		g.fillRoundRect(Math.round(295*sf+shifX),Math.round(70*sf+shifY),Math.round(45*sf),Math.round(220*sf),Math.round(15*sf),Math.round(15*sf));
		g.setColor(new Color(75, 0, 130));
		g.fillRoundRect(Math.round(350*sf+shifX),Math.round(80*sf+shifY),Math.round(45*sf),Math.round(200*sf),Math.round(15*sf),Math.round(15*sf));

		g.setColor(new Color(177,117,58));
		g.fillOval(Math.round(27*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(82*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(137*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(192*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(247*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(302*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		g.fillOval(Math.round(357*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		
		g.setColor(new Color(250,91,61));
		g.fillRect(Math.round(470*sf+shifX),Math.round(5*sf+shifY),Math.round(10*sf),Math.round(360*sf));
		g.fillOval(Math.round(460*sf+shifX),Math.round(-25*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		
		g.setColor(Color.BLACK);
		g.drawRect(Math.round(-10*sf+shifX),Math.round(20*sf+shifY),Math.round(20*sf),Math.round(320*sf));
		g.drawRect(Math.round(405*sf+shifX),Math.round(20*sf+shifY),Math.round(20*sf),Math.round(320*sf));
		
		g.drawRect(Math.round(470*sf+shifX),Math.round(5*sf+shifY),Math.round(10*sf),Math.round(360*sf));
		g.drawOval(Math.round(460*sf+shifX),Math.round(-25*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		
		g.drawRoundRect(Math.round(20*sf+shifX),Math.round(20*sf+shifY),Math.round(45*sf),Math.round(320*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(27*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		
		g.drawRoundRect(Math.round(75*sf+shifX),Math.round(30*sf+shifY),Math.round(45*sf),Math.round(300*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(82*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));

		g.drawRoundRect(Math.round(130*sf+shifX),Math.round(40*sf+shifY),Math.round(45*sf),Math.round(280*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(137*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));

		g.drawRoundRect(Math.round(185*sf+shifX),Math.round(50*sf+shifY),Math.round(45*sf),Math.round(260*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(192*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));

		g.drawRoundRect(Math.round(240*sf+shifX),Math.round(60*sf+shifY),Math.round(45*sf),Math.round(240*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(247*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));

		g.drawRoundRect(Math.round(295*sf+shifX),Math.round(70*sf+shifY),Math.round(45*sf),Math.round(220*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(302*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));

		g.drawRoundRect(Math.round(350*sf+shifX),Math.round(80*sf+shifY),Math.round(45*sf),Math.round(200*sf),Math.round(15*sf),Math.round(15*sf));
		g.drawOval(Math.round(357*sf+shifX),Math.round(155*sf+shifY),Math.round(30*sf),Math.round(30*sf));
		   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "X;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Xylophone;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }
	}
}
