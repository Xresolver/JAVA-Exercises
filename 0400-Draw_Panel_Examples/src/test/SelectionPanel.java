package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import exemples.PanelExamples;

public class SelectionPanel extends JPanel
{	
	private String selectedRadioButton = new String();
	
	public SelectionPanel()
	{
		
		JRadioButton r1 = new JRadioButton("Panel Example-01");
		JRadioButton r2 = new JRadioButton("Panel Example-02");
		JRadioButton r3 = new JRadioButton("Panel Example-03");
		JRadioButton r4 = new JRadioButton("Panel Example-04");
	
		JButton buttonOK = new JButton("OK");
		
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		group.add(r4);

		this.add(r1);
		this.add(r2);
		this.add(r3);
		this.add(r4);
		this.add(buttonOK);
	
		buttonOK.addActionListener
		(
			new ActionListener() 
			{
				@Override
				public void actionPerformed(ActionEvent event) 
				{
					if(r1.isSelected())
						selectedRadioButton = r1.getText();
					else if(r2.isSelected())
						selectedRadioButton = r2.getText();
					else if(r3.isSelected())
						selectedRadioButton = r3.getText();
					else if(r4.isSelected())
						selectedRadioButton = r4.getText();
					
					PanelExamples panel = new PanelExamples(selectedRadioButton);
					
					// create a new frame to hold the panel
					JFrame application = new JFrame();
					
					// set the frame to exit when it is closed
					application.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					
					application.add(panel); // add the panel to the frame
					application.setSize(250, 250); // set the size of the frame
					application.setVisible(true); // make the frame visible	
					
				
				}
			}
		);
		
	}
	
}
