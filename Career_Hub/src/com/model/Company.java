package com.model;

public class Company {
	private int company_id;
	private String company_name;
	private String location;

	public Company(int company_id, String company_name, String location) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.location = location;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + ", location=" + location + "]";
	}

}
