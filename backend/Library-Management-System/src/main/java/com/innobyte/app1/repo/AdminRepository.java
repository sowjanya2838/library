package com.innobyte.app1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.innobyte.app1.model.Admin;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Integer>{

}