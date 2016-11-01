package main.view;

import java.util.Properties;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import main.util.DateLabelFormatter;

public class CalendarioForm 
{
	public static JDatePickerImpl getPickerToday()
	{
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		return datePicker;
	}
}
