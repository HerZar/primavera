package com.eduit.primavera.services;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.eduit.primavera.model.Ticket;

public class GrabadoraTicketJson implements GrabadoraTicket {

	@Override
	public void grabarTicket( Ticket ticket) {

		System.out.println("grabando ticket json");
	}

}
