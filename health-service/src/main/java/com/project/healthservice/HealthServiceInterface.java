package com.project.healthservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.healthservice.model.AQIResponse;

@FeignClient("AQI-SERVICE")
public interface HealthServiceInterface {

	@GetMapping("/aqi")
	public AQIResponse getAirQuality(@RequestParam String city, @RequestParam String state,
			@RequestParam String country);

}
