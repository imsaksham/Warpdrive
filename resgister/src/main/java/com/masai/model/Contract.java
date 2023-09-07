package com.masai.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Opportunity - table 1 - parent
//Contract - table 2 - child of table 1
//
//1 opportunity record can have multiple contracts linked - 1 to many relationship
//
//There is  'stage' (column) on Opportunity (table 1)
//For a record, whenever the stage (column) value is changed to value called "contract sent" and there is no contract under that Opportunity then user should get following error - " please create a contract under this opportunity before selecting this stage"

public class Contract {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	String name;

	public Contract(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
