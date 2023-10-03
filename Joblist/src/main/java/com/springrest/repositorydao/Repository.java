package com.springrest.repositorydao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.entities.Job;

public interface Repository extends JpaRepository<Job,Serializable>{

}
