package com.restraurantapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restraurantapp.model.Restraurant;

@Repository
public interface IRestraurantRepository extends JpaRepository<Restraurant, Integer>{

	
	
}
