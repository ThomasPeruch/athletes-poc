package com.tproject.athletespoc.service;

import com.tproject.athletespoc.model.Nationality;
import com.tproject.athletespoc.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class NationalityService {

	@Autowired
	private NationalityRepository nationalityRepository;

	public List<Nationality> getNationalities() {
		List <Nationality> list = new ArrayList<>();
		list = (List<Nationality>) nationalityRepository.findAll();
		return list;
	}

	public Nationality insert(Nationality nationality) {
		return nationalityRepository.save(nationality);
	}
}
