package org.vagus.art.simple_java_rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Cheese {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCheese() {
		return "wow, much cheese";
	}

}
