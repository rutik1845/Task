package com.example.demo.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudentModel;
import com.example.demo.dto.Createstudto;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository ur;
	
	public Iterable<StudentModel> getalluser()
	{
	return this.ur.findAll();
	}
	
	
	public List<StudentModel> fetchbyCity(String city)
	{
	return this.ur.findByCity(city);
	}
	
	
	public StudentModel fetchbyAge_Name(int age,String name)
	{
	return this.ur.findByAgeAndName(age,name);
	}
	
	
	public String delete(String name)
	{
		StudentModel u1 = ur.findByName(name);
		ur.delete(u1);
	return "Deleted Successfully";
	}
	
	
	public String update(Createstudto cud,String name) {
		StudentModel u1 =this.ur.findByName(name);
		u1.setName(cud.getName());
		u1.setLastname(cud.getLastname());
		u1.setAge(cud.getAge());
		u1.setEmail(cud.getEmail());
		u1.setCity(cud.getCity());
		u1.setPassword(cud.getPassword());
	this.ur.save(u1);
	return "Updated Successfully";
	}
	
	
	public StudentModel Adduser(Createstudto cud) {
		StudentModel u1 = new StudentModel();
		u1.setName(cud.getName());
		u1.setLastname(cud.getLastname());
		u1.setAge(cud.getAge());
		u1.setEmail(cud.getEmail());
		u1.setCity(cud.getCity());
		u1.setPassword(cud.getPassword());
	this.ur.save(u1);
	return u1;
	}

}
