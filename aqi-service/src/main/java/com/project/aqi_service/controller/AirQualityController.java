package com.project.aqi_service.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.aqi_service.service.AirQualityService;


@RestController
public class AirQualityController {
	
	@Autowired
	AirQualityService service;

	@GetMapping("/aqi")
	public ResponseEntity<Map<String, Object>> getAirQuality(@RequestParam String city, @RequestParam String state,
			@RequestParam String country) {

		Map<String, Object> response = service.fetchAirQuality(city, state, country);
		System.out.println(response);
		return (ResponseEntity.ok(response));

	}
	
}
