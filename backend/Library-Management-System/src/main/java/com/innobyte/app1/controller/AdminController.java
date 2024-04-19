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

import com.innobyte.app1.model.Admin;
import com.innobyte.app1.service.AdminService;

@RestController
		@RequestMapping ("/api")

public class AdminController {
	
	@Autowired
	private AdminService service;


	
	
	
	
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> save(@RequestBody Admin admin){
		Admin savedAdmin=service.saveAdmin(admin);
		return new ResponseEntity<>(savedAdmin,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/admin")
	public ResponseEntity<List<Admin>> getAllAdmin(){
		List<Admin> admin=service.getAdmin();
		return new ResponseEntity<>(admin,HttpStatus.OK) ;
		
	}
	
	
	
	@GetMapping("/admin/{id}") 
	public ResponseEntity<Admin> getOneEmployee(@PathVariable("id") Integer adminId){
	Admin admin=service.getAdmin(adminId);
		return new ResponseEntity<Admin>(admin,HttpStatus.OK) ;
		
	}
	
	
	@DeleteMapping("/admin/{id}") 
	public ResponseEntity<Admin> deleteAdmin(@PathVariable("id") Integer adminId){
	service.deleteAdmin(adminId);
		return new ResponseEntity<Admin>(HttpStatus.OK) ;
		
	}
	
	
	@PutMapping("/admin")
	public ResponseEntity<Admin> update(@RequestBody Admin admin){
		service.saveAdmin(admin);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	


}
