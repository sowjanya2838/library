package com.innobyte.app1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innobyte.app1.dao.BookCategoriesDao;
import com.innobyte.app1.model.BookCategories;

@Service
public class BookCategoriesService {
	@Autowired
	private BookCategoriesDao dao;
	public BookCategories saveBookCategories(BookCategories bc) {
		return dao.saveBookCategories(bc);
	}
	public List<BookCategories>getBookCategories() {
		return dao.getBookCategories();
		
	}
	public BookCategories getBookCategories(Integer bookCategoriesId) {
		return dao.getBookCategories(bookCategoriesId);
	}
	public void updateBook(BookCategories bc) {
		 dao.updateBookCategories(bc);
	}
	public void deleteBookCategories(Integer bookCategoriesId) {
	      dao.deleteBookCategories(bookCategoriesId);
	}


}
