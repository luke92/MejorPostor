package main.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import main.service.OfertaService;

import javax.swing.JTable;

public class VerOfertasForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VerOfertasForm dialog = new VerOfertasForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VerOfertasForm() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		table = new JTable();
		table.setBounds(365, 37, -320, 134);
		contentPanel.add(table);
		
		Object columnNames[] = { "Fecha", "Horario", "Precio", "Banda", "Facilidades" };
		Object rowData[][] ={ { "Row1-Column1", "Row1-Column2", "Row1-Column3","Row1-Column4","Row1-Column5" },
		  { "Row2-Column1", "Row2-Column2", "Row2-Column3","Row2-Column4","Row2-Column5" } };
		    table = new JTable(rowData, columnNames);

		    JScrollPane scrollPane = new JScrollPane(table);
		    this.add(scrollPane, BorderLayout.CENTER);
	}
}
