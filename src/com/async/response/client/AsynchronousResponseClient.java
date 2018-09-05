package com.async.response.client;

import java.util.concurrent.Future;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.Response;

public class AsynchronousResponseClient {
public static void main(String[] args) {
	
	Future<Response> response=ClientBuilder.newClient().target("http://localhost:8077/AsyncrounousServer/asynch/tax/async/90989").request().async().get(new InvocationCallback<Response>() {

		@Override
		public void completed(Response response) {
			System.out.println("Asynchronous client is completed Response code iss=="+response.getStatus());
			
		}

		@Override
		public void failed(Throwable throwable) {
			// TODO Auto-generated method stub
			System.out.println("Asynchronous client is failed"+throwable.getMessage());
			
		}
	});
	
	
	System.out.println("Independent of Asyncronoustyu call1");
	System.out.println("Independent of Asyncronous releases call2");
	System.out.println("Independent of Asyncronous call3");
	System.out.println("Independent of Asyncronous call4");
	System.out.println("Independent of Asyncronous call5");
	System.out.println("Independent of Asyncronous call6");
	System.out.println("Independent of Asyncronous call7");
}
}
