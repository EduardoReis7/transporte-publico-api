package com.er.transporteapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.er.transporteapi.model.Example;

@SpringBootTest
class TransportePublicoApiApplicationTests {

	@Test
	void consumerApi() {
		RestTemplate template = new RestTemplate();
		 
		// https://dadosabertos.poa.br/api/3/action/datastore_search
		  
		  UriComponents uri = UriComponentsBuilder.newInstance() 
			  .scheme("https")
			  .host("dadosabertos.poa.br") 
			  .path("api/3/action/datastore_search")
			  .queryParam("resource_id", "c8cf58cf-649c-49b1-af78-d0e0beeb6332")
			  .queryParam("fields", "_id")
			  .queryParam("fields", "linha")
			  .queryParam("fields", "nome")
			  .build();
		  
		  ResponseEntity<Example> itinerario =
		  template.getForEntity(uri.toUriString(), Example.class);
		  
		  System.out.println(uri);
		  
	}

}
