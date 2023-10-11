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
		try {
		repo.save(job);
		}
		catch(Exception e)
		{
			return "Enter details in correct format";
		}
		String msg="job details entered successfully";
		return msg;
	}

	@Override
	public String del(int id) {
        Optional<Job> j = repo.findById(id);
        if (j.isPresent()) {
            repo.delete(j.get());
            return "Job deleted successfully";
        } else {
            return "Job with ID " + id + " not found";
        }
    }

	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		 List<Job> x=repo.findAll();
		 return x;
	}

	@Override
	public Optional<Job> getById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		Optional<Job> j=repo.findById(id);
		return j;
	}

	@Override
	public String DeleteAll() {
		repo.deleteAll();
		return "All job details are deleted successfully";
	}

}
