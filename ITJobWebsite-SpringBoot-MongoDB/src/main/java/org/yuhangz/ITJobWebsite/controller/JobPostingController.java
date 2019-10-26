package org.yuhangz.ITJobWebsite.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuhangz.ITJobWebsite.models.JobPosting;
import org.yuhangz.ITJobWebsite.models.JobPostingNoId;
import org.yuhangz.ITJobWebsite.service.JobPostingService;

@RestController
@RequestMapping("/jobPostings")
public class JobPostingController {

	@Autowired
    private JobPostingService jpService;
	
	@GetMapping
	public Collection<JobPosting> getAllJobPostings() {
		return jpService.getAllJobPostings();
	}
	
    @PostMapping
    public JobPosting postBook(@RequestBody JobPosting jp) {
        return jpService.createJobPosting(jp);
    }
    
	@GetMapping("/{id}")
	public Optional<JobPosting> getJobPostingById(@PathVariable("id") int id) {
		return jpService.getJobPostingById(id);
	}
	
	@DeleteMapping("/{id}")
	public Optional<JobPosting> deleteJobPostingById(@PathVariable("id") int id) {
		return jpService.deleteJobPostingById(id);
	}
	

    @PutMapping("/{id}")
    public Optional<JobPosting> updateJobPostingById(@PathVariable("id") int id, 
    												 @RequestBody JobPostingNoId jpNoId) {
        return jpService.updateJobPostingById(id, jpNoId);
    }
}
