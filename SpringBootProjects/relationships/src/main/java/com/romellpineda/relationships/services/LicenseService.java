package com.romellpineda.relationships.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romellpineda.relationships.repositories.LicenseRepo;
import com.romellpineda.relationships.repositories.PersonRepo;

@Service
public class LicenseService {
	
	@Autowired
	private PersonRepo pR;
	
	@Autowired
	private LicenseRepo lR;
	
	
}
