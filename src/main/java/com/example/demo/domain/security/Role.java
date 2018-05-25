package com.example.demo.domain.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
//import org.hibernate.annotations.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Role implements Serializable{
	
	private static final long serialVersionUID = 890245234L;
	
	@Id
	private int roleId;
	
	private String name;
	@Autowired
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserRole> userRoles = new HashSet<>();
	
	public Role(){}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	
}
