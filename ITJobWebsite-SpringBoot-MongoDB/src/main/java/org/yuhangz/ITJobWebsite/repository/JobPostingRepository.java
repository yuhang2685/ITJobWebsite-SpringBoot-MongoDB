package org.yuhangz.ITJobWebsite.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.yuhangz.ITJobWebsite.models.JobPosting;

public interface JobPostingRepository extends MongoRepository<JobPosting, Integer> {

}
