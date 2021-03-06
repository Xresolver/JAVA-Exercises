package test;

import javax.swing.JFrame;


public class DrawPanelTest
{
	
	public static void main(String args[])
	{
		// create a panel that contains JButton and JRadioButton 
		SelectionPanel panel = new SelectionPanel();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		application.add(panel); // add the panel to the frame
		application.setSize(200, 250); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}

}
