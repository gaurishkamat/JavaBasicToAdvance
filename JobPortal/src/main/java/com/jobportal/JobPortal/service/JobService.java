package com.jobportal.JobPortal.service;

import com.jobportal.JobPortal.model.JobPost;
import com.jobportal.JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private JobRepo jobRepo;

    public JobRepo getJobRepo() {
        return jobRepo;
    }

    @Autowired
    public void setJobRepo(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public void addJob(JobPost job){
        jobRepo.addJobs(job);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();
    }
}
