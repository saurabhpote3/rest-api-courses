package com.practice.demo.service;

import java.util.List;

import com.practice.demo.entity.Courses;

public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourse(Long id);

	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);

	public void deleteCourse(long parseLong);

	
}
