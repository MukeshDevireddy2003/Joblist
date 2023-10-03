package com.springrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.entities.Job;

@Service
public interface JobService {
         
	    String upsertDetails(Job job);
	    String Delete(int id);
	    List<Job> getAll();
	    Job getById(int id);
	    String DeleteAll();
}
