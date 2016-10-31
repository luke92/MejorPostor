package main.model;

import java.time.LocalDateTime;

public class Oferta 
{
	private LocalDateTime _inicio;
	private LocalDateTime _fin;
	private int _precio;
	private String _banda;
	private String _telefono;
	private String _facilidades;
	
	public Oferta(LocalDateTime inicio, LocalDateTime fin, int precio, String banda, String telefono, String facilidades)
	{
		_inicio = inicio;
		_fin = fin;
		_precio = precio;
		_banda = banda;
		_telefono = telefono;
		_facilidades = facilidades;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_banda == null) ? 0 : _banda.hashCode());
		result = prime * result + ((_facilidades == null) ? 0 : _facilidades.hashCode());
		result = prime * result + ((_fin == null) ? 0 : _fin.hashCode());
		result = prime * result + ((_inicio == null) ? 0 : _inicio.hashCode());
		result = prime * result + _precio;
		result = prime * result + ((_telefono == null) ? 0 : _telefono.hashCode());
		return result;
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
		if (_banda == null) {
			if (other._banda != null)
				return false;
		} else if (!_banda.equals(other._banda))
			return false;
		if (_facilidades == null) {
			if (other._facilidades != null)
				return false;
		} else if (!_facilidades.equals(other._facilidades))
			return false;
		if (_fin == null) {
			if (other._fin != null)
				return false;
		} else if (!_fin.equals(other._fin))
			return false;
		if (_inicio == null) {
			if (other._inicio != null)
				return false;
		} else if (!_inicio.equals(other._inicio))
			return false;
		if (_precio != other._precio)
			return false;
		if (_telefono == null) {
			if (other._telefono != null)
				return false;
		} else if (!_telefono.equals(other._telefono))
			return false;
		return true;
	}
	
	
}