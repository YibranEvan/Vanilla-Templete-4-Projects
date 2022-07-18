package com.techelevator.services;

import org.springframework.stereotype.Component;

import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;



import com.techelevator.model.CatFact;

@Component
public class RestCatFactService implements CatFactService {
	public static final String API_BASE_URL = "https://cat-data.netlify.app/api/facts/random";
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatFact getFact() throws RestClientResponseException {
		CatFact fact = restTemplate.getForObject(API_BASE_URL, CatFact.class);
		return fact;
	}

}
	// use getForObject method here
		// first param: url
		// second param: CatFact.class
		// TODO Auto-generated method stub


