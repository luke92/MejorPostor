package main.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainForm 
{
	public static void main(String[] args)
	{
		JFrame juego = new JFrame();
		juego.setTitle("Creizi Records Reservas");
		juego.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		juego.setSize(640, 480);
		juego.setResizable(false);

		juego.getContentPane().add(new OptionsForm("img/fondo.jpg"));

		juego.setLocationRelativeTo(null);
		juego.setVisible(true);
	  }
}
