package com.nagarro.training.ADVANCE_JAVA_ASS_5_2ND.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.training.ADVANCE_JAVA_ASS_5_2ND.library.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
