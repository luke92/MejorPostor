package test.controller;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import main.model.Oferta;
import main.controller.Ofertas;

public class OfertasTest {
	private LocalDateTime l = LocalDateTime.now();
	
	private Ofertas instancia(){
		Ofertas o = new Ofertas();
		o.agregar(new Oferta(l.withHour(8), l.withHour(11), 800, "GZ", "1158882866", "2 MICS y Teclado"));
		o.agregar(new Oferta(l.withHour(12), l.withHour(15), 700, "Pedro", null, null));
		o.agregar(new Oferta(l.withHour(11), l.withHour(16), 500, "Marta", null, null));
		o.agregar(new Oferta(l.withHour(17), l.withHour(21), 700, "Lucas", null, null));
		o.agregar(new Oferta(l.withHour(7), l.withHour(11), 700, "Maxi", null, null));

		return o;
	}

	@Test
	public void agregarOfertaTest() {
		Ofertas o = instancia();

		assertTrue(o.contains(new Oferta(l.withHour(17), l.withHour(21), 700, "Lucas", null, null)));
		assertTrue(o.contains(new Oferta(l.withHour(7), l.withHour(11), 700, "Maxi", null, null)));

		o.agregar(new Oferta(l.withHour(15), l.withHour(17), 207, "Solana", null, null));
		o.agregar(new Oferta(l.withHour(15), l.withHour(17), 1000, "SI no te rindes", null, null));

		assertTrue(o.contains(new Oferta(l.withHour(15), l.withHour(17), 207, "Solana", null, null)));
		assertTrue(o.contains(new Oferta(l.withHour(15), l.withHour(17), 1000, "SI no te rindes", null,null)) );
	}
	
	@Test
	public void removerOfertaTest() {
		Ofertas o = instancia();
		
		assertTrue(o.contains(new Oferta(l.withHour(17), l.withHour(21), 700, "Lucas", null, null)));
		o.remover(new Oferta(l.withHour(17), l.withHour(21), 700, "Lucas", null, null));
		assertFalse(o.contains(new Oferta(l.withHour(17), l.withHour(21), 700, "Lucas", null, null)));

		assertTrue(o.contains(new Oferta(l.withHour(7), l.withHour(11), 700, "Maxi", null, null)));
		o.remover(new Oferta(l.withHour(7), l.withHour(11), 700, "Maxi", null, null));
		assertFalse(o.contains(new Oferta(l.withHour(7), l.withHour(11), 700, "Maxi", null,null)));
	}

}
