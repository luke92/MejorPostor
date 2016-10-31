package main.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class OptionsForm extends JPanel {
	private static final long serialVersionUID = 1L;
	Image imagen;
	String nombre;

	public OptionsForm(String nombre) 
	{
		this.nombre= nombre;
	}
	
	 public void paint(Graphics g)
	 {
		imagen = new ImageIcon(nombre).getImage();
		g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), null);
		setOpaque(false);
		super.paint(g);
	 }  

}