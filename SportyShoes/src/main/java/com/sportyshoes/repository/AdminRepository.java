package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sportyshoes.model.Admin;


@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
}
