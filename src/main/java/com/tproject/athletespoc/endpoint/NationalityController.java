package com.tproject.athletespoc.endpoint;

import com.tproject.athletespoc.model.Nationality;
import com.tproject.athletespoc.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NationalityController {

	@Autowired
	private NationalityService nationalityService;

	@GetMapping("/nationality")
	public List<Nationality> getNationalities() {
		return nationalityService.getNationalitiesMock();
	}

	@PostMapping("/nationality")
	public Nationality insertNationality(@RequestBody Nationality nationality){
		return nationalityService.insert(nationality);
	}
}
