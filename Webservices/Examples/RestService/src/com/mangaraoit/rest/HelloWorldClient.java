package com.mangaraoit.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HelloWorldClient {
	public static void main(String[] args) {		
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8181/RestService/rest/hello");
		 ClientResponse clientResponse = resource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class);
		//ClientResponse clientResponse = resource.accept(MediaType.TEXT_XML).get(ClientResponse.class);
		//ClientResponse clientResponse = resource.accept(MediaType.TEXT_HTML).get(ClientResponse.class);
		if(clientResponse.getStatus()==200){
			String output = clientResponse.getEntity(String.class);
			System.out.println(output);
		}else{
			System.out.println("something wrong");
		}
	}  
}