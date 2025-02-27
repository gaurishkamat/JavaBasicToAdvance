package com.jobportal.JobPortal.service;

import com.jobportal.JobPortal.model.JobPost;
import com.jobportal.JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost job){
        jobRepo.addJob(job);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }
}
