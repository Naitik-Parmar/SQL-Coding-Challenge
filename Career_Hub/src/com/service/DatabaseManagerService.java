package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.DatabaseManagerDao;
import com.dao.DatabaseManagerDaoImpl;
import com.exceptions.InvalidEmailFormatHandling;
import com.exceptions.InvalidSalaryFormatHandling;
import com.model.Applicant;
import com.model.Company;
import com.model.JobApplicationClass;
import com.model.JobListing;

public class DatabaseManagerService {

	DatabaseManagerDao dao= new DatabaseManagerDaoImpl();
	
	public int save(JobListing jobListing) throws SQLException,InvalidSalaryFormatHandling{
		// TODO Auto-generated method stub
		if(jobListing.getSalary()<0 ) {
			throw new InvalidSalaryFormatHandling("Salary cannot be negative");
		}
		return dao.save(jobListing);
	}

	public List<JobListing> getJobListings() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getJobListings();
	}

	public int createProfile(Applicant applicant) throws SQLException, InvalidEmailFormatHandling {
		// TODO Auto-generated method stub
		
		if(!applicant.getEmail().contains("@")) {
			throw new InvalidEmailFormatHandling("Email is invalid");
		}
		
		return dao.createProfile(applicant);
	}

	public int applyForJob(JobApplicationClass jobApplicationClass) throws SQLException {
		// TODO Auto-generated method stub
		return dao.applyForJob(jobApplicationClass.getJob_id(), jobApplicationClass.getCover_letter());
	}

	public List<Applicant> getApplicants() throws SQLException, InvalidEmailFormatHandling {
		// TODO Auto-generated method stub
		return dao.getApplicants();
	}

	public List<JobApplicationClass> getApplicationsFOrJob() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getApplicationsFOrJob();
	}

	public int insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return dao.insertCompany(company);
	}

	public List<Company> getCompanies() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getCompanies();
	}

}
