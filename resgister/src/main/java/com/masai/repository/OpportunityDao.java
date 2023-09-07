package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Opportunity;

public interface OpportunityDao extends JpaRepository<Opportunity, Integer> {

	public String saveValue(String name, String value);
	public Opportunity findByName(String name);
}	
