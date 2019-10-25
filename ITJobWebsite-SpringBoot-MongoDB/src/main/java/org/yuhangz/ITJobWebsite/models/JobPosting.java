package org.yuhangz.ITJobWebsite.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPosting")
public class JobPosting {

	@Id
	private Integer id;
	private String title;
	private String employmentType;
	private String companyProfile;
	private String hiringOrganization;
	private String industry;
	private String jobLocation;
	private String datePosted;
	
	private String jobDescribtions;
	private String[] responsibilities;
	private String[] qualifications;
	private String[] skills;
	private String[] niceToHave;
	private String salary;
	private String[] jobBenefits;
	private String workHours;
	private String url;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getCompanyProfile() {
		return companyProfile;
	}
	public void setCompanyProfile(String companyProfile) {
		this.companyProfile = companyProfile;
	}
	public String getHiringOrganization() {
		return hiringOrganization;
	}
	public void setHiringOrganization(String hiringOrganization) {
		this.hiringOrganization = hiringOrganization;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}
	public String getJobDescribtions() {
		return jobDescribtions;
	}
	public void setJobDescribtions(String jobDescribtions) {
		this.jobDescribtions = jobDescribtions;
	}
	public String[] getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String[] responsibilities) {
		this.responsibilities = responsibilities;
	}
	public String[] getQualifications() {
		return qualifications;
	}
	public void setQualifications(String[] qualifications) {
		this.qualifications = qualifications;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String[] getNiceToHave() {
		return niceToHave;
	}
	public void setNiceToHave(String[] niceToHave) {
		this.niceToHave = niceToHave;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String[] getJobBenefits() {
		return jobBenefits;
	}
	public void setJobBenefits(String[] jobBenefits) {
		this.jobBenefits = jobBenefits;
	}
	public String getWorkHours() {
		return workHours;
	}
	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
