package CGMiniProjectTheGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;

public class StartingWindow extends Canvas{
	float sf = (float) 8.3;
	int shifX = -60;
	int shifY = 150;	
	int[] aniY = {280,280,280,280,280,280,280,280,280,280,280,280,280,280,280,280,280,280};
	int j = -1;
	
	public void paint(Graphics g) {	
		j++;		
		g.setFont(new Font("Concert One", Font.PLAIN, 80));		
		if(j % 70 <= 9) {
			g.setColor(Color.magenta);				
		} else if(j % 70 <= 19) {
			g.setColor(Color.red);					
		} else if(j % 70 <= 29) {
			g.setColor(Color.orange);					
		} else if(j % 70 <= 39) {
			g.setColor(Color.yellow);					
		} else if(j % 70 <= 49) {
			g.setColor(Color.green);					
		} else if(j % 70 <= 59) {
			g.setColor(Color.cyan);					
		} else if(j % 70 <= 69) {
			g.setColor(Color.blue);					
		} else {
			g.setColor(Color.black);
		}		
		drawMyString(g);
		g.setFont(new Font("Luckiest Guy", Font.PLAIN, 60));
		g.setColor(Color.red);
		g.drawString("Nursery Game", 280, 80);
		
		if(j == 0) {
			   try {
				   Runtime.getRuntime().exec("espeak "+ '"' + "Please;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Press;;;;;;;;;;a;;;;;;;;;;key;;;;;;;;;;;" + '"');
				   Thread.sleep(100);
			   } catch (IOException e1) {
				   e1.printStackTrace();
			   } catch (InterruptedException e1) {
				   e1.printStackTrace();
			   }	
		}
		
		changeNumber();
	}	
	public void drawMyString(Graphics g) {		
		g.drawString("P", Math.round(10*sf+shifX), aniY[0]+shifY);
		g.drawString("r", Math.round(15*sf+shifX), aniY[1]+shifY);
		g.drawString("e", Math.round(20*sf+shifX), aniY[2]+shifY);
		g.drawString("s", Math.round(25*sf+shifX), aniY[3]+shifY);
		g.drawString("s", Math.round(30*sf+shifX), aniY[4]+shifY);
		g.drawString("A", Math.round(40*sf+shifX), aniY[5]+shifY);
		g.drawString("n", Math.round(45*sf+shifX), aniY[6]+shifY);
		g.drawString("y", Math.round(50*sf+shifX), aniY[7]+shifY);
		g.drawString("F", Math.round(60*sf+shifX), aniY[8]+shifY);
		g.drawString("r", Math.round(65*sf+shifX), aniY[9]+shifY);
		g.drawString("o", Math.round(70*sf+shifX), aniY[10]+shifY);
		g.drawString("m", Math.round(75*sf+shifX), aniY[11]+shifY);
		g.drawString("K", Math.round(85*sf+shifX), aniY[12]+shifY);
		g.drawString("y", Math.round(90*sf+shifX), aniY[13]+shifY);
		g.drawString("e", Math.round(95*sf+shifX), aniY[14]+shifY);
		g.drawString("A", Math.round(105*sf+shifX),aniY[15]+shifY);
		g.drawString("-", Math.round(110*sf+shifX),aniY[16]+shifY);
		g.drawString("Z", Math.round(115*sf+shifX),aniY[17]+shifY);	
	}
	
	public void changeNumber() {
		try {
			Thread.sleep(100);
			if(j % 16 <= 3) {
				for(int i=0; i < 18; i++) {
					aniY[i] += 10;
				}
			} else if (j % 16 <= 7) {
				for(int i=0; i < 18; i++) {
					aniY[i] -= 10;
				}
				
			} else if (j % 16 <= 11) {
				for(int i=0; i < 18; i++) {
					aniY[i] -= 10;
				}			
			} else if(j % 16 <= 15){
				for(int i=0; i < 18; i++) {
					aniY[i] += 10;
				}
			}			
			repaint();
			revalidate();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
