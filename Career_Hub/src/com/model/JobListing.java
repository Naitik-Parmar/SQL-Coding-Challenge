package com.model;

public class JobListing {
	private int job_id;
	private String job_title;
	private String job_description;
	private String job_location;
	private double salary;
	private String job_type;
	private String posted_date;
	private int Company_company_id;

	public JobListing(int job_id, String job_title, String job_description, String job_location, double salary,
			String job_type, String posted_date, int company_company_id) {
		super();
		this.job_id = job_id;
		this.job_title = job_title;
		this.job_description = job_description;
		this.job_location = job_location;
		this.salary = salary;
		this.job_type = job_type;
		this.posted_date = posted_date;
		Company_company_id = company_company_id;
	}

	public JobListing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_description() {
		return job_description;
	}

	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}

	public String getJob_location() {
		return job_location;
	}

	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJob_type() {
		return job_type;
	}

	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}

	public String getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(String posted_date) {
		this.posted_date = posted_date;
	}

	public int getCompany_company_id() {
		return Company_company_id;
	}

	public void setCompany_company_id(int company_company_id) {
		Company_company_id = company_company_id;
	}

	@Override
	public String toString() {
		return "JobListing [job_id=" + job_id + ", job_title=" + job_title + ", job_description=" + job_description
				+ ", job_location=" + job_location + ", salary=" + salary + ", job_type=" + job_type + ", posted_date="
				+ posted_date + ", Company_company_id=" + Company_company_id + "]";
	}

}
