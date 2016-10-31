package main.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class OptionsForm extends JPanel {
	
	public OptionsForm() 
	{
		
	}
	
	 @Override
	 public void paintComponent(Graphics g) 
	 {
		 
		 Image fondo = Toolkit.getDefaultToolkit().getImage(OptionsForm.class.getResource("img/fondo.jpg"));
		 g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);  
	 }  

}
