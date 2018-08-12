package com.jaxrs.client;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class NetBankingTest {
	private static final String Base_Uri="http://localhost:8077/RestBootstrap/api/banking/{accNo}";
	public static void main(String[] args) {
		/*ClientBuilder builder=ClientBuilder.newBuilder();
		builder.property("connection.timeout", "6000");
		Client client=builder.build();
		WebTarget target=client.target("http://localhost:8077/RestBootstrap/api/banking/balance?accno=9098");
	Invocation.Builder invocationbuildr=	target.request();
	Invocation invocation= invocationbuildr.buildGet();
	Response response=invocation.invoke();
	if(response.getStatus()==200)
	{
	System.out.println("Status iss==="+response.readEntity(String.class));	
	}*/
	//String response=(String)ClientBuilder.newClient().target("http://localhost:8077/RestBootstrap/api/banking/balance?accno=9098").request().buildGet().invoke().readEntity(String.class);
	System.out.println(getAccountDetails("90808"));

	}
	
	public static String  getAccountDetails(String accno)
	{
		String entity=(String)ClientBuilder.newClient().target(Base_Uri).resolveTemplate("accNo", "9098").path("balance").request().buildGet().invoke().readEntity(String.class);
		System.out.println(entity);
	return entity;
		
	}
}
