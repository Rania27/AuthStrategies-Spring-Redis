package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
