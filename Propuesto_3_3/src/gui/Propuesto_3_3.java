package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import semana_03.Consultor;
public class Propuesto_3_3 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_3_3 frame = new Propuesto_3_3();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_3() {
		setTitle("Propuesto_3_3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		
		Consultor con1 = new Consultor(5967,"Emilio",68,15.5);
		listado(con1);
		Consultor con2 = new Consultor(8574,"Diego",88);
		listado(con2);
		Consultor con3 = new Consultor();
		listado(con3);
		
		imprimir("------------------------------------");
		imprimir("AFP                   :  " + Consultor.AFP);
		imprimir("EPS                   :  " + Consultor.EPS);
		imprimir("Cantidad de empleados :  " + Consultor.getCantidad());
		imprimir("Suma de sueldos netos :  " + Consultor.getSueldoNeto());
		imprimir("------------------------------------");
		imprimir();
	
		

	}
	void listado(Consultor x) {
		
		imprimir("Consultor        :  " + x);
		imprimir("Código           :  " + x.getCodigo());
		imprimir("Nombre           :  " + x.getNombre());
		imprimir("Horas Trabajadas :  " + x.getHorastrabajadas());
		imprimir("Tarifa Horaria   :  " + x.getTarifaHora());
		imprimir("Sueldo Bruto     :  " + x.sueldoBruto());
		imprimir("Descuento AFP    :  " + x.descuentoAfp());
		imprimir("Descuento EPS    :  " + x.descuentoEps());
		imprimir("Sueldo Neto      :  " + x.sueldoNeto());
		imprimir();
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}