package com.tproject.athletespoc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tproject.athletespoc.model.Nationality;
import com.tproject.athletespoc.repository.NationalityRepository;

@Service
public class NationalityService {

	@Autowired
	private NationalityRepository nationalityRepository;

	@Transactional
	public List<Nationality> findAll() {
		List <Nationality> list = new ArrayList<>();
		list = (List<Nationality>) nationalityRepository.findAll();
		return list;
	}
	
	@Transactional
	public Nationality findById(Integer id) {
		 Optional<Nationality>opt = nationalityRepository.findById(id);
		 Nationality entity = opt.get();
		 return entity;
	}

	@Transactional
	public Nationality insert(Nationality nationality) {
		return nationalityRepository.save(nationality);
	}
	
	@Transactional
	public Nationality update(Integer id, Nationality nationalityRequest) {
		Nationality entity = nationalityRepository.getOne(id);
		entity.setCountry(nationalityRequest.getCountry());
		entity=nationalityRepository.save(entity);
		return entity;
		
	}
	
	@Transactional
	public void delete(Integer id) {
		nationalityRepository.deleteById(id);
	}
	
}
