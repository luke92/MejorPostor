package main.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import main.controller.Application;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CargarOfertasForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreBanda;
	private JTextField txtTelefono;
	private JDatePickerImpl datePicker;
	private JTextArea txtFacilidades;
	private JSpinner spnPrecio;
	private JSpinner spnDesde;
	private JSpinner spnHasta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CargarOfertasForm dialog = new CargarOfertasForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CargarOfertasForm() {
		setTitle("Cargar Oferta");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombreBanda = new JLabel("Banda");
		lblNombreBanda.setBounds(10, 11, 46, 14);
		contentPanel.add(lblNombreBanda);
		
		txtNombreBanda = new JTextField();
		txtNombreBanda.setBounds(66, 8, 145, 20);
		contentPanel.add(txtNombreBanda);
		txtNombreBanda.setColumns(10);
		
		JLabel lblTelefno = new JLabel("Telef\u00F3no");
		lblTelefno.setBounds(221, 11, 72, 14);
		contentPanel.add(lblTelefno);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(316, 8, 108, 20);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 36, 46, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblFacilidadesSolicitadas = new JLabel("Facilidades Solicitadas");
		lblFacilidadesSolicitadas.setBounds(10, 61, 132, 14);
		contentPanel.add(lblFacilidadesSolicitadas);
		
		txtFacilidades = new JTextArea();
		txtFacilidades.setBounds(10, 84, 200, 73);
		txtFacilidades.setLineWrap(true);
		contentPanel.add(txtFacilidades);
		
		JLabel lblDesde = new JLabel("Desde");
		lblDesde.setBounds(221, 36, 46, 14);
		contentPanel.add(lblDesde);
		
		JSpinner spnDesde = new JSpinner();
		spnDesde.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spnDesde.setBounds(277, 33, 42, 20);
		contentPanel.add(spnDesde);
		
		JLabel lblHasta = new JLabel("Hasta");
		lblHasta.setBounds(339, 36, 46, 14);
		contentPanel.add(lblHasta);
		
		JSpinner spnHasta = new JSpinner();
		spnHasta.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spnHasta.setBounds(382, 33, 42, 20);
		contentPanel.add(spnHasta);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(220, 61, 46, 14);
		contentPanel.add(lblFecha);
		
		JPanel pnlDatePicker = new JPanel();
		pnlDatePicker.setBounds(220, 84, 204, 73);
		contentPanel.add(pnlDatePicker);
		
		datePicker = CalendarioForm.getPickerToday();
		pnlDatePicker.add(CalendarioForm.getPickerToday());
		
		JSpinner spnPrecio = new JSpinner();
		spnPrecio.setModel(new SpinnerNumberModel(new Integer(100), new Integer(100), null, new Integer(100)));
		spnPrecio.setBounds(66, 33, 139, 20);
		contentPanel.add(spnPrecio);
		
		JButton btnAgregarOferta = new JButton("Agregar Oferta");
		btnAgregarOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				agregarOferta();
			}
		});
		btnAgregarOferta.setBounds(10, 168, 414, 44);
		ImageIcon icon = new ImageIcon("img/add.png");
		btnAgregarOferta.setIcon(icon);
		contentPanel.add(btnAgregarOferta);
	}
	
	private void agregarOferta()
	{
		txtNombreBanda.setText(txtNombreBanda.getText().trim());
		txtTelefono.setText(txtTelefono.getText().trim());
		if(!camposValidos()) 
			JOptionPane.showMessageDialog(null, "Algunos campos son Invalidos");
		else
		{
			Application.agregarOferta();
			reiniciarCampos();
		}
	}
	
	private boolean camposValidos()
	{
		if(txtNombreBanda.getText() == "") return false;
		if(txtTelefono.getText() == "") return false;
		if(!Pattern.matches("[0-9]\\d*", txtTelefono.getText())) return false;
		return true;
	}
	
	private void reiniciarCampos()
	{
		txtNombreBanda.setText("");
		txtTelefono.setText("");
		txtFacilidades.setText("");
	}
	
}