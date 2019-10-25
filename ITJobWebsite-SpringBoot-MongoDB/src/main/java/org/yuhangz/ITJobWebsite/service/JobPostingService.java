package org.yuhangz.ITJobWebsite.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuhangz.ITJobWebsite.models.JobPosting;
import org.yuhangz.ITJobWebsite.repository.JobPostingRepository;

@Service
public class JobPostingService {

	@Autowired
    private JobPostingRepository repo;
	
	public Collection<JobPosting> getAllJobPostings(){		
		return repo.findAll();
	} 
	
	public JobPosting createJobPosting(JobPosting jp) {        
		return repo.insert(jp);
	}
			
	public Optional<JobPosting> getJobPostingById(int id) {
	    return repo.findById(id);
	}
	
    public Optional<JobPosting> deleteJobPostingById(int id) {
        Optional<JobPosting> jp = repo.findById(id);
        jp.ifPresent(j -> repo.delete(j));
        return jp;
   }
    
}
