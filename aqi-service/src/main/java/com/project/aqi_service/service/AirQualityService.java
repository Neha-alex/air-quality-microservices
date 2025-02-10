package com.project.aqi_service.service;

import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AirQualityService {
	
	private static final String API_KEY = "##############################";
	private static final String API_URL = "http://api.airvisual.com/v2/city?city=%s&state=%s&country=%s&key=" + API_KEY;

	private final RestTemplate restTemplate = new RestTemplate();
	
//	@Cacheable(value="airQuality, key = #city + '-'+ #state + '-' + #country")
	public Map<String,Object> fetchAirQuality(String city, String state, String country){
		
		String url = String.format(API_URL, city,state,country);
		System.out.println("fetching data from api");
		return restTemplate.getForObject(url, Map.class);		
	}
}
