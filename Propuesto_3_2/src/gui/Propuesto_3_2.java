package gui;

import java.awt.EventQueue;
import semana_03.Balon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
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
					Propuesto_3_2 frame = new Propuesto_3_2();
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
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
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
		Balon ba1 = new Balon("Mikasa",410,8.5,21.65,187);
		listado(ba1);
		Balon ba2 = new Balon("Nike",200,8.6);
		listado(ba2);
		Balon ba3 = new Balon();
		listado(ba3);
		
	
		imprimir("------------------------------------");
		imprimir("PI                   : " + Balon.PI);
		imprimir("Descuento            :  " + Balon.descuento);
		imprimir("cantidad             :  " + Balon.getCantidad());
		imprimir("suma de importes     :  " + Balon.getImporte());
		imprimir("------------------------------------");
		imprimir();
	}
	

void listado(Balon x) {
	imprimir("Balon             :  " + x);
	imprimir("Marca             :  " + x.getMarca());
	imprimir("Peso en gramos    :  " + x.getPeso());
	imprimir("Presión en libras :  " + x.getPresion());
	imprimir("Diámetro en cm    :  " + x.getDiametro());
	imprimir("Precio            :  " + x.getPrecio());
	imprimir("Radio             :  " + x.radio());
	imprimir("Volumen           :  " + x.volumen());
	imprimir("Descuento         :  " + x.descuento());
	imprimir("Importe a Pagar   :  " + x.importePagar());

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