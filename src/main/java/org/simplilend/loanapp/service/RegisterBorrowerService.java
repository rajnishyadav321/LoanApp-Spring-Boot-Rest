package org.simplilend.loanapp.service;

import org.simplilend.loanapp.entities.Borrower;
import org.simplilend.loanapp.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterBorrowerService {

	@Autowired
	private BorrowerRepository borrowerRepository;
	
	public boolean add(Borrower borrower){
		boolean result=borrowerRepository.exists(borrower.getEmail());
		if(!result)
		borrower=borrowerRepository.saveAndFlush(borrower);
		
		return result;
	}
}
