package com.innobyte.app1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Book_details")
public class Book {
	@Id
	@GeneratedValue
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private String imageUrl;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitizer", "handler"})
	@ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
	@JoinColumn(name="categoryId")
	private BookCategories bookCategories;


	public Book() {
		super();
	}


	public Book(Integer bookId, String bookName, String bookAuthor, String imageUrl, BookCategories bookCategories) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.imageUrl = imageUrl;
		this.bookCategories = bookCategories;
	}


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public BookCategories getBookCategories() {
		return bookCategories;
	}


	public void setBookCategories(BookCategories bookCategories) {
		this.bookCategories = bookCategories;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", imageUrl="
				+ imageUrl + ", bookCategories=" + bookCategories + "]";
	}
	
	


	
	
	
}
