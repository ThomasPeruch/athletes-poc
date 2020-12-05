package com.tproject.athletespoc.endpoint;

import com.tproject.athletespoc.model.Nationality;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NationalityController {

	@GetMapping("/nationality")
	public List<Nationality> getNationalities() {
		return getNationalitiesMock();
	}

	private List<Nationality> getNationalitiesMock() {
		return Arrays.asList(new Nationality(1, "Portugal"),
							 new Nationality(2, "Australia"),
							 new Nationality(3, "Brazil"));
	}
}
