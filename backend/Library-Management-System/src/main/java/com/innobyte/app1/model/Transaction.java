package com.innobyte.app1.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transaction_details")
public class Transaction {
	@Id
	@GeneratedValue
	private Integer transactionId;
	private String userId;
	private String bookId;
	private Date borrowedDate;
	private Date returnDate;
	public Transaction() {
		super();
	}
	public Transaction(Integer transactionId, String userId, String bookId, Date borrowedDate, Date returnDate) {
		super();
		this.transactionId = transactionId;
		this.userId = userId;
		this.bookId = bookId;
		this.borrowedDate = borrowedDate;
		this.returnDate = returnDate;
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public Date getBorrowedDate() {
		return borrowedDate;
	}
	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", userId=" + userId + ", bookId=" + bookId
				+ ", borrowedDate=" + borrowedDate + ", returnDate=" + returnDate + "]";
	}
	
	

}
