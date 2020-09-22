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
		

	
}
