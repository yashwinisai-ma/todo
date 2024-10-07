package com.mvit.placementservice;
import jakarta.persistence.*;

@Entity
public class Placement {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String companyName;
	    private String jobTitle;
	    private Double salaryPackage;
	    
	    // getters and setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public Double getSalaryPackage() {
			return salaryPackage;
		}
		public void setSalaryPackage(Double salaryPackage) {
			this.salaryPackage = salaryPackage;
		}
		
		public Placement() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Placement(Long id, String companyName, String jobTitle, Double salaryPackage) {
			super();
			this.id = id;
			this.companyName = companyName;
			this.jobTitle = jobTitle;
			this.salaryPackage = salaryPackage;
		}

	    
	    

}
