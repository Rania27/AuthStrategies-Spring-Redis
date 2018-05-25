package com.example.demo.Repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
}
