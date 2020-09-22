package com.eduit.primavera;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import com.eduit.primavera.services.EvaluadorMultas;
import com.eduit.primavera.services.GrabadoraTicketJson;
import com.eduit.primavera.services.SensorInEternum;

@Component
public class Init implements CommandLineRunner{

	private static SensorInEternum factory() {
		SensorInEternum sensor = new SensorInEternum(
				new SensorClima(), 
				new SensorVelocidad(), 
				new EvaluadorMultas(new GrabadoraTicketJson()));
		return sensor;
	}
	@Override
	public void run(String... args) throws Exception {
		factory().sensar();
		
	}

}
