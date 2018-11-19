package com.mangaraoit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response sayPlainHello() {
		return Response.status(200).entity("Hello Jersey Plain").build();
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public Response sayXMLHello() {
		String output = "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response sayHTMLHello() {
		String output= "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>"
				+ "</html> ";
		return Response.status(200).entity(output).build();
	}

}
