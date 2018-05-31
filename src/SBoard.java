
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



public class SBoard extends JPanel
{
	
	public SBoard(int x, int y)
	{
		setLocation(x,y);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		setSize(200,200);
		gbc.gridx=0;
		gbc.gridy=0;
		
		JButton btn1 = new JButton("");
		btn1.setPreferredSize(new Dimension(45,45));
		add(btn1,gbc);
		gbc.gridx++;
		
		JButton btn2 = new JButton("");
		btn2.setPreferredSize(new Dimension(45,45));
		add(btn2,gbc);
		gbc.gridx++;
		
		JButton btn3 = new JButton("");
		btn3.setPreferredSize(new Dimension(45,45));
		add(btn3,gbc);
		gbc.gridx=0;
		gbc.gridy++;
		
		JButton btn4 = new JButton("");
		btn4.setPreferredSize(new Dimension(45,45));
		add(btn4,gbc);
		gbc.gridx++;
		
		JButton btn5 = new JButton("");
		btn5.setPreferredSize(new Dimension(45,45));
		add(btn5,gbc);
		gbc.gridx++;
		
		JButton btn6 = new JButton("");
		btn6.setPreferredSize(new Dimension(45,45));
		add(btn6,gbc);
		gbc.gridx=0;
		gbc.gridy++;
		
		JButton btn7 = new JButton("");
		btn7.setPreferredSize(new Dimension(45,45));
		add(btn7,gbc);
		gbc.gridx++;
		
		JButton btn8 = new JButton("");
		btn8.setPreferredSize(new Dimension(45,45));
		add(btn8,gbc);
		gbc.gridx++;
		
		JButton btn9= new JButton("");
		btn9.setPreferredSize(new Dimension(45,45));
		add(btn9,gbc);
		
		btn1.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn1.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn1.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn1.setText("");
			        }
			   }
		});
		
		btn2.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn2.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn2.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn2.setText("");
			        }
			   }
		});
		
		btn3.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn3.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn3.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn3.setText("");
			        }
			   }
		});
		
		btn4.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn4.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn4.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn4.setText("");
			        }
			   }
		});
		
		btn5.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn5.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn5.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn5.setText("");
			        }
			   }
		});
		
		btn6.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn6.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn6.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn6.setText("");
			        }
			   }
		});
		
		btn7.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn7.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn7.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn7.setText("");
			        }
			   }
		});
		
		btn8.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn8.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn8.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn8.setText("");
			        }
			   }
		});
		
		btn9.addActionListener(new ActionListener()
		{
			int temp = 0;
			public void actionPerformed(ActionEvent e)
			{
				temp++;
			        if (temp % 3 == 1) 
			        {
			           btn9.setText("X");			            
			        }
			        if (temp % 3 == 2)
			        {
			           btn9.setText("O"); 
			        }
			        if (temp % 3 == 0)
			        {
			        	btn9.setText("");
			        }
			   }
		});
	
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle smallLine1 = new Rectangle(67,10,2,187);
		g2.fill(smallLine1);
		Rectangle smallLine2 = new Rectangle(133,10,2,187);
		g2.fill(smallLine2);
		Rectangle smallLine3 = new Rectangle(10,67,187,2);
		g2.fill(smallLine3);
		Rectangle smallLine4 = new Rectangle(10,133,187,2);
		g2.fill(smallLine4);
		
		
		
	}
	
}
