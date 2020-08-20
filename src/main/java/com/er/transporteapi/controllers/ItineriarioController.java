package com.er.transporteapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.er.transporteapi.model.Itinerario;

@RestController
@RequestMapping("/api/3/action/datastore_search")
public class ItineriarioController {
	
	/*
	 * @Autowired private RestTemplate template;
	 * 
	 * @GetMapping(params = "?resource_id=c8cf58cf-649c-49b1-af78-d0e0beeb6332",
	 * consumes = MediaType.APPLICATION_JSON_VALUE) public
	 * ResponseEntity<Itinerario> buscarItinerarioPorLinha(@PathVariable String
	 * linha) {
	 * 
	 * 
	 * 
	 * }
	 */
}
