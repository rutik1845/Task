package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.StudentModel;

public interface StudentRepository extends CrudRepository<StudentModel, Integer>{ 
	
	List<StudentModel> findByCity(String city);
	StudentModel findByName(String Name);
	StudentModel findByAgeAndName(int age, String Name);

}
