package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Contract;
import com.masai.model.Opportunity;
import com.masai.repository.ContractDao;
import com.masai.repository.OpportunityDao;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	ContractDao cDao;
	
	@Autowired
	OpportunityDao oDao;
	
	@Override
	public String register(Contract contract) {
		
		Contract ctr = cDao.findByName(contract.getName());
		
		Opportunity opportunity = oDao.findByName(contract.getName());
		
		if (ctr == null) {
			return "Data not found";
		}
		
		cDao.save(ctr);
		
		return "Data got inserted successfully";
	}

}








