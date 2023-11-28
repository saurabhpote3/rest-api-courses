package com.practice.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.demo.entity.Courses;
@Repository
public interface CourseDao extends JpaRepository<Courses, Long> {

}
