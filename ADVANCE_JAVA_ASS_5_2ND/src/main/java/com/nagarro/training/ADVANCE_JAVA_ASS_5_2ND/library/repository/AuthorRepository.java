package com.nagarro.training.ADVANCE_JAVA_ASS_5_2ND.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.ADVANCE_JAVA_ASS_5_2ND.library.entity.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
	public Author findByName(String name);
}
