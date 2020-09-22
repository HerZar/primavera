package com.eduit.primavera.model;

import java.util.Date;

import com.bolivarsoft.sensorvelocidad.DatosVehiculo;

public class Ticket {

	private String idTicket;
	private Date fechaHora;
	private DatosVehiculo datosVehiculo;
	private String clima;
	private int velocidadLimite;
	private int velocidadMedida;
	
	public Ticket(String idTicket, Date fechaHora, DatosVehiculo datosVehiculo, String clima, int velocidadLimite,
			int velocidadMedida) {
		super();
		this.idTicket = idTicket;
		this.fechaHora = fechaHora;
		this.datosVehiculo = datosVehiculo;
		this.clima = clima;
		this.velocidadLimite = velocidadLimite;
		this.velocidadMedida = velocidadMedida;
	}

	public String getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public DatosVehiculo getDatosVehiculo() {
		return datosVehiculo;
	}

	public void setDatosVehiculo(DatosVehiculo datosVehiculo) {
		this.datosVehiculo = datosVehiculo;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public int getVelocidadLimite() {
		return velocidadLimite;
	}

	public void setVelocidadLimite(int velocidadLimite) {
		this.velocidadLimite = velocidadLimite;
	}

	public int getVelocidadMedida() {
		return velocidadMedida;
	}

	public void setVelocidadMedida(int velocidadMedida) {
		this.velocidadMedida = velocidadMedida;
	}
		

	
}
