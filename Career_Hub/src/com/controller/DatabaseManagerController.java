package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.exceptions.InvalidEmailFormatHandling;
import com.exceptions.InvalidSalaryFormatHandling;
import com.model.Applicant;
import com.model.Company;
import com.model.JobApplicationClass;
import com.model.JobListing;
import com.service.DatabaseManagerService;

public class DatabaseManagerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseManagerService databaseManagerService = new DatabaseManagerService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("*******************************************************************");
			System.out.println("*************************Database Manager Operations***************");
			System.out.println("*******************************************************************");
			System.out.println();
			System.out.println("Press 1. Post Job ");
			System.out.println("Press 2. Show All Job Listings");
			System.out.println("Press 3. Create Applicant Profile");
			System.out.println("Press 4. Apply For Job");
			System.out.println("Press 5. Show All Applicants");
			System.out.println("Press 6. Retrieve Job Application for Job Listings");
			System.out.println("Press 7. Insert in company");
			System.out.println("Press 8. Retrieve a list of companies");
			System.out.println("Press 0. To Exit");
			int input=sc.nextInt();
			if(input==0) {
				System.out.println("Exiting Database Manager Module ...");
				break;
			}
			Random random = new Random();
			int randomNumber = random.nextInt();
			int id = randomNumber<0 ? randomNumber*-1:randomNumber;
//			System.out.println(id);
					
			switch(input) {
			case 1:
				System.out.println("Enter Job Title : ");
				sc.nextLine();
				String job_title=sc.nextLine();
				
				System.out.println("Enter Job Description : ");
				String job_description=sc.nextLine();
				
				System.out.println("Enter Job Location : ");
				String job_location=sc.nextLine();
				
				System.out.println("Enter Salary : ");
				Double salary=sc.nextDouble();
				
				System.out.println("Enter PostedDate (yyyy-mm-dd) : ");
				sc.nextLine();
				String posted_date=sc.nextLine();
				
				System.out.println("Enter Company_company_id: ");
				int Company_company_id=sc.nextInt();
				
				JobListing jobListing = new JobListing(id,job_title,job_description,job_location,salary,"",posted_date,Company_company_id);
				try {
					int status = databaseManagerService.save(jobListing);
					if(status==1) {
						System.out.println("Insert Added to DB...");
					}else {
						System.out.println("Insertion Failed...");
					}
				} catch (SQLException | InvalidSalaryFormatHandling e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					List<JobListing> list=databaseManagerService.getJobListings();
					for(JobListing j:list) {
						System.out.println(j);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				Random randomA = new Random();
				int randomNumberA = random.nextInt();
				int idApplicant = randomNumberA<0 ? randomNumberA*-1:randomNumberA;
//				System.out.println(idApplicant);
				
				System.out.println("Enter First Name : ");
				sc.nextLine();
				String first_name=sc.nextLine();
				
				System.out.println("Enter Last Name : ");
				String last_name=sc.nextLine();
				
				System.out.println("Enter Email : ");
				String email=sc.nextLine();
				
				System.out.println("Enter Phone Number : ");
				String phone=sc.nextLine();
				
				System.out.println("Provide Resume : ");
				String resume=sc.nextLine();
				
			    Applicant applicant=new Applicant(idApplicant,first_name,last_name,email,phone,resume);
			    try {
					int status = databaseManagerService.createProfile(applicant);
					if(status==1) {
						System.out.println("Profile Added to DB...");
					}else {
						System.out.println("Insertion Failed...");
					}
				} catch (SQLException | InvalidEmailFormatHandling e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter job id : ");
				int job_id=sc.nextInt();
				
				System.out.println("Provide Cover Letter : ");
				String cover_letter=sc.nextLine();
				int application_id=5;
				int applicant_id=5;
				JobApplicationClass jobApplicationClass = new JobApplicationClass(application_id,"",cover_letter,job_id,applicant_id);
				 try {
						int status = databaseManagerService.applyForJob(jobApplicationClass);
						if(status==1) {
							System.out.println("Applied For Job...");
						}else {
							System.out.println("Insertion Failed...");
						}
				 } catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
			case 5:
				try {
					List<Applicant> list=databaseManagerService.getApplicants();
					for(Applicant j:list) {
						System.out.println(j);
					}
				} catch (SQLException | InvalidEmailFormatHandling e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					List<JobApplicationClass> list=databaseManagerService.getApplicationsFOrJob();
					for(JobApplicationClass s:list) {
						System.out.println(s);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				Random randomB = new Random();
				int randomNumberB = random.nextInt();
				int idcompany = randomNumberB<0 ? randomNumberB*-1:randomNumberB;
				System.out.println(idcompany);
				
				System.out.println("Enter company name:");
				sc.nextLine();
				String company_name=sc.nextLine();
				
				System.out.println("Enter location : ");
				String location=sc.nextLine();
				
				Company company=new Company(idcompany,company_name,location);
				try {
					int status = databaseManagerService.insertCompany(company);
					if(status==1) {
						System.out.println("Insert Added to DB...");
					}else {
						System.out.println("Insertion Failed...");
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:
				try {
					List<Company> list = databaseManagerService.getCompanies();
					for(Company c:list) {
						System.out.println(c);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			
			
		}
		
		sc.close();
		
	}

}
