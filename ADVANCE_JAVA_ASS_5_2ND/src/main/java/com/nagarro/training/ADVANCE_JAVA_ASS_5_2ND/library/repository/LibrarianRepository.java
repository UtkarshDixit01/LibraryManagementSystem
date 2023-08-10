package com.nagarro.training.ADVANCE_JAVA_ASS_5_2ND.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.ADVANCE_JAVA_ASS_5_2ND.library.entity.Librarian;

public interface LibrarianRepository extends JpaRepository<Librarian, Integer> {

	public Librarian findByEmailIgnoreCase(String email);
	
	public Librarian findByEmailAndPassword(String email, String password);
}
