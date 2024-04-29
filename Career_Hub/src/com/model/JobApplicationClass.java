package com.model;

public class JobApplicationClass {
	private int application_id;
	private String application_date;
	private String cover_letter;
	private int job_id;
	private int applicant_id;

	public JobApplicationClass(int application_id, String application_date, String cover_letter, int job_id,
			int applicant_id) {
		super();
		this.application_id = application_id;
		this.application_date = application_date;
		this.cover_letter = cover_letter;
		this.job_id = job_id;
		this.applicant_id = applicant_id;
	}

	public JobApplicationClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	public String getApplication_date() {
		return application_date;
	}

	public void setApplication_date(String application_date) {
		this.application_date = application_date;
	}

	public String getCover_letter() {
		return cover_letter;
	}

	public void setCover_letter(String cover_letter) {
		this.cover_letter = cover_letter;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getApplicant_id() {
		return applicant_id;
	}

	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}

	@Override
	public String toString() {
		return "JobApplicationClass [application_id=" + application_id + ", application_date=" + application_date
				+ ", cover_letter=" + cover_letter + ", job_id=" + job_id + ", applicant_id=" + applicant_id + "]";
	}

}
