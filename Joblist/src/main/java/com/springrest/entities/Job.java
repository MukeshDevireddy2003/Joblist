package com.springrest.entities;

import java.util.List;

import org.hibernate.annotations.Generated;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int jobId;
	
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", companyName=" + companyName + ", typeOfCompany=" + typeOfCompany
				+ ", jobRole=" + jobRole + ", companyDescription=" + companyDescription + ", skillsRequired="
				+ skillsRequired + ", additionalSkills=" + additionalSkills + ", salary=" + salary + ", typeOfSalary="
				+ typeOfSalary + ", perks=" + perks + ", EligibleBatches=" + EligibleBatches + ", eligibleBranches="
				+ eligibleBranches + ", jobLocations=" + jobLocations + ", typeOfInterview=" + typeOfInterview
				+ ", interviewLocations=" + interviewLocations + ", noOfRounds=" + noOfRounds + ", TypeOfRounds="
				+ TypeOfRounds + "]";
	}

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
	private Long salary;
	
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
	private Integer noOfRounds;
	
	@ElementCollection
	@CollectionTable(name="Type_Of_Rounds")
	private List<String> TypeOfRounds;

	public int getJobId() {
		return jobId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public String getJobRole() {
		return jobRole;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public List<String> getSkillsRequired() {
		return skillsRequired;
	}

	public List<String> getAdditionalSkills() {
		return additionalSkills;
	}

	public Long getSalary() {
		return salary;
	}

	public String getTypeOfSalary() {
		return typeOfSalary;
	}

	public List<String> getPerks() {
		return perks;
	}

	public List<Integer> getEligibleBatches() {
		return EligibleBatches;
	}

	public List<String> getEligibleBranches() {
		return eligibleBranches;
	}

	public List<String> getJobLocations() {
		return jobLocations;
	}

	public String getTypeOfInterview() {
		return typeOfInterview;
	}

	public List<String> getInterviewLocations() {
		return interviewLocations;
	}

	public Integer getNoOfRounds() {
		return noOfRounds;
	}

	public List<String> getTypeOfRounds() {
		return TypeOfRounds;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public void setSkillsRequired(List<String> skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public void setAdditionalSkills(List<String> additionalSkills) {
		this.additionalSkills = additionalSkills;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public void setTypeOfSalary(String typeOfSalary) {
		this.typeOfSalary = typeOfSalary;
	}

	public void setPerks(List<String> perks) {
		this.perks = perks;
	}

	public void setEligibleBatches(List<Integer> eligibleBatches) {
		EligibleBatches = eligibleBatches;
	}

	public void setEligibleBranches(List<String> eligibleBranches) {
		this.eligibleBranches = eligibleBranches;
	}

	public void setJobLocations(List<String> jobLocations) {
		this.jobLocations = jobLocations;
	}

	public void setTypeOfInterview(String typeOfInterview) {
		this.typeOfInterview = typeOfInterview;
	}

	public void setInterviewLocations(List<String> interviewLocations) {
		this.interviewLocations = interviewLocations;
	}

	public void setNoOfRounds(Integer noOfRounds) {
		this.noOfRounds = noOfRounds;
	}

	public void setTypeOfRounds(List<String> typeOfRounds) {
		TypeOfRounds = typeOfRounds;
	}
	
	
	
	
}
