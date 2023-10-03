package com.springrest.entities;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Job_Details")
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    
	@Id
	@Column(name="Job_id")
	private int jobId;
	
	@Column(name="Company_Name")
	private String companyName;
	
	@Column(name="Type_Of_Company")
	private String typeOfCompany;
	
	@Column(name="Job_Role")
	private String jobRole;
	
	@Column(name="Company_Description")
	private String companyDescription;
	
	@ElementCollection
	@CollectionTable(name="Skills_Required")
	private List<String> skillsRequired;
	
	@ElementCollection
	@CollectionTable(name="Additional_Skills")
	private List<String> additionalSkills;
	
	@Column(name="Salary_Offer")
	private long salary;
	
	@Column(name="Type_Of_Salary")
	private String typeOfSalary;
	
	@ElementCollection
	@CollectionTable(name="Perks")
	private List<String> perks;
	
	@ElementCollection
	@CollectionTable(name="Eligible_Batches")
	private List<Integer> EligibleBatches;
	
	@ElementCollection
	@CollectionTable(name="Eligible_Branches")
	private List<String> eligibleBranches;
	
	@ElementCollection
	@CollectionTable(name="Job_locations")
	private List<String> jobLocations;
	
	@Column(name="Type_Of_Interview")
	private String typeOfInterview;
	
	@ElementCollection
	@CollectionTable(name="Interview_Locations")
	private List<String> interviewLocations;
	
	@Column(name="No_Of_Rounds")
	private int noOfRounds;
	
	@ElementCollection
	@CollectionTable(name="Type_Of_Rounds")
	private List<String> TypeOfRounds;
	
	
}
