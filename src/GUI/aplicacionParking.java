package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class aplicacionParking {

	public JFrame frame;
	private JTextField txtHoraEntrada;
	private JTextField txtMatricula;
	private JTextField txtHoraSalida;
	private JTextField txtImporteEntregado;
	private JLabel lblCambioCalculado;
	private JLabel lblMatricula;
	private JLabel lblHoraEntrada;
	private JLabel lblHoraSalida;
	private JLabel lblImporteEntregado;
	private JLabel lblTotalApagar;
	private JLabel lblTotal;
	private JButton btnRegistrar;
	private JLabel lblCambio;
	private JButton btnPagarSalir;
	private JLabel lblCaja;
	private JLabel lblCajaCalculada;
	private long horaEntrada;
	private long horaSalida;
	private float importe;
	private float tarifa;
	private float devolucion;
	private JLabel lblMinTrans;
	private JLabel lblMinutos;
	private int minuto1;
	private int minuto2;
	private int intervalo;
	private boolean controlContador = false;
	

	/**
	 * Create the application.
	 */
	public aplicacionParking() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 732, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnEntrada = new JButton("ENTRADA VEHÍCULO");

		/**
		 * LOGICA DETRAS EL BOTON ENTRADA VEHICULO
		 */
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblCaja.setVisible(false);
				lblHoraEntrada.setVisible(true);
				txtHoraEntrada.setVisible(true);
				txtHoraEntrada.setEnabled(false);
				lblHoraSalida.setVisible(false);
				txtHoraSalida.setVisible(false);
				lblTotalApagar.setVisible(false);
				lblTotal.setVisible(false);
				lblImporteEntregado.setVisible(false);
				txtImporteEntregado.setVisible(false);
				lblCambio.setVisible(false);
				lblCambioCalculado.setVisible(false);
				btnPagarSalir.setVisible(false);
				btnRegistrar.setVisible(false);
				lblMinTrans.setVisible(false);

				/**
				 * INTRODUCIMOS LA HORA DE ENTRADA
				 */
				Date fex = new Date();

				horaEntrada = fex.getTime();

				txtHoraEntrada.setText("" + horaEntrada);
				
				/**
				 * Para captar el minuto de entrada del sistema
				 */
				Calendar calendario = new GregorianCalendar();
				
				
				minuto1 = calendario.get(Calendar.MINUTE);
				/*
				 * 
				 * controlContador = true;
				lblMinutos.setVisible(true);
				
				contador = new Thread(new Runnable() {
					// RUN
					@Override
					public void run() {

						// AJUSTAR TARIFA
						 tarifa = 0;

					

						int segundos = Integer.parseInt(lblSegundos.getText());
						double dinero = Double.parseDouble(lblImporte.getText());

					
						

						while (controlContador) {
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
							}
							segundos++;
							lbcontador.setText("" + segundos);
							if (segundos >= 60) {
								dinero = dinero + tarifa;
								segundos = 0;

								lbDinero.setText("" + dinero);
							}
						}
				 * 
				 * 
				 * 
				 * 
				 */

			}
		});
		btnEntrada.setBounds(51, 11, 165, 117);
		frame.getContentPane().add(btnEntrada);

		JButton btnSalida = new JButton("PAGO Y SALIDA VEHÍCULO");
		/**
		 * Logica detras el boton PAGO Y SALIDA
		 * 
		 */
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				/**
				 * configuramos visibilidad de estos botones
				 */

				lblCaja.setVisible(false);
				txtMatricula.setEnabled(true);
				lblHoraEntrada.setEnabled(false);
				lblCambioCalculado.setVisible(true);
				lblHoraSalida.setVisible(true);
				txtHoraSalida.setVisible(true);
				txtHoraSalida.setEnabled(false);
				
				lblTotalApagar.setVisible(true);
				lblTotal.setVisible(true);
				lblImporteEntregado.setVisible(true);
				txtImporteEntregado.setVisible(true);
				lblCambio.setVisible(true);
				lblCambioCalculado.setVisible(true);
				btnPagarSalir.setVisible(true);
				btnRegistrar.setVisible(true);
				lblMinTrans.setVisible(true);
				
				/**
				 * LOGICA DEL BOTON SALIDA DEL VEHICULO
				 */
				
				Date fex2 = new Date();

				horaSalida = fex2.getTime();

				txtHoraSalida.setText("" + horaSalida);
				
				/**
				 * CAPTURAMOS EL IMPORTE ENTREGADO DEL CLIENTE
				 */
				
				 //importe = Float.parseFloat(txtImporteEntregado.getText());
				 
					
					tarifa = 0;
					float devolucion = 0;
					
					
					/*if(txtImporteEntregado.getText() == null || Float.parseFloat(txtImporteEntregado.getText())== 0){
						JOptionPane.showMessageDialog(null,  "ERROR EN EL IMPORTE DEL CLIENTE","ERROR",JOptionPane.ERROR_MESSAGE);
					}*/
					
					Calendar calendario2 = new GregorianCalendar();
					
					
					minuto2 = calendario2.get(Calendar.MINUTE);
					
					
					
					
			}
		});
		btnSalida.setBounds(271, 11, 165, 117);
		frame.getContentPane().add(btnSalida);

		JButton btnCaja = new JButton("CAJA DEL DÍA");
		btnCaja.setBounds(508, 11, 165, 117);
		frame.getContentPane().add(btnCaja);

		txtHoraEntrada = new JTextField();
		txtHoraEntrada.setBounds(144, 190, 229, 40);
		frame.getContentPane().add(txtHoraEntrada);
		txtHoraEntrada.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(144, 139, 229, 40);
		frame.getContentPane().add(txtMatricula);

		txtHoraSalida = new JTextField();
		txtHoraSalida.setColumns(10);
		txtHoraSalida.setBounds(144, 241, 229, 40);
		frame.getContentPane().add(txtHoraSalida);

		txtImporteEntregado = new JTextField();
		txtImporteEntregado.setColumns(10);
		txtImporteEntregado.setBounds(575, 283, 131, 40);
		frame.getContentPane().add(txtImporteEntregado);

		btnPagarSalir = new JButton("Pagar y salir del Parking");
		btnPagarSalir.setBounds(208, 412, 235, 78);
		frame.getContentPane().add(btnPagarSalir);

		lblCambio = new JLabel("Cambio");
		lblCambio.setBounds(528, 367, 46, 14);
		frame.getContentPane().add(lblCambio);

		lblCambioCalculado = new JLabel("");
		lblCambioCalculado.setBounds(528, 413, 131, 40);
		frame.getContentPane().add(lblCambioCalculado);

		lblMatricula = new JLabel("Matrícula");
		lblMatricula.setBounds(10, 139, 100, 40);
		frame.getContentPane().add(lblMatricula);

		lblHoraEntrada = new JLabel("HoraEntrada");
		lblHoraEntrada.setBounds(10, 190, 100, 40);
		frame.getContentPane().add(lblHoraEntrada);

		lblHoraSalida = new JLabel("Hora Salida");
		lblHoraSalida.setBounds(10, 241, 100, 40);
		frame.getContentPane().add(lblHoraSalida);

		lblImporteEntregado = new JLabel("Importe Entregado");
		lblImporteEntregado.setBounds(414, 283, 120, 40);
		frame.getContentPane().add(lblImporteEntregado);

		lblTotalApagar = new JLabel("Total a pagar");
		lblTotalApagar.setBounds(429, 155, 91, 40);
		frame.getContentPane().add(lblTotalApagar);

		lblTotal = new JLabel("");
		lblTotal.setBounds(414, 219, 120, 34);
		frame.getContentPane().add(lblTotal);

		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(258, 335, 235, 46);
		frame.getContentPane().add(btnRegistrar);

		lblCaja = new JLabel("Caja del día");
		lblCaja.setBounds(599, 139, 74, 27);
		frame.getContentPane().add(lblCaja);

		lblCajaCalculada = new JLabel("");
		lblCajaCalculada.setBounds(575, 213, 98, 40);
		frame.getContentPane().add(lblCajaCalculada);
		
		lblMinTrans = new JLabel("Minutos transcurridos");
		lblMinTrans.setBounds(10, 323, 121, 14);
		frame.getContentPane().add(lblMinTrans);
		
		lblMinutos = new JLabel("");
		lblMinutos.setBounds(154, 310, 62, 27);
		frame.getContentPane().add(lblMinutos);

		/**
		 * Ocultamos los elementos al arracar la app
		 */
		lblCaja.setVisible(false);
		lblHoraEntrada.setVisible(false);
		txtHoraEntrada.setVisible(false);
		lblHoraSalida.setVisible(false);
		txtHoraSalida.setVisible(false);
		lblTotalApagar.setVisible(false);
		lblTotal.setVisible(false);
		lblImporteEntregado.setVisible(false);
		txtImporteEntregado.setVisible(false);
		lblCambio.setVisible(false);
		lblCambioCalculado.setVisible(false);
		btnPagarSalir.setVisible(false);
		lblMinTrans.setVisible(false);

	}
}
