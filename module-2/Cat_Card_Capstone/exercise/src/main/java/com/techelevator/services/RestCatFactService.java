package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatFact;

@Component
public class RestCatFactService implements CatFactService {


	@Override
	public CatFact getFact() {
		// use getForObject method here
		// first param: url
		// second param: CatFact.class
		// TODO Auto-generated method stub
		return null;
	}

}
