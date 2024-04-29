package com.model;

public class Applicant {
	private int applicant_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String resume;

	public Applicant(int applicant_id, String first_name, String last_name, String email, String phone, String resume) {
		super();
		this.applicant_id = applicant_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.resume = resume;
	}

	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getApplicant_id() {
		return applicant_id;
	}

	public void setApplicant_id(int applicant_id) {
		this.applicant_id = applicant_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Applicant [applicant_id=" + applicant_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone=" + phone + ", resume=" + resume + "]";
	}

}
