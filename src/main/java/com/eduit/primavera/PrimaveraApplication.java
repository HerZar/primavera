package com.eduit.primavera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import com.eduit.primavera.services.EvaluadorMultas;
import com.eduit.primavera.services.GrabadoraTicketJson;
import com.eduit.primavera.services.SensorInEternum;

@SpringBootApplication
public class PrimaveraApplication {


	
	public static void main(String[] args) {
		//SpringApplication.run(PrimaveraApplication.class, args);
		SensorInEternum sensor = new SensorInEternum(
				new SensorClima(), 
				new SensorVelocidad(), 
				new EvaluadorMultas(new GrabadoraTicketJson()));
		sensor.sensar();
	}

}
