package com.jobportal.SpringBootRest.service;

import com.jobportal.SpringBootRest.model.JobPost;
import com.jobportal.SpringBootRest.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobPost> getAllJobs(){
        return jobRepository.getJobs();
    }

    public void addJob(JobPost job){
        jobRepository.addJob(job);
    }


    public JobPost getJob(int postId) {
        return jobRepository.getJob(postId);
    }

    public JobPost update(JobPost jobPost) {
        return jobRepository.update(jobPost);
    }

    public void delete(int postId) {
        jobRepository.delete(postId);
    }
}
