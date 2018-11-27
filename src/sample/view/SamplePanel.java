package sample.view;

import sample.controller.GUIController;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	private JButton colorButton;
	private JLabel textLabel;
	
	public SamplePanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		colorButton = new JButton("Click to change color");		
		textLabel = new JLabel("this is a color app");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.add(textLabel);
		this.add(colorButton);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent mouseClick)
			{
				System.out.println("I Clicked a button!!!!!");
			}
			
				});
		
	}
}
