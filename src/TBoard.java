
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComponent;

public class TBoard extends JComponent
{
	public TBoard()
	{
		setLocation(0,0);
		setSize(600,600);
		
	
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		//Main
		Rectangle bigLine1 = new Rectangle(200,5,5,600);
		g2.fill(bigLine1);
		Rectangle bigLine2 = new Rectangle(400,5,5,600);
		g2.fill(bigLine2);
		Rectangle bigLine3 = new Rectangle(5,200,630,5);
		g2.fill(bigLine3);
		Rectangle bigLine4 = new Rectangle(5,400,630,5);
		g2.fill(bigLine4);
		
				
		
	}
}


