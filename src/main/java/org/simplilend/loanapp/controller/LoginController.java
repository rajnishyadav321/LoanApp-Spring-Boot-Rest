package org.simplilend.loanapp.controller;

import org.simplilend.loanapp.entities.Borrower;
import org.simplilend.loanapp.helper.LoginResponse;
import org.simplilend.loanapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private LoginService loginService;
	
	public LoginService getLoginService() {
		return loginService;
	}

	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	

	@CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public LoginResponse login(Borrower borrower){
		
			boolean result=loginService.login(borrower);
			LoginResponse loginResponse=new LoginResponse(result);
			
			
		
		return loginResponse;
	}
}
