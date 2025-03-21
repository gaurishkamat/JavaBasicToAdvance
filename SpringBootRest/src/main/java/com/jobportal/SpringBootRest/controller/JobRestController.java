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
    public JobPost addJob(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("jobs")
    public JobPost update(@RequestBody JobPost jobPost){
        jobService.update(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobs/{postId}")
    public List<JobPost> delete(@PathVariable("postId") int postId){
        jobService.delete(postId);
        return jobService.getAllJobs();
    }

    @GetMapping("loadData")
    public String loadData(){
        return jobService.loadData();
    }

    @GetMapping("jobs/keyword/{keyword}")
    public List<JobPost> search(@PathVariable("keyword") String keyword){
        return jobService.search(keyword);
    }

}
