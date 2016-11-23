package main.controller;

import java.util.ArrayList;
import java.util.Collections;

import main.model.Oferta;
import main.util.Comparador;

public class Algoritmo 
{
	public static ArrayList<Oferta> Goloso(ArrayList<Oferta> ofertas)
	{
		ArrayList<Oferta> mejoresOfertas = new ArrayList<Oferta>();
		Collections.sort(ofertas, Comparador.porBeneficio());
		for(Oferta oferta : ofertas)
			if(!superPone(oferta,mejoresOfertas))
				mejoresOfertas.add(oferta);
		
		return mejoresOfertas;
		
	}
	
	private static boolean superPone(Oferta ofertaUno, ArrayList<Oferta> ofertas)
	{
		for(Oferta ofertaDos : ofertas)
			if(Comparador.horariosSePisan(ofertaUno, ofertaDos)) return true;
		
		return false;
	}

}
