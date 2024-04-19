package com.innobyte.app1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innobyte.app1.dao.BookDao;
import com.innobyte.app1.model.Book;
import com.innobyte.app1.model.BookCategories;

@Service
public class BookService {
	@Autowired
	private BookDao dao;
	
	public Book saveBook(Book b) {
		return dao.saveBook(b);
	}
	public List<Book>getBook() {
		return dao.getBook();
		
	}
	public Book getBook(Integer bookId) {
		return dao.getBook(bookId);
	}
	public void updateBook(Book b) {
		 dao.updateBook(b);
	}
	public void deleteBook(Integer bookId) {
	      dao.deleteBook(bookId);
	}
	public List<Book>getBooksByBookCategories(BookCategories bookCategories) {
		return dao.getBooksByBookCategories(bookCategories);
	}
	public List<Book>getBooks(String bookName) {
		return dao.getBooks(bookName);
	}


}
