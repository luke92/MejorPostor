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
			public int compare(Oferta uno, Oferta dos) {
				return uno.get_fecha().compareTo(dos.get_fecha());
			}
		};
	}
	
	public static Comparator<Oferta> porHorario()
	{
		return new Comparator<Oferta>() {
			@Override
			public int compare(Oferta uno, Oferta dos) {
				if (mismoDia(uno, dos)) {
					if (horariosSePisan(uno, dos))
						return 1;
					else
						return 0;
				} else
					return uno.get_fecha().compareTo(dos.get_fecha());
			}
		};
	}

	public static Comparator<Oferta> porBeneficio()	//si los horarios se pisan, retorna el precio de la oferta mayor
	{
		return new Comparator<Oferta>() {
			@Override
			public int compare(Oferta uno, Oferta dos) {
				if (mismoDia(uno, dos)) {
					if (horariosSePisan(uno, dos))
						if (uno.get_precio() >= dos.get_precio())
							return uno.get_precio();
						else
							return dos.get_precio();
				}
				return 0;
			}
		};
	}
	
	private static boolean mismoDia(Oferta uno, Oferta dos)
	{
		if (uno.get_fecha().isEqual(dos.get_fecha()))
			return true;
		return false;
	}
	
	private static boolean horariosSePisan(Oferta uno, Oferta dos)
	{
		if (mismoDia(uno, dos)) {
			if ((uno.get_inicio() <= dos.get_inicio()) && (uno.get_fin() <= dos.get_inicio())
					|| (dos.get_inicio() <= uno.get_inicio()) && (dos.get_fin() <= uno.get_inicio()))
				return false;
			if (uno.get_fin() > dos.get_inicio() || uno.get_inicio() > dos.get_fin())
				return true;
		}
		return true;
	}

}
