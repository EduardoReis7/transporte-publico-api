package com.er.transporteapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.er.transporteapi.model.Example;

@Service
public class ItinerarioService {
	
	private final UriComponents URI = UriComponentsBuilder.newInstance() .scheme("https")
			.host("dadosabertos.poa.br") .path("api/3/action/datastore_search")
			.queryParam("resource_id", "c8cf58cf-649c-49b1-af78-d0e0beeb6332")
			.queryParam("fields", "_id") .queryParam("fields", "linha")
			.queryParam("fields", "nome") .build();
	
	@Autowired
	private RestTemplate restTemplate;
	
	public ResponseEntity<Example> findAll() {

		return restTemplate.getForEntity(URI.toUriString(), Example.class); 
	
	}
 
}
