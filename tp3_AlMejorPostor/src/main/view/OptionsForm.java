package main.view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionsForm extends JPanel {
	private static final long serialVersionUID = 1L;
	Image imagen;
	String rutaImagen;

	public OptionsForm(String nombre) 
	{
		this.rutaImagen= nombre;
		this.setLayout(null);
		
		JButton btnCargarOfertas = new JButton("Cargar Ofertas");
		btnCargarOfertas.setBounds(238, 51, 121, 23);
		btnCargarOfertas.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				cargarOfertas();
			}

		});
		this.add(btnCargarOfertas);
		
		
	}
	
	 public void paint(Graphics g)
	 {
		imagen = new ImageIcon(rutaImagen).getImage();
		g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), null);
		setOpaque(false);
		super.paint(g);
	 }  
	 
	 private void cargarOfertas() 
	 {
			// TODO Auto-generated method stub		
	}

}