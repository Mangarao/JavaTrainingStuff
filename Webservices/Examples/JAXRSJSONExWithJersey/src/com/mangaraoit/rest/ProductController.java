package com.mangaraoit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.mangaraoit.bean.Product;

@Path("/product")
public class ProductController {
	@GET
	@Produces("application/json" )
	public Response getProdDetails(){
		Product product = new Product(101, "iphone6s", 70000);
	  return	Response.status(200).entity(product).build();
	}
}
