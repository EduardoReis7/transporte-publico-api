package com.er.transporteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.er.transporteapi.model.Itinerario;

@SpringBootApplication
public class TransportePublicoApiApplication {
	
	@Bean
	public Itinerario consumerApi() {
		
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
		
		System.out.println(uri);
		
		return template.getForObject(uri.toUriString(), Itinerario.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TransportePublicoApiApplication.class, args);
	}

}
