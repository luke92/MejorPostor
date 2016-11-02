package main.util;

import java.time.LocalDate;

public abstract class ComparatorFecha 
{
	public static int compareTo(LocalDate day1, LocalDate day2)
	{
		return day1.compareTo(day2);
	}
}
