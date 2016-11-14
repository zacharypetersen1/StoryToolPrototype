package creationButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import infrastructure.*;


public class MakeListener implements ActionListener {

	Controller arch;
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{	
			Controller.controller.starter.findStage();
			Controller.controller.starter.make();
		}
		catch(IOException ex)
		{
			System.out.println("failed");
		}
	}
	
}
