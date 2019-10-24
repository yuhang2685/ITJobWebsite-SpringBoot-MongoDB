package org.yuhangz.ITJobWebsite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobPostings")
public class JobPostingController {

	@GetMapping
	public String getJobPostings() {
		return "Hello World!";
	}
}
