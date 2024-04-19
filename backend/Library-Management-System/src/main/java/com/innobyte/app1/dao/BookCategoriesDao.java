package com.innobyte.app1.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.innobyte.app1.model.BookCategories;
import com.innobyte.app1.repo.BookCategoriesRepository;

@Repository
public class BookCategoriesDao {
	@Autowired
    private BookCategoriesRepository repo;
    public BookCategories saveBookCategories(BookCategories bc) {
		return repo.save(bc);
	}
	public List<BookCategories>getBookCategories() {
		return repo.findAll();
		
	}
	public BookCategories getBookCategories(Integer bookCategoriesId) {
		return repo.findById(bookCategoriesId).get();
	}
	public void updateBookCategories(BookCategories bc) {
		 repo.save(bc);
	}
	public void deleteBookCategories(Integer bookCategoriesId) {
	      repo.deleteById(bookCategoriesId);
	}
	

}
