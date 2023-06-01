package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Createstudto;
import com.example.demo.serivce.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService us=new StudentService();
	
	@GetMapping("")
	public ResponseEntity<?> home()
	{
	ResponseEntity<?>r = new ResponseEntity<>(us.getalluser(),HttpStatus.OK);
	return r;
	}
	
	
	@PostMapping("")
	public ResponseEntity<?> insert(@Valid @RequestBody Createstudto cud)
	{
	ResponseEntity<?> r = new ResponseEntity<>(us.Adduser(cud),HttpStatus.CREATED);
	return r;
	}
	
	
	@GetMapping("/{city}")
	public ResponseEntity<?> getbyname(@PathVariable("city") String city)
	{
	ResponseEntity<?> r =new ResponseEntity<>(us.fetchbyCity(city),HttpStatus.OK);
	return r;
	}
	
	
	@DeleteMapping("/{name}")
	public ResponseEntity<?> delete(@PathVariable("name")String name)
	{
	ResponseEntity<?> r = new ResponseEntity<>(us.delete(name),HttpStatus.OK);
	return r;
	}
	
	
	@PutMapping("/{city}")
	public ResponseEntity<?> getbyname_age(@PathVariable("city") String city, @RequestBody Createstudto cud)
	{
	ResponseEntity<?> r =new ResponseEntity<>(us.update(cud,city),HttpStatus.OK);
	return r;
	}
	
	
	@GetMapping("/{age}/{name}")
	public ResponseEntity<?> getbyage_name(@PathVariable("age") int age,@PathVariable("name") String name)
	{
	ResponseEntity<?> r =new ResponseEntity<>(us.fetchbyAge_Name(age,name),HttpStatus.OK);
	return r;
	}

	
		}
