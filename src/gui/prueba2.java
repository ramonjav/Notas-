package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JMenu;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class prueba2 extends JFrame {
	
	DefaultTableModel modelo;
	
	DefaultComboBoxModel<String> model;
	
	Object vector [] = new Object[3];
	
	private JTextField textField;
	private JTable table_1;
	
	Calendar fecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba2 frame = new prueba2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prueba2() {
		setForeground(Color.BLACK);
		setTitle("Ventana de prueba");
		setFont(new Font("Carlito", Font.ITALIC, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 469);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(59, 71, 232, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		/////////////comboBox/////////////
		
		JComboBox<String> cmb = new JComboBox<>();
		cmb.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Importante", "Urgente"}));
		cmb.setBounds(59, 99, 222, 20);
		getContentPane().add(cmb);
		
		
		//////////////Boton Aceptar////////////////////
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fecha = new GregorianCalendar();
				
				SimpleDateFormat sdf = new SimpleDateFormat ("dd'/'MM'/'Y");
				
				modelo = (DefaultTableModel) table_1.getModel();
				model= (DefaultComboBoxModel) cmb.getModel();
				
				String valor = textField.getText();
				
				vector[0] = sdf.format(fecha.getTime());
				vector[1] = valor;
				vector[2] = model.getElementAt(model.getIndexOf(model.getSelectedItem()));
				
				modelo.addRow(vector);
				
			}
		});
		
		
		////////////////Tabla///////////////////
		
		btnAceptar.setBounds(352, 70, 89, 23);
		getContentPane().add(btnAceptar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 130, 452, 182);
		getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		table_1.setShowHorizontalLines(false);
		table_1.setShowVerticalLines(false);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fecha", "Nombre", "Importancia"
			}
		));
		scrollPane.setViewportView(table_1);
		
		
		
	}
}
