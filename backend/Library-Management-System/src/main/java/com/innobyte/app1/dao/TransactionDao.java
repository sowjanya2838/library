package com.innobyte.app1.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.innobyte.app1.model.Transaction;
import com.innobyte.app1.repo.TransactionRepository;

@Repository

public class TransactionDao {
	@Autowired
    private TransactionRepository repo;
    public Transaction saveTransaction(Transaction t) {
		return repo.save(t);
	}
	public List<Transaction>getTransaction() {
		return repo.findAll();
		
	}
	public Transaction getTransaction(Integer transactionId) {
		return repo.findById(transactionId).get();
	}
	public void updateTransaction(Transaction t) {
		 repo.save(t);
	}
	public void deleteTransaction(Integer transactionId) {
	      repo.deleteById(transactionId);
	}


}
