package model;

import java.util.List;

public class Oferta 
{
	
	// TODO: le puse int para probar en el test
	private int _horaInicio;
	private int _horaFin;
	private double _precio;
	private String _nombre;
	private List<String> _facilidades;
	
	public Oferta(int i, int j, double precio, String nombre, List<String> facilidades)
	{
		_horaInicio = i;
		_horaFin = j;
		_precio = precio;
		_nombre = nombre;
		_facilidades = facilidades;
	}
	
	public int getHoraInicio(){
		return _horaInicio;
	}
	
	public int getHoraFin(){
		return _horaFin;
	}
	
	public double getPrecio(){
		return _precio;
	}
	
	public String getNombre(){
		return _nombre;
	}
	
	public List<String> facilidades(){
		return _facilidades;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Oferta other = (Oferta) obj;
		if (_horaInicio != other._horaInicio)
			return false;
		if (_horaFin != other._horaFin)
			return false;
		if (_precio != other._precio)
			return false;
		if (_nombre != other._nombre)
			return false;
		if (_facilidades != other._facilidades)
			return false;
		
		return true;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: " + _nombre + ". De " + _horaInicio + " a " + _horaFin + ". Precio: " + _precio + ". " + _facilidades ;
	}
	
}