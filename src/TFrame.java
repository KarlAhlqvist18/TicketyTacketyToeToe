
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TFrame extends JFrame
{
	public TFrame()
	{
		setBounds(100,50,625,650);
		setLayout(null);
	
		TBoard board = new TBoard();
		add(board);
		SBoard boardtl = new SBoard(0,0);
		add(boardtl);
		SBoard boardtc = new SBoard(200,0);
		add(boardtc);
		SBoard boardtr = new SBoard(400,0);
		add(boardtr);
		SBoard boardml = new SBoard(0,200);
		add(boardml);
		SBoard boardmc = new SBoard(200,200);
		add(boardmc);
		SBoard boardmr = new SBoard(400,200);
		add(boardmr);
		SBoard boardbl = new SBoard(0,400);
		add(boardbl);
		SBoard boardbc = new SBoard(200,400);
		add(boardbc);
		SBoard boardbr = new SBoard(400,400);
		add(boardbr);
		
	
	        
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

	public static void main(String[] args)
	{
		new TFrame();
	}
}


