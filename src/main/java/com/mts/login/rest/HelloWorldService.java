package com.mts.login.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/nelo")
	public Response getMsg() {
		String output = "Jersey say :nelo /n";
		output = output + " Jersey say :nelo /n";
		return Response.status(200).entity(output).build();

	}
	
	

	@GET
	@Path("/example")
	public Response example() {
		String output = "test";
		return Response.status(200).entity(output).build();

	}
	
	
	
}