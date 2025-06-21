package com.jobportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("job-seeker-profile")
public class JobSeekerProfileController {

	@GetMapping("/")
	public String getJobSeekerProfile() {
		return "jobseeker-profile";
		
	}
	
}
