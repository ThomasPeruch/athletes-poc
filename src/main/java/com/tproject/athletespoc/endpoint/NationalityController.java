package com.tproject.athletespoc.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tproject.athletespoc.model.Nationality;
import com.tproject.athletespoc.service.NationalityService;

@RestController
@RequestMapping("/nationality")
public class NationalityController {

	@Autowired
	private NationalityService nationalityService;

	@GetMapping
	public List<Nationality> getNationalities() {
		return nationalityService.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Nationality getNationalityById(@PathVariable Integer id) {
		return nationalityService.findById(id);
	}

	@PostMapping
	public Nationality insert(@RequestBody Nationality nationality){
		return nationalityService.insert(nationality);
	}
	
	@PutMapping(value="/{id}")
	public Nationality update (@PathVariable Integer id, @RequestBody Nationality nationalityRequest) {
		return nationalityService.update(id, nationalityRequest);
	}

	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable Integer id) {
		nationalityService.delete(id);
	}
}
