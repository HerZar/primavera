package com.eduit.primavera.services;

import java.util.Date;
import java.util.UUID;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.TipoVehiculo;
import com.eduit.primavera.model.Ticket;

public class EvaluadorMultas {

	private GrabadoraTicket grabadoraTicket;

	public EvaluadorMultas(GrabadoraTicket grabadoraTicket) {
		super();
		this.grabadoraTicket = grabadoraTicket;
	}

	public void evaluar(DatosVehiculo dv, TipoClima tc) {
        int liminteVelocidad= 1000;
		switch (tc) {
		case NORMAL:
			switch (dv.tipoVehiculo) {
			case Auto:
				if (dv.velocidadMedida <= 130)
					return;
				else liminteVelocidad = 130;
				break;
			case Moto:
				if (dv.velocidadMedida <= 130)
					return;
				else liminteVelocidad = 130;
				break;
			case Camion:
				if (dv.velocidadMedida <= 90)
					return;
				else liminteVelocidad = 90;
				break;
			case Tractor:
				if (dv.velocidadMedida <= 60)
					return;
				else liminteVelocidad = 60;
				break;
			default:
				return;
			}

			break;

		case LLUVIAS_MODERADAS:
			switch (dv.tipoVehiculo) {
			case Auto:
				if (dv.velocidadMedida <= 110)
					return;
				else liminteVelocidad = 110;
				break;
			case Moto:
				if (dv.velocidadMedida <= 110)
					return;
				else liminteVelocidad = 110;
				break;
			case Camion:
				if (dv.velocidadMedida <= 80)
					return;
				else liminteVelocidad = 80;
				break;
			case Tractor:
				if (dv.velocidadMedida <= 60)
					return;
				else liminteVelocidad = 60;
				break;
			default:
				return;
			}

			break;

		case LLUVIAS_TORRENCIALES:
			switch (dv.tipoVehiculo) {
			case Auto:
				if (dv.velocidadMedida <= 90)
					return;
				else liminteVelocidad = 90;
				break;
			case Moto:
				if (dv.velocidadMedida <= 90)
					return;
				else liminteVelocidad = 90;
				break;
			case Camion:
				if (dv.velocidadMedida <= 70)
					return;
				else liminteVelocidad = 70;
				break;
			case Tractor:
				if (dv.velocidadMedida <= 60)
					return;
				else liminteVelocidad = 60;
				break;
			default:
				return;
			}

			break;

		default:
			return;
		}
		
		Ticket t = new Ticket(
				UUID.randomUUID().toString(), 
				new Date(), 
				dv, 
				tc.name(), 
			    liminteVelocidad, 
				dv.velocidadMedida);

		this.grabadoraTicket.grabarTicket(t);
		
	}

}
