package com.mts.loginAlex.rest;

 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mts.loginAlex.vo.Persona;

@Path("/usuario/")
public class ServicioLogin {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getIt(){
		Persona p = new Persona();
		p.setUsuario("Alex");
		p.setPassword("12345");
		return p;
	}
}
