package com.tproject.athletespoc.service;

import com.tproject.athletespoc.model.Nationality;
import com.tproject.athletespoc.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NationalityService {

	@Autowired
	private NationalityRepository nationalityRepository;

	public List<Nationality> getNationalitiesMock() {
		return Arrays.asList(new Nationality(1, "Portugal"),
				new Nationality(2, "Australia"),
				new Nationality(3, "Brazil"));
	}

	public Nationality insert(Nationality nationality) {
		return nationalityRepository.save(nationality);
	}
}
