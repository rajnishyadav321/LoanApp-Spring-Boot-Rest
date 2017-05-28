package org.simplilend.loanapp.repository;

import java.util.List;

import org.simplilend.loanapp.entities.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, String>{

	List<Borrower> findByEmailAndPassword(String email,String password);
}
