package com.Springbootproject2.firstrestapi.user;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class UserDetailsCommandLineRunner implements CommandLineRunner{
	public UserDetailsCommandLineRunner(UserDetailsRepository repository) {
		super();
		this.repository = repository;
	}

	 private Logger logger = LoggerFactory.getLogger(getClass());
	 
	 private UserDetailsRepository repository;

	@Override
	public void run(String... args) throws Exception {
	repository.save(new UserDetails("Aparna","Admin"));
	repository.save(new UserDetails("Arun","Admin"));
	repository.save(new UserDetails("Sri","Admin"));
	repository.save(new UserDetails("Rushi","Admin"));
	repository.save(new UserDetails("vaigarai","User"));
	repository.save(new UserDetails("Guna","User"));
	
	//List<UserDetails> users = repository.findAll();
	 List<UserDetails> users = repository.findByRole("Admin");
	users.forEach(user ->logger.info(user.toString()));
	
	
	}

}
