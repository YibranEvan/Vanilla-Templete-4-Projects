package com.techelevator.services;

import com.techelevator.model.CatFact;
import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCatPicService implements CatPicService {
	public static final String API_BASE_URL = "https://cat-data.netlify.app/api/pictures/random";
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatPic getPic() throws RestClientResponseException {
		CatPic pic = restTemplate.getForObject(API_BASE_URL, CatPic.class);
		return pic;
	}
}
// use getForObject method here
// first param: url
// second param: CatPic.class
// TODO Auto-generated method stub
