package org.yuhangz.ITJobWebsite.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuhangz.ITJobWebsite.models.JobPosting;
import org.yuhangz.ITJobWebsite.repository.JobPostingRepository;

@Service
public class JobPostingService {

	@Autowired
    private JobPostingRepository repo;
	
	public Collection<JobPosting> getJobPostings(){
		
		return repo.findAll();
	} 
}
