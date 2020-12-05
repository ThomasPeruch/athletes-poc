package com.tproject.athletespoc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nationality {

	@Id
	@GeneratedValue
	private Integer id;

	private String country;

	public Nationality() {}

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
