package com.eduit.primavera.services;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.eduit.primavera.model.Ticket;
import com.google.gson.Gson;

public class GrabadoraTicketJson implements GrabadoraTicket {

	@Override
	public void grabarTicket(Ticket ticket) {
		try {
            String nomArch = String.format("Ticket%s.json", ticket.getIdTicket());
            String filePath= "/home/hernan/Documentos/cursos/spring2/primavera/tickets/";
            File arch = new File(filePath+nomArch);
			System.out.println("grabando ticket json");
			Gson gson = new Gson();
			String jsonTicket = gson.toJson(ticket);
			FileUtils.write(arch, jsonTicket, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
