package org.simplilend.loanapp.service;

import java.util.List;

import org.simplilend.loanapp.entities.Borrower;
import org.simplilend.loanapp.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private BorrowerRepository borrowerRepository;
	
	public boolean login(Borrower borrower){
		
		List<Borrower> list=borrowerRepository.findByEmailAndPassword(borrower.getEmail(), borrower.getPassword());
		
		return list!=null&&!list.isEmpty()?true:false;
	}
}
