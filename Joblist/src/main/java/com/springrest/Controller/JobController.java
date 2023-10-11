package com.springrest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Job;
import com.springrest.service.JobService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class JobController {
    @Autowired
	JobService js;
	
	@GetMapping("/job/{jobid}")
	public ResponseEntity<String> get(@PathVariable("jobid") Integer id)
	{   
		Optional<Job> j=js.getById(id);
		String r="";
		r+=j.toString();
		if(r.equals("Optional.empty"))
		{
			r="This job is not available now";
		}
		return new ResponseEntity<>(r,HttpStatus.OK);
	}
	
	@GetMapping("/jobsall")
    public ResponseEntity<List<Job>> getJobAll()
    {
		List<Job> l=js.getAll();
		return new ResponseEntity<>(l,HttpStatus.OK);
    }
	@PutMapping("/job")
	public ResponseEntity<String> updateJob(@RequestBody Job job)
	{
	     String msg=js.upsertDetails(job);	
	    return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@PostMapping("/job")
	public ResponseEntity<String> insertJob(@RequestBody Job job)
	{
	     String msg=js.upsertDetails(job);	
	    return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@DeleteMapping("/job/{jobid}")
	public ResponseEntity<String> delete(@PathVariable("jobid") int id)
	{
		  String msg=js.del(id);
		  return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@DeleteMapping("/jobsall")
	public ResponseEntity<String> deleteAll()
	{
		String msg=js.DeleteAll();
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
