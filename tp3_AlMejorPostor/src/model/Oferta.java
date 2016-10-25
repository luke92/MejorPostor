package model;

import java.sql.Time;
import java.util.List;

public class Oferta 
{
	private Time _horaInicio;
	private Time _horaFin;
	private double _precio;
	private String _nombre;
	private List<String> _facilidades;
	
	public Oferta(Time horaInicio, Time horaFin, double precio, String nombre, List<String> facilidades)
	{
		_horaInicio = horaInicio;
		_horaFin = horaFin;
		_precio = precio;
		_nombre = nombre;
		_facilidades = facilidades;
	}
}