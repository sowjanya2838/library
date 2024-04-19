package com.innobyte.app1.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.innobyte.app1.model.Book;
import com.innobyte.app1.model.BookCategories;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByBookCategories(BookCategories bookCategories);
	List<Book>findByBookNameContaining(String bookName);

}
