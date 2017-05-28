package org.simplilend.loanapp.repository;

import org.simplilend.loanapp.entities.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanDetails, String>{

	
}
