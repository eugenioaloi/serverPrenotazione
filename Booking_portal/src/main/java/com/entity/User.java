package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	  
	private String name;
	  
	private String surname;
	
	private String username;
	
	private String email;
	
	private int telephone;
	
	private String password;
	
	private String created_at;
	
	private String updated_at;

	public User(Integer id, String name, String surname, String username, String email, int telephone, String password,
			String created_at, String updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	

}
