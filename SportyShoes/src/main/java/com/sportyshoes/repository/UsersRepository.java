package com.sportyshoes.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sportyshoes.model.Users;

@Repository("usersRepository")
public interface UsersRepository extends JpaRepository<Users, Integer> { 

	@Query(
			value = "SELECT * from Users where username like %?1% or "
					+ "email like %?1% or "
					+ "contact like %?1% or ",
			nativeQuery = true)
	List<Users> findUsersByUsername(String like);
	
}
