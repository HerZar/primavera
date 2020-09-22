package com.eduit.primavera.services;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;

public class SensorInEternum {

	private SensorClima sClima;
	private SensorVelocidad sVehiculos;
	private EvaluadorMultas eMultas;
	
	
	
	public SensorInEternum(SensorClima sClima, SensorVelocidad sVehiculos, EvaluadorMultas eMultas) {
		super();
		this.sClima = sClima;
		this.sVehiculos = sVehiculos;
		this.eMultas = eMultas;
	}

	public void sensar() {
		
		TipoClima tc = sClima.sensar();
		
		System.out.println(tc.toString());
		for (;;) {
			DatosVehiculo dv = sVehiculos.sensarVehiculo();
			System.out.println(dv.toString());
			this.eMultas.evaluar(dv, tc);
			
		}
		
		
	}
	
}
