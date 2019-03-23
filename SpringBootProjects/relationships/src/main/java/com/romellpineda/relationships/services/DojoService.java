package com.romellpineda.relationships.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romellpineda.relationships.repositories.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dR;

}
