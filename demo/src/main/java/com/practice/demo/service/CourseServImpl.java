package com.practice.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.demo.dao.CourseDao;
import com.practice.demo.entity.Courses;

@Service
public class CourseServImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(Long id) {
		// TODO Auto-generated method stub
		return courseDao.getOne(id);
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		Courses entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}
	

}
