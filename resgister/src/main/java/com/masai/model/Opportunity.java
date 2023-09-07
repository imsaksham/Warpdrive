package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Opportunity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String name;
	String stage;
	
	@OneToMany
	List<Contract> list = new ArrayList<>();

	public Opportunity(Integer id, String name, String stage, List<Contract> list) {
		super();
		this.id = id;
		this.name = name;
		this.stage = stage;
		this.list = list;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public List<Contract> getList() {
		return list;
	}

	public void setList(List<Contract> list) {
		this.list = list;
	}
	
	
}
