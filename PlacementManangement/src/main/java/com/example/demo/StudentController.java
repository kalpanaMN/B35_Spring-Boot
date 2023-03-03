package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

public class StudentController {
	@Autowired
	private StudentService service;
	
	//RESTful API
	//creation
	@PostMapping("/student")
	public void add(@RequestBody Student s)
	{
		service.create(s);
	}
	//deletion
	@DeleteMapping("/student/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	//Retrieve with all the records
	@GetMapping("/student")
	public List<Student>list()
	{
		return service.listAll();
		
	}
	//Retrieve with specific id
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> get(@PathVariable Integer id)
	{
		try {
			Student s=service.retrieve(id);
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	//updation
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> update(@RequestBody Student s, @PathVariable Integer id)
	{
		try {
			@SuppressWarnings("unused")
			Student s1=service.retrieve(id);
			service.create(s);
			return new ResponseEntity<Student>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	
	
	

}@Autowired
private StudentService service;

//RESTful API
//creation
@PostMapping("/student")
public void add(@RequestBody Student s)
{
	service.create(s);
}
//deletion
@DeleteMapping("/student/{id}")
public void remove(@PathVariable Integer id)
{
	service.delete(id);
}
//Retrieve with all the records
@GetMapping("/student")
public List<Student>list()
{
	return service.listAll();
	
}
//Retrieve with specific id
@GetMapping("/student/{id}")
public ResponseEntity<Student> get(@PathVariable Integer id)
{
	try {
		Student s=service.retrieve(id);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	
	}
	catch(NoSuchElementException e)
	{
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
}
//updation
@PutMapping("/student/{id}")
public ResponseEntity<Student> update(@RequestBody Student s, @PathVariable Integer id)
{
	try {
		@SuppressWarnings("unused")
		Student s1=service.retrieve(id);
		service.create(s);
		return new ResponseEntity<Student>(s,HttpStatus.OK);
	
	}
	catch(NoSuchElementException e)
	{
		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
}






}
	@RestController
	

}
