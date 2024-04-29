package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.InvalidEmailFormatHandling;
import com.exceptions.InvalidSalaryFormatHandling;
import com.model.Applicant;
import com.model.Company;
import com.model.JobApplicationClass;
import com.model.JobListing;
import com.utility.DBConnection;

public class DatabaseManagerDaoImpl implements DatabaseManagerDao{

	@Override
	public int save(JobListing joblisting) throws SQLException,InvalidSalaryFormatHandling {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="insert into joblisting "
				+ "(job_id,job_title,job_description,job_location,salary,posted_date,Company_company_id)\r\n"
				+ "values (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, joblisting.getJob_id());
		pstmt.setString(2, joblisting.getJob_title());
		pstmt.setString(3, joblisting.getJob_description());
		pstmt.setString(4, joblisting.getJob_location());
		pstmt.setDouble(5, joblisting.getSalary());
		pstmt.setString(6, joblisting.getPosted_date());
		pstmt.setInt(7, joblisting.getCompany_company_id());

		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		
		return status;
	}

	@Override
	public List<JobListing> getJobListings() throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="select * from joblisting ";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		
		ResultSet rst=pstmt.executeQuery();
		List<JobListing> list=new ArrayList<>();
		
		while(rst.next()==true) {
			int id=rst.getInt("job_id");
			String job_title = rst.getString("job_title");
			String job_description= rst.getString("job_description");
			String job_location=rst.getString("job_location");
			Double salary=rst.getDouble("salary");
			String job_type=rst.getString("job_type");
			String posted_date=rst.getString("posted_date");
			int Company_company_id=rst.getInt("Company_company_id");
			JobListing jobListing = new JobListing(id,job_title,job_description,job_location,salary,job_type,posted_date,Company_company_id);
			list.add(jobListing);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public int createProfile(Applicant applicant) throws SQLException, InvalidEmailFormatHandling {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="insert into applicant (applicant_id,first_name,last_name,email,phone,resume)\r\n"
				+ "values (?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,applicant.getApplicant_id() );
		pstmt.setString(2, applicant.getFirst_name());
		pstmt.setString(3, applicant.getLast_name());
		pstmt.setString(4, applicant.getEmail());
		pstmt.setString(5, applicant.getPhone());
		pstmt.setString(6, applicant.getResume());
		

		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		
		return status;
	}

	@Override
	public int applyForJob(int jobID, String coverLetter) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect(); 
        String sql = "INSERT INTO jobapplicationclass (int application_id, String application_date, String cover_letter, int job_id,\r\n"
        		+ "			int applicant_id ) "
                   + "VALUES (application_id,application_date,?,?,applicant_id)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setString(1, coverLetter); 
        pstmt.setInt(2, jobID); 

        
        int status = pstmt.executeUpdate(); 
        DBConnection.dbClose(); //
        
        return status;
	}

	@Override
	public List<Applicant> getApplicants() throws SQLException, InvalidEmailFormatHandling {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select * from applicant ";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		
		ResultSet rst=pstmt.executeQuery();
		List<Applicant> list=new ArrayList<>();
		
		while(rst.next()==true) {
			int id=rst.getInt("applicant_id");
			String first_name = rst.getString("first_name");
			String last_name= rst.getString("last_name");
			String email=rst.getString("email");
			String phone=rst.getString("phone");
			String resume=rst.getString("resume");
			Applicant applicant = new Applicant(id,first_name,last_name,email,phone,resume);
			list.add(applicant);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public List<JobApplicationClass> getApplicationsFOrJob() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DBConnection.dbConnect();
		String sql="select jac.*\r\n"
				+ "from jobapplicationclass jac join "
				+ "joblisting j on jac.job_id=j.job_id ;";
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		ResultSet rst=pstmt.executeQuery();
		List<JobApplicationClass> list=new ArrayList<>();
		while(rst.next()==true) {
			int id=rst.getInt("application_id");
			String application_date = rst.getString("application_date");
			String cover_letter= rst.getString("cover_letter");
			int job_id=rst.getInt("job_id");
			int applicant_id=rst.getInt("applicant_id");
			JobApplicationClass jobApplicationClass=new JobApplicationClass(id,application_date,cover_letter,job_id,applicant_id);
			list.add(jobApplicationClass);
		}
		DBConnection.dbClose();
		return list;
	}

	@Override
	public int insertCompany(Company company) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="insert into company (company_id,company_name,location) \r\n"
				+ "values (?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, company.getCompany_id());
		pstmt.setString(2, company.getCompany_name());
		pstmt.setString(3, company.getLocation());
		
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<Company> getCompanies() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="select company_id,company_name,location"
				+ " from company ";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rst=pstmt.executeQuery();
		 
		List<Company> list=new ArrayList<Company>();
		while(rst.next()==true) {
			int company_id=rst.getInt("company_id");
			String company_name=rst.getString("company_name");
			String location=rst.getString("location");
			
			Company company=new Company(company_id,company_name,location);
			list.add(company);
		}
		DBConnection.dbClose();
		return list;
	}

}
