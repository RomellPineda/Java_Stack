package com.romellpineda.relationships.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romellpineda.relationships.models.License;
import com.romellpineda.relationships.models.Person;
import com.romellpineda.relationships.repositories.LicenseRepo;
import com.romellpineda.relationships.repositories.PersonRepo;

@Service
public class LicenseService {
	
	@Autowired
	private PersonRepo pR;
	
	@Autowired
	private LicenseRepo lR;
	
	// create person
	public Person create(Person p) {
        return pR.save(p);
    }
	
	public License createL(License l) {
		return lR.save(l);
	}
}
