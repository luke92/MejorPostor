package main.controller;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.table.DefaultTableModel;

import main.model.Oferta;
import main.service.OfertaService;
import main.util.Comparador;

public class Application 
{
	public static void agregarOferta(Oferta of)
	{
		ArrayList<Oferta> ofertas = OfertaService.getOfertasRecibidas();
		ofertas.add(of);
		Collections.sort(ofertas,Comparador.porFecha());
		OfertaService.guardarOfertasRecibidas(ofertas);
	}
	
	public static DefaultTableModel mostrarTablaOfertas()
	{
		DefaultTableModel dtm = new DefaultTableModel();
		Object columnNames[] = { "Fecha", "Horario", "Precio", "Banda", "Facilidades", "Telefono" };
		for (Object columna : columnNames)
			dtm.addColumn(columna);
		for (Oferta o : OfertaService.getOfertasRecibidas()) {
			String datos[] = new String[6];
			datos[0] = o.get_fecha().toString();
			datos[1] = o.get_inicio() + " a " + o.get_fin();
			datos[2] = String.valueOf(o.get_precio());
			datos[3] = o.get_banda();
			datos[4] = o.get_facilidades();
			datos[5] = o.get_telefono();

			dtm.addRow(datos);
		}
		return dtm;
	}
	
	public static DefaultTableModel mostrarTablaOfertas(String textoFecha)
	{
		DefaultTableModel dtm = new DefaultTableModel();
		Object columnNames[] = { "Fecha", "Horario", "Precio", "Banda", "Facilidades", "Telefono" };
		for (Object columna : columnNames)
			dtm.addColumn(columna);
		for (Oferta o : OfertaService.getOfertasRecibidas(textoFecha)) {
			String datos[] = new String[6];
			datos[0] = o.get_fecha().toString();
			datos[1] = o.get_inicio() + " a " + o.get_fin();
			datos[2] = String.valueOf(o.get_precio());
			datos[3] = o.get_banda();
			datos[4] = o.get_facilidades();
			datos[5] = o.get_telefono();

			dtm.addRow(datos);
		}
		return dtm;
	}
}
