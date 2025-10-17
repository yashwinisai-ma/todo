package com.mvit.placementservice;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Placement {

    @Id
    private Long id;

    private String companyName;
    private String jobTitle;
    private Double salaryPackage;

    // New fields
    private String location;
    private LocalDate driveDate;
    private String jobDescription;
    private String workType; // "Onsite", "Remote", "Hybrid"

    // Getters and setters for new fields
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDriveDate() {
        return driveDate;
    }

    public void setDriveDate(LocalDate driveDate) {
        this.driveDate = driveDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    // Existing fields' getters and setters
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

    // Constructors
    public Placement() {
        super();
    }

    public Placement(Long id, String companyName, String jobTitle, Double salaryPackage, String location, LocalDate driveDate, String jobDescription, String workType) {
        super();
        this.id = id;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salaryPackage = salaryPackage;
        this.location = location;
        this.driveDate = driveDate;
        this.jobDescription = jobDescription;
        this.workType = workType;
    }
}
