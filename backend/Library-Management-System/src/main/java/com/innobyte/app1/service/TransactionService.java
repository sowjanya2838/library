package com.innobyte.app1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innobyte.app1.dao.TransactionDao;
import com.innobyte.app1.model.Transaction;

@Service
public class TransactionService {
	@Autowired
	private TransactionDao dao;
	public Transaction saveTransaction(Transaction t) {
		return dao.saveTransaction(t);
	}
	public List<Transaction>getTransaction() {
		return dao.getTransaction();
		
	}
	public Transaction getTransaction(Integer transactionId) {
		return dao.getTransaction(transactionId);
	}
	public void updateTransaction(Transaction t) {
		 dao.updateTransaction(t);
	}
	public void deleteTransaction(Integer transactionId) {
	      dao.deleteTransaction(transactionId);
	}


}
