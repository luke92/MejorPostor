package model;

import java.sql.Time;

public class Oferta 
{
	private Time _horaInicio;
	private Time _horaFin;
	private double _precio;
	
	public Oferta(Time horaInicio, Time horaFin, double precio)
	{
		_horaInicio = horaInicio;
		_horaFin = horaFin;
		_precio = precio;
	}
}