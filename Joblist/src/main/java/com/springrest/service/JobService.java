package com.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springrest.entities.Job;

@Service
public interface JobService {
         
	    String upsertDetails(Job job);
	    List<Job> getAll();
	    Optional<Job> getById(Integer id);
	    String DeleteAll();
		String del(int id);
}
