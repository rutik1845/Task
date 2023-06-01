package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Createstudto {
	
	private int id;
	
	@Size(min = 3,message = "Name should have min 4 charaters")
	private String name;
	
	@NotNull
	@Size(min=3)
	private String lastname;
	
	@Email(message="enter valid email")
	@NotNull(message= "email cannot be null")
	private String email;
	
	@Size(min = 8,message = "password should be minimum 8 char long")
	@Pattern(regexp = "[a-zA-Z0-9]+", message = "password should contain alphabets,numeric and special character value")
	private String password;
	
	@NotNull
	private int age;
	
	@NotNull
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
