package com.er.transporteapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.er.transporteapi.model.Example;
import com.er.transporteapi.service.ItinerarioService;

@RestController
@RequestMapping("/itinerario")
public class ItineriarioController {
	
	@Autowired
	private ItinerarioService itinerarioService;
	
	@GetMapping
	public ResponseEntity<Example> buscarTudo() {
		return itinerarioService.findAll(); 
	}
	
}
