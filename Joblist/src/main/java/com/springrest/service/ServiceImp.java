package com.springrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springrest.entities.Job;
import com.springrest.repositorydao.Repository;

@Component
public class ServiceImp implements JobService{

     Repository repo;
     
    @Autowired
	public ServiceImp(Repository repo) {
		this.repo = repo;
	}

	@Override
	public String upsertDetails(Job job) {
		repo.save(job);
		String msg="job details entered successfully";
		return msg;
	}

	@Override
	public String Delete(int id) {
		Job j=getById(id);
		if(j!=null)
		{
		repo.delete(j);
		return "job deleted successfully";
		}
		return "This job is not available";
	}

	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		 List<Job> x=repo.findAll();
		 return x;
	}

	@Override
	public Job getById(int id) {
		// TODO Auto-generated method stub
		Job j=repo.getById(id);
		return j;
	}

	@Override
	public String DeleteAll() {
		repo.deleteAll();
		return "All job details are deleted successfully";
	}

}
