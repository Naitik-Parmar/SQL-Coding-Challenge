package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exceptions.InvalidEmailFormatHandling;
import com.exceptions.InvalidSalaryFormatHandling;
import com.model.Applicant;
import com.model.Company;
import com.model.JobApplicationClass;
import com.model.JobListing;

public interface DatabaseManagerDao {
	int save(JobListing joblisting)throws SQLException,InvalidSalaryFormatHandling;
	List<JobListing> getJobListings() throws SQLException;
	
	int createProfile(Applicant applicant) throws SQLException,InvalidEmailFormatHandling;
	int applyForJob(int jobID,  String coverLetter) throws SQLException;
	
	List<Applicant> getApplicants() throws SQLException,InvalidEmailFormatHandling;
	List<JobApplicationClass> getApplicationsFOrJob() throws SQLException;
	
	int insertCompany(Company company) throws SQLException;
	List<Company> getCompanies() throws SQLException;
}
