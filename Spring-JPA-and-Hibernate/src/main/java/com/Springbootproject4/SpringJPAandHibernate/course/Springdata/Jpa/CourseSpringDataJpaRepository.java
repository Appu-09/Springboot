package com.Springbootproject4.SpringJPAandHibernate.course.Springdata.Jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springbootproject4.SpringJPAandHibernate.course.Course;

public interface  CourseSpringDataJpaRepository  extends JpaRepository<Course,Long>{

	List<Course>findByAuthor(String author);
	List<Course>findByName(String name);
}
