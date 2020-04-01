package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.awt.*;
import javax.swing.JFrame;

public class LforLeaf extends Canvas{

  public void paint(Graphics g) {
	  
	  float sf = (float) 1;
	  int shifX = 30;
	  int shifY = 0;
      
	  g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
	  g.setColor(Color.black);
	  g.drawString("Leaf",Math.round(380*sf+shifX),Math.round(670*sf+shifY));
	  
	  g.setColor(Color.green);
	  g.fillOval(Math.round(330*sf+shifX),Math.round(180*sf+shifY),Math.round(220*sf),Math.round(400*sf));
	  g.fillRect(Math.round(430*sf+shifX),Math.round(120*sf+shifY),Math.round(20*sf),Math.round(60*sf));
	  
	  g.setColor(Color.black);
	  g.drawLine(Math.round(440*sf+shifX),Math.round(180*sf+shifY),Math.round(440*sf+shifX),Math.round(580*sf+shifY));
	  
	  g.drawLine(Math.round(440*sf+shifX),Math.round(210*sf+shifY),Math.round(335*sf+shifX),Math.round(320*sf+shifY));
	  g.drawLine(Math.round(440*sf+shifX),Math.round(210*sf+shifY),Math.round(545*sf+shifX),Math.round(320*sf+shifY));
	  
	  g.drawLine(Math.round(440*sf+shifX),Math.round(310*sf+shifY),Math.round(335*sf+shifX),Math.round(420*sf+shifY));
	  g.drawLine(Math.round(440*sf+shifX),Math.round(310*sf+shifY),Math.round(545*sf+shifX),Math.round(420*sf+shifY));
	  
	  g.drawLine(Math.round(440*sf+shifX),Math.round(410*sf+shifY),Math.round(360*sf+shifX),Math.round(520*sf+shifY));
	  g.drawLine(Math.round(440*sf+shifX),Math.round(410*sf+shifY),Math.round(520*sf+shifX),Math.round(520*sf+shifY));
	  

	  g.drawLine(Math.round(440*sf+shifX),Math.round(510*sf+shifY),Math.round(400*sf+shifX),Math.round(565*sf+shifY));
	  g.drawLine(Math.round(440*sf+shifX),Math.round(510*sf+shifY),Math.round(480*sf+shifX),Math.round(565*sf+shifY));
	  
	  g.drawOval(Math.round(330*sf+shifX),Math.round(180*sf+shifY),Math.round(220*sf),Math.round(400*sf));
	  g.drawRect(Math.round(430*sf+shifX),Math.round(120*sf+shifY),Math.round(20*sf),Math.round(60*sf));
	   
	   try {
		   Runtime.getRuntime().exec("espeak "+ '"' + "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;for;;;;;;;;;;Leaf;;;;;;;;;;" + '"');
		   Thread.sleep(100);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   } catch (InterruptedException e1) {
		   e1.printStackTrace();
	   }	
  }
}
