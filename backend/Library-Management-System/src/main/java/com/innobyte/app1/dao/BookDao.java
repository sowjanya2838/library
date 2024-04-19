package com.innobyte.app1.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.innobyte.app1.model.Book;
import com.innobyte.app1.model.BookCategories;
import com.innobyte.app1.repo.BookRepository;

@Repository
public class BookDao {
	@Autowired
    private BookRepository repo;
    public Book saveBook(Book b) {
		return repo.save(b);
	}
	public List<Book>getBook() {
		return repo.findAll();
		
	}
	public Book getBook(Integer bookId) {
		return repo.findById(bookId).get();
	}
	public void updateBook(Book b) {
		 repo.save(b);
	}
	public void deleteBook(Integer bookId) {
	      repo.deleteById(bookId);
	}
	public List<Book> getBooksByBookCategories(BookCategories bookCategories) {
		return repo.findByBookCategories(bookCategories);
	}
	public List<Book>getBooks(String bookName) {
		return repo.findByBookNameContaining(bookName);
	}



}
