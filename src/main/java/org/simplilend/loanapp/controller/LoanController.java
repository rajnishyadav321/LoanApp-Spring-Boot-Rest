package org.simplilend.loanapp.controller;

import org.simplilend.loanapp.entities.LoanDetails;
import org.simplilend.loanapp.helper.LoanDetailsResponse;
import org.simplilend.loanapp.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

	
	private LoanService loanService;
	
	public LoanService getLoanService() {
		return loanService;
	}
	@Autowired
	public void setLoanService(LoanService loanService) {
		this.loanService = loanService;
	}
	
	
	@CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping(value = "/saveD", method = RequestMethod.POST, produces = "application/json")
	public LoanDetailsResponse save(LoanDetails loanDetails){
		
		boolean result=loanService.save(loanDetails);
		LoanDetailsResponse loanDetailsResponse=new LoanDetailsResponse(result);
		return loanDetailsResponse;
	}
}
