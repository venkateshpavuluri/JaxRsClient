package com.jaxrs.client;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jaxrsclient.dto.Account;
import com.jaxrsclient.dto.Application;

public class ContentHandlersTest {
	public static void main(String[] args) {
		//String response=(String)ClientBuilder.newClient().target("http://localhost:8077/JAXRSInjection/api/uber").path("register").request().header("userName", "Venkatesh").cookie("appId", "0023APId").buildPost(null).invoke().readEntity(String.class);
		Application application=new Application();
		application.setAccountantName("Venkatesh");
		application.setAddressLine1("hyd");
		application.setCity("Hyderabad");
		application.setEmail("pavuluri.venki@gmail.com");
		application.setMobileNo("90807656");
		Response response=ClientBuilder.newClient().target("http://localhost:8077/JaxRsContentHandlers/api/netbanking").request().header("userName", "Venkatesh").cookie("appId", "0023APId").accept(MediaType.APPLICATION_XML).buildPost(Entity.entity(application, MediaType.APPLICATION_XML)).invoke();
		response.bufferEntity();
		
		Account 
		account=(Account)response.readEntity(Account.class);
		System.out.println("Account Name iss==="+account.getAccountantName());
	
	}

}
