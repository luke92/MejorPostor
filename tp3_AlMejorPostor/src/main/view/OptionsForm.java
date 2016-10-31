package main.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class OptionsForm extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OptionsForm() 
	{
		
	}
	
	 @Override
	 public void paintComponent(Graphics g) 
	 {
		Image fondo = new ImageIcon("img/fondo.jpg").getImage();
		g.drawImage(fondo, 0, 0, this.getWidth(), this.getHeight(), this);  
	 }  

}
