package com.project.healthservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.healthservice.HealthServiceInterface;
import com.project.healthservice.model.AQIResponse;

@Service
public class AQIService {

	@Autowired
	HealthServiceInterface healthInterface;

	public AQIResponse fetchAQIData(String city, String state, String country) {
		try {
			return healthInterface.getAirQuality(city, state, country);
		} catch (Exception e) {
			throw new RuntimeException("Failed to fetch AQI data from AQI Tracker", e);
		}

	}

}
