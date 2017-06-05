package models;

import java.util.Date;

public class Vehiculo {
	
	private int matricula;
	protected Date horaEntrada;
	protected Date horaSalida;
	protected String pago;
	public Vehiculo(int matricula, Date horaEntrada, Date horaSalida, String pago) {
		super();
		this.matricula = matricula;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.pago = pago;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public String getPago() {
		return pago;
	}
	public void setPago(String pago) {
		this.pago = pago;
	}
	
	

}
