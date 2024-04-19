package com.innobyte.app1.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innobyte.app1.model.Transaction;
import com.innobyte.app1.service.TransactionService;

@RestController
		@RequestMapping ("/api")

public class TransactionController {
	
	@Autowired
	private TransactionService service;


	
	@PostMapping("/transaction")
	public ResponseEntity<Transaction> save(@RequestBody Transaction transaction){
		Transaction savedTransaction=service.saveTransaction(transaction);
		return new ResponseEntity<>(savedTransaction,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/transaction")
	public ResponseEntity<List<Transaction>> getAllTransaction(){
		List<Transaction> transaction=service.getTransaction();
		return new ResponseEntity<>(transaction,HttpStatus.OK) ;
		
	}
	
	
	
	@GetMapping("/transaction/{id}") 
	public ResponseEntity<Transaction> getOneEmployee(@PathVariable("id") Integer transactionId){
	Transaction transaction=service.getTransaction(transactionId);
		return new ResponseEntity<Transaction>(transaction,HttpStatus.OK) ;
		
	}
	
	
	@DeleteMapping("/transaction/{id}") 
	public ResponseEntity<Transaction> deleteTransaction(@PathVariable("id") Integer transactionId){
	service.deleteTransaction(transactionId);
		return new ResponseEntity<Transaction>(HttpStatus.OK) ;
		
	}
	
	
	@PutMapping("/transaction")
	public ResponseEntity<Transaction> update(@RequestBody Transaction transaction){
		service.saveTransaction(transaction);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
