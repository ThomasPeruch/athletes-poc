package com.tproject.athletespoc.service;

import com.tproject.athletespoc.model.Nationality;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NationalityService {

	public List<Nationality> getNationalitiesMock() {
		return Arrays.asList(new Nationality(1, "Portugal"),
				new Nationality(2, "Australia"),
				new Nationality(3, "Brazil"));
	}
}
