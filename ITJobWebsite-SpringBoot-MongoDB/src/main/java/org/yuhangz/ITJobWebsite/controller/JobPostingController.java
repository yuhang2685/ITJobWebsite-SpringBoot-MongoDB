package org.yuhangz.ITJobWebsite.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuhangz.ITJobWebsite.models.JobPosting;
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
}
