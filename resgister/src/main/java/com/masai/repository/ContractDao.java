package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Contract;

@Repository
public interface ContractDao extends JpaRepository<Contract, Integer> {

	public String saveValue(String value);
	
	public Contract findByName(String name);
}
