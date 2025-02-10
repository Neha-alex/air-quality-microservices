package com.project.healthservice.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.healthservice.model.AQIResponse;
import com.project.healthservice.service.AQIService;

@RestController
public class HealthServiceController {

	@Autowired
	AQIService aqiService;

	@GetMapping("/advisory")
	public ResponseEntity<Map<String, Object>> getHealthAdvisory(@RequestParam String city, @RequestParam String state,
			@RequestParam String country) {

		AQIResponse aqiResponse = aqiService.fetchAQIData(city, state, country);
		System.out.println(aqiResponse);
		String advisory = generateAdvisory(aqiResponse.getData().getCurrent().getPollution().getAqius());
		Map<String, Object> response = new HashMap<>();
		response.put("city", city);
		response.put("state", state);
		response.put("country", country);
		response.put("advisory", advisory);
		return ResponseEntity.ok(response);
	}

	private String generateAdvisory(int aqi) {
		if (aqi <= 50)
			return "Air quality is good. Enjoy outdoor activities.";
		if (aqi <= 100)
			return "Air quality is acceptable, but sensitive individuals should take precautions.";
		if (aqi <= 150)
			return "Unhealthy for sensitive groups. Avoid prolonged outdoor exposure.";
		if (aqi <= 200)
			return "Unhealthy. Everyone should limit outdoor activities.";
		if (aqi <= 300)
			return "Very unhealthy. Avoid going outside.";
		return "Hazardous! Stay indoors and use air purifiers.";
	}

}
