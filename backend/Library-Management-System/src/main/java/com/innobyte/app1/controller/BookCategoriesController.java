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

import com.innobyte.app1.model.BookCategories;
import com.innobyte.app1.service.BookCategoriesService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping ("/api")
public class BookCategoriesController {
	@Autowired
	private BookCategoriesService service;

	
	
	
	
	
	@PostMapping("bookCategories")
	public ResponseEntity<BookCategories> save(@RequestBody BookCategories bookCategories){
		BookCategories savedBookCategories=service.saveBookCategories(bookCategories);
		return new ResponseEntity<>(savedBookCategories,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/bookCategories")
	public ResponseEntity<List<BookCategories>> getAllBookCategories(){
		List<BookCategories> bookCategories=service.getBookCategories();
		return new ResponseEntity<>(bookCategories,HttpStatus.OK) ;
		
	}
	
	
	
	@GetMapping("/bookCategories/{id}") 
	public ResponseEntity<BookCategories> getOneEmployee(@PathVariable("id") Integer bookCategoriesId){
	BookCategories bookCategories=service.getBookCategories(bookCategoriesId);
		return new ResponseEntity<BookCategories>(bookCategories,HttpStatus.OK) ;
		
	}
	
	
	@DeleteMapping("/bookCategories/{id}") 
	public ResponseEntity<BookCategories> deleteBook(@PathVariable("id") Integer bookCategoriesId){
	service.deleteBookCategories(bookCategoriesId);
		return new ResponseEntity<BookCategories>(HttpStatus.OK) ;
		
	}
	
	
	@PutMapping("/bookCategories")
	public ResponseEntity<BookCategories> update(@RequestBody BookCategories bookCategories){
		service.saveBookCategories(bookCategories);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
