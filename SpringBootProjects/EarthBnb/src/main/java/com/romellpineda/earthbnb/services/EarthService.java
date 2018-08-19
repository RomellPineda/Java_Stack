package com.romellpineda.earthbnb.services;

import org.springframework.stereotype.Service;

import com.romellpineda.earthbnb.repositories.PlaceRepo;
import com.romellpineda.earthbnb.repositories.UserRepo;

@Service
public class EarthService {
	private final PlaceRepo pR;
	private final UserRepo uR;
	public EarthService(PlaceRepo pR, UserRepo uR) {
		super();
		this.pR = pR;
		this.uR = uR;
	}
	
}
