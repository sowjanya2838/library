package com.innobyte.app1.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innobyte.app1.model.Book;
import com.innobyte.app1.model.BookCategories;
import com.innobyte.app1.service.BookCategoriesService;
import com.innobyte.app1.service.BookService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping ("/api")
public class BookController {
	
	@Autowired
	private BookService service;
	@Autowired
	private BookCategoriesService bookCategoriesservice;

	
	@PostMapping("/book")
	public ResponseEntity<Book> save(@RequestBody Book book){
		Book savedBook=service.saveBook(book);
		return new ResponseEntity<>(savedBook,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBook(){
		List<Book> book=service.getBook();
		return new ResponseEntity<>(book,HttpStatus.OK) ;
		
	}
	
	
	
	@GetMapping("/book/{id}") 
	public ResponseEntity<Book> getOneBook(@PathVariable("id") Integer bookId){
	Book book=service.getBook(bookId);
		return new ResponseEntity<Book>(book,HttpStatus.OK) ;
		
		
	}
	
	
	@DeleteMapping("/book/{id}") 
	public ResponseEntity<Book> deleteBook(@PathVariable("id") Integer bookId){
	service.deleteBook(bookId);
		return new ResponseEntity<Book>(HttpStatus.OK) ;
		
	}
	
	
	@PutMapping("/book")
	public ResponseEntity<Book> update(@RequestBody Book book){
		service.saveBook(book);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/book/booksByBookCategories/{categoryId}")
	public ResponseEntity<List<Book>>getBooksByBookCategories(@PathVariable Integer categoryId) {
		BookCategories bookCategories=bookCategoriesservice.getBookCategories(categoryId);
		List<Book> books=service.getBooksByBookCategories(bookCategories);
		return new ResponseEntity<>(books,HttpStatus.OK);
	}
	
	
	@GetMapping("/book/search/{bookName}")
	public ResponseEntity<List<Book>>getbookNameContainingbook(@PathVariable String bookName) {
	//	Book book=service.getBooks(bookName);
		List<Book> books=service.getBooks(bookName);
		return new ResponseEntity<>(books,HttpStatus.OK);
	}

	


}