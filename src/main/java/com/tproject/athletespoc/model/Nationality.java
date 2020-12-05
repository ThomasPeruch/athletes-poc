package com.tproject.athletespoc.model;

public class Nationality {
	private Integer id;
	private String country;

	public Nationality(Integer id, String country) {
		this.id = id;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
