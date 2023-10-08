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
import semana_03.Asesor;

public class Propuesto_3_1 extends JFrame implements ActionListener {
	
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
					Propuesto_3_1 frame = new Propuesto_3_1();
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
	public Propuesto_3_1() {
		setTitle("Propuesto_3_1");
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
		Asesor as1 = new Asesor ("Luis",745687,2215,150);
		listado(as1);
		Asesor as2 = new Asesor ("Rosa",745852);
		listado(as2);
		Asesor as3 = new Asesor();
		listado(as3);
		
		imprimir("------------------------------------");
		imprimir("Cantidad                 :  " + Asesor.getCantidad());
		imprimir("Remuneración en dólares  :  " + Asesor.getSumaRemuneracion());
		imprimir("Nombre de la Institución :  " + Asesor.NOMINSTITUCION);
		imprimir("------------------------------------");
		imprimir();
	}
		
		void listado (Asesor x) {
			imprimir("Asesor                   :  " + x);
			imprimir("Nombre del Asesor        :  " + x.getNombre());
			imprimir("DNI                      :  " + x.getDni());
			imprimir("Código                   :  " + x.getCodigo());
			imprimir("Remuneración en dólares  :  " + x.getRemuneracion());
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
