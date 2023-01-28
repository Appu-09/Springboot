package com.Springbootproject4.SpringJPAandHibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Springbootproject4.SpringJPAandHibernate.course.Course;
import com.Springbootproject4.SpringJPAandHibernate.course.Springdata.Jpa.CourseSpringDataJpaRepository;
import com.Springbootproject4.SpringJPAandHibernate.course.jdbc.CourseJdbcRepository;
import com.Springbootproject4.SpringJPAandHibernate.course.jpa.CourseJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
	// @Autowired
	// private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository  repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
	repository.save(new Course(5,"Aparna Vemuganti Jpa","Deepa"));
	repository.save(new Course(6,"Appu","Vemuganti"));
	repository.save(new Course(7,"Deepa Jpa","Vemuganti"));
		
	
	repository.deleteById(6l);
	
	System.out.println(repository.findById(5l));
	System.out.println(repository.findById(7l));
	
	System.out.println(repository.findAll());
	System.out.println(repository.count());
	
	System.out.println(repository.findByAuthor("Deepa"));
	System.out.println(repository.findByAuthor(""));
	
	
	System.out.println(repository.findByName("Aparna Vemuganti Jpa"));
	System.out.println(repository.findByName("Deepa Jpa"));
	}
}
