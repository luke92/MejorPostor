package test.controller;


import static org.junit.Assert.*;

import org.junit.Test;

import main.controller.Ofertas;
import main.model.Oferta;

public class OfertasTest {
	
	private Ofertas instancia(){
		Ofertas o = new Ofertas();

		// cambie el Time por int para probar (porque no se como funciona el Time)
		o.agregar(new Oferta(8, 12, 800.0, "Juan", null));
		o.agregar(new Oferta(12, 15, 700.0, "Pedro", null));
		o.agregar(new Oferta(11, 16, 500.0, "Marta", null));
		o.agregar(new Oferta(17, 21, 700.0, "Lucas", null));
		o.agregar(new Oferta(7, 11, 700.0, "Maxi", null));

		return o;
	}

	@Test
	public void agregarOfertaTest() {
		Ofertas o = instancia();
		
		assertTrue(o.contains(new Oferta(17, 21, 700.0, "Lucas", null)));
		assertTrue(o.contains(new Oferta(7, 11, 700.0, "Maxi", null)));

		o.agregar(new Oferta(15, 17, 207.5, "Solana", null));
		o.agregar(new Oferta(15, 17, 1000.1, "SI no te rindes", null));

		assertTrue(o.contains(new Oferta(15, 17, 207.5, "Solana", null)));
		assertTrue(o.contains(new Oferta(15, 17, 1000.1, "SI no te rindes", null)) );
	}
	
	@Test
	public void removerOfertaTest() {
		Ofertas o = instancia();
		
		assertTrue( o.contains( new Oferta(17, 21, 700.0, "Lucas", null)) );
		o.remover( new Oferta(17, 21, 700.0, "Lucas", null) );
		assertFalse( o.contains( new Oferta(17, 21, 700.0, "Lucas", null)) );

		assertTrue(o.contains(new Oferta(7, 11, 700.0, "Maxi", null)));
		o.remover(new Oferta(7, 11, 700.0, "Maxi", null));
		assertFalse(o.contains(new Oferta(7, 11, 700.0, "Maxi", null)));
	}

}
