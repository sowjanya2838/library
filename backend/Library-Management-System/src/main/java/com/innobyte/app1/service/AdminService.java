package com.innobyte.app1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innobyte.app1.dao.AdminDao;
import com.innobyte.app1.model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	public Admin saveAdmin(Admin a) {
		return dao.saveAdmin(a);
	}
	public List<Admin>getAdmin() {
		return dao.getAdmin();
		
	}
	public Admin getAdmin(Integer adminId) {
		return dao.getAdmin(adminId);
	}
	public void updateAdmin(Admin a) {
		 dao.updateAdmin(a);
	}
	public void deleteAdmin(Integer adminId) {
	      dao.deleteAdmin(adminId);
	}


}
