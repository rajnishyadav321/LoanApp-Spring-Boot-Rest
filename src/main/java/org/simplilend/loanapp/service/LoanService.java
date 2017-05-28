package org.simplilend.loanapp.service;

import org.simplilend.loanapp.entities.LoanDetails;
import org.simplilend.loanapp.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepository loanRepository;
	
	public boolean save(LoanDetails loanDetails){
		
		boolean result=loanRepository.exists(loanDetails.getEmail());
		
		if(!result){
			loanDetails=loanRepository.saveAndFlush(loanDetails);
			
		}
		return result;
	}
}
