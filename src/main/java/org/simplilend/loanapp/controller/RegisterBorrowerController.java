package org.simplilend.loanapp.controller;

import org.simplilend.loanapp.entities.Borrower;
import org.simplilend.loanapp.helper.RegisterResponse;
import org.simplilend.loanapp.service.RegisterBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterBorrowerController {

	
	private RegisterBorrowerService registerBorrowerService;
	
	

	@CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public RegisterResponse add(Borrower borrower){		
		boolean result=registerBorrowerService.add(borrower);
		RegisterResponse registerResponse=new RegisterResponse(result);
		return registerResponse;
	}

	public RegisterBorrowerService getRegisterBorrowerService() {
		return registerBorrowerService;
	}

	@Autowired
	public void setRegisterBorrowerService(RegisterBorrowerService registerBorrowerService) {
		this.registerBorrowerService = registerBorrowerService;
	}
}
