package org.simplilend.loanapp.helper;

public class LoginResponse {

	private boolean response;
	
	public LoginResponse(boolean response) {
		// TODO Auto-generated constructor stub
		
		this.response=response;
	}

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}
}
