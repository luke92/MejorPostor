package main.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainForm 
{
	public static void main(String[] args)
	{
		JFrame juego = new JFrame();
		juego.setTitle("Creizi Records Reservas");
		juego.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		juego.setSize(640, 480);
		juego.setResizable(false);

		OptionsForm optionsForm = new OptionsForm("img/fondo.jpg");
		juego.getContentPane().add(optionsForm);
		
		JButton btnCargarOfertas = new JButton("Cargar Ofertas");
		btnCargarOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarOfertas();
			}
		});
		optionsForm.setLayout(null);
		btnCargarOfertas.setBounds(238, 51, 121, 23);
		optionsForm.add(btnCargarOfertas);

		juego.setLocationRelativeTo(null);
		juego.setVisible(true);
	}
	
	private static void cargarOfertas() {}
}
