package main.util;

import java.util.Comparator;
import java.time.LocalDate;

import main.model.Oferta;

public abstract class Comparador
{
	public static int compareFecha(LocalDate day1, LocalDate day2)
	{
		return day1.compareTo(day2);
	}
	
	public static Comparator<Oferta> porFecha()
	{
		return new Comparator<Oferta>() {
			@Override
			public int compare(Oferta uno, Oferta otro) {
				return uno.get_fecha().compareTo(otro.get_fecha());
			}
		};
	}
	
	public static Comparator<Oferta> porHorario()
	{
		return new Comparator<Oferta>() {
			@Override
			public int compare(Oferta uno, Oferta dos) {
				if (uno.get_fecha().isEqual(dos.get_fecha())) {
					if ((uno.get_inicio() <= dos.get_inicio()) && (uno.get_fin() <= dos.get_inicio())
							|| (dos.get_inicio() <= uno.get_inicio()) && (dos.get_fin() <= uno.get_inicio()))
						return 0;	//si no se superponen retorna cero
					if (uno.get_fin() > dos.get_inicio() || uno.get_inicio() > dos.get_fin())
						return 1;	//si se superponen retorna uno
				}
				else
					return uno.get_fecha().compareTo(dos.get_fecha());
				return -1;
			}
		};
	}
}
