package com.eduit.primavera.services;

import java.util.Date;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.eduit.primavera.model.Ticket;

public class GrabadoraTicketMysql implements GrabadoraTicket{

	@Override
	public void grabarTicket( Ticket ticket) {
		System.out.println("grabando ticket mysql");
	}

}
