package com.jobportal.SpringBootRest.controller;

import com.jobportal.SpringBootRest.model.JobPost;
import com.jobportal.SpringBootRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobs")
    public List<JobPost> getJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("jobs/{postId}")
    public JobPost getJobs(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobs")
    public void addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }


}
