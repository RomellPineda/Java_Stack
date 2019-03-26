package com.romellpineda.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romellpineda.relationships.models.Dojo;
import com.romellpineda.relationships.models.Ninja;
import com.romellpineda.relationships.repositories.DojoRepo;
import com.romellpineda.relationships.repositories.NinjaRepo;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dR;
	
	@Autowired
	private NinjaRepo nR;
	
	public Dojo createDojo(Dojo dojo) {
		return dR.save(dojo);
	}
	
	public List<Dojo> findAllDojos() {
		return dR.findAll();
	}
	
	public Dojo findDojo(Long dojoId) {
		Optional<Dojo> possible = dR.findById(dojoId);
		if (possible.isPresent()) {
			return possible.get();
		} else {
			return null;
		}
	}
	
	public Ninja createNinja(Ninja ninja) {
		return nR.save(ninja);
	}

}
