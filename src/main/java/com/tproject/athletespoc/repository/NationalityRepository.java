package com.tproject.athletespoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tproject.athletespoc.model.Nationality;

@Repository
public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
}
