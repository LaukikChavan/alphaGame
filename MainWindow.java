package CGMiniProjectTheGame;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow implements KeyListener{
	
	public  Label l;
	public  JFrame frame;
	public JPanel panel;
	public JPanel center;
	
	MainWindow() {
		frame = new JFrame();
		panel = new JPanel(new BorderLayout());
		l = new Label("Plz enter Character A to Z");
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		frame.setSize(width/2, 900);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(this);
		frame.setVisible(true);				
		
		panel.add(l,BorderLayout.SOUTH);
		panel.add(new StartingWindow(), BorderLayout.CENTER);
		
		frame.setContentPane(panel);	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char ch=e.getKeyChar();
        
		   if(ch=='a'||ch=='A')
		   {
			   l.setText("You press A");	
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new AforApple(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='b'||ch=='B')
		   {
			   l.setText("You press B");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();		   

			   panel.add(new BforBall(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
			   	
			   
		   }
		   else if(ch=='c'||ch=='C')
		   {
			   l.setText("You press C");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new CforCamera(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
			   
		   }
		   else if(ch=='d'||ch=='D')
		   {
			   l.setText("You press D");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new DforDictionary(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
			   
		   }
		   else if(ch=='e'||ch=='E')
		   {
			   l.setText("You press E");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new EforEyes(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='f'||ch=='F')
		   {
			   l.setText("You press F");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new FforFlower(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='g'||ch=='G')
		   {
			   l.setText("You press G");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new GforGlue(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='h'||ch=='H')
		   {
			   l.setText("You press H");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new HforHat(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='i'||ch=='I')
		   {
			   l.setText("You press I");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new IforIcecreame(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='j'||ch=='J')
		   {
			   l.setText("You press J");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new JforJuice(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='k'||ch=='K')
		   {
			   l.setText("You press K");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new KforKite(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='l'||ch=='L')
		   {
			   l.setText("You press L");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new LforLeaf(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='m'||ch=='M')
		   {
			   l.setText("You press M");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new MForMan(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='n'||ch=='N')
		   {
			   l.setText("You press N");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new NForNight(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='o'||ch=='O')
		   {
			   l.setText("You press O");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new OForOrange(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='p'||ch=='P')
		   {
			   l.setText("You press P");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new PForPanda(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='q'||ch=='Q')
		   {
			   l.setText("You press Q");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new QForQuill(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='r'||ch=='R')
		   {
			   l.setText("You press R");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new RForRing(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='s'||ch=='S')
		   {
			   l.setText("You press S");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new SForStar(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='t'||ch=='T')
		   {
			   l.setText("You press T");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new TForTabel(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='u'||ch=='U')
		   {
			   l.setText("You press U");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new UForUmbrella(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='v'||ch=='V')
		   {
			   l.setText("You press V");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new VForVase(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='w'||ch=='W')
		   {
			   l.setText("You press W");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new WForWall(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
		   else if(ch=='x'||ch=='X')
		   {
			   l.setText("You press X");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new XForXylophone(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='y'||ch=='Y')
		   {
			   l.setText("You press Y");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new YForYatch(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else if(ch=='z'||ch=='Z')
		   {
			   l.setText("You press Z");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new ZForZebraCrossing(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();	
		   }
		   else
		   {
			   l.setText("Plz enter Character A to Z");
			   panel.removeAll();
			   panel.repaint();
			   panel.revalidate();			   

			   panel.add(new StartingWindow(),BorderLayout.CENTER);
			   panel.add(l,BorderLayout.SOUTH);
			   panel.repaint();
			   panel.revalidate();
		   }
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}

	@Override
	public void keyTyped(KeyEvent e) {		
	}	
}
