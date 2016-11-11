package main.controller;

import java.util.ArrayList;

import main.model.Oferta;
import main.service.OfertaService;

public class Application 
{
	public static void agregarOferta(Oferta of)
	{
		ArrayList<Oferta> ofertas = OfertaService.getOfertasRecibidas();
		ofertas.add(of);
		OfertaService.guardarOfertasRecibidas(ofertas);
	}
}
