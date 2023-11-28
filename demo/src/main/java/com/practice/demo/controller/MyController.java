package com.practice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.entity.Courses;
import com.practice.demo.service.CourseService;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
	@Autowired
	private CourseService service;
	
	
	
@RequestMapping("/")
public String getHome() {
	return "hello world";
}
@GetMapping("/courses")
public List<Courses> getCourses(){
	return service.getCourses();
}
@GetMapping("/courses/{id}")
public Courses getCourse(@PathVariable String id) {
	return service.getCourse(Long.parseLong(id));
}
@PostMapping("/courses")
public Courses addCourse(@RequestBody Courses course) {
	return service.addCourse(course);
}

@PutMapping("/courses")
public Courses updateCourse(@PathVariable Courses course) {
	return service.updateCourse(course);
	
}

@DeleteMapping("/courses/{id}")
public  ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id){
	try {
	service.deleteCourse(Long.parseLong(id));
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

}
