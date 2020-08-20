package com.er.transporteapi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.er.transporteapi.model.Itinerario;

@Service
public class ItinerarioService {
	
	public ResponseEntity<List<Itinerario>> findAll() {
		
		RestTemplate template = new RestTemplate();
		
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("dadosabertos.poa.br")
				.path("api/3/action/datastore_search")
				.queryParam("resource_id", "c8cf58cf-649c-49b1-af78-d0e0beeb6332")
				.queryParam("fields", "_id")
				.queryParam("fields", "linha")
				.queryParam("fields", "nome")
				.build();
		
		return template.getForEntity(uri.toUriString(), Itinerario.class);
	}
}
