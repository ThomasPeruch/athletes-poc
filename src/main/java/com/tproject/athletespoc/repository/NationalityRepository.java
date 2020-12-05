package com.tproject.athletespoc.repository;

import com.tproject.athletespoc.model.Nationality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality, Integer> {

}
