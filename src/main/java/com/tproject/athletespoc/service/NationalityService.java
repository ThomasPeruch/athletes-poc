package com.tproject.athletespoc.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tproject.athletespoc.model.Nationality;
import com.tproject.athletespoc.repository.NationalityRepository;

@Service
public class NationalityService {

	@Autowired
	private NationalityRepository nationalityRepository;

	public List<Nationality> findAll() {
		List <Nationality> list = new ArrayList<>();
		list = (List<Nationality>) nationalityRepository.findAll();
		return list;
	}

	@Transactional
	public Nationality insert(Nationality nationality) {
		return nationalityRepository.save(nationality);
	}
	
	@Transactional
	public void delete(Integer id) {
		nationalityRepository.deleteById(id);
	}
}
