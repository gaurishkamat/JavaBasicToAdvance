package com.jobportal.JobPortal.service;

import com.jobportal.JobPortal.model.JobPost;
import com.jobportal.JobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "  Dev", "Let him code", 2, List.of("A", "B")),
            new JobPost(2, "Angular Dev", "Let him also code", 2, List.of("M", "B")),
            new JobPost(3, "Java Dev", "You are doing the backend", 2, List.of("F", "B")),
            new JobPost(4, "C# .Net Dev", "Microsoft jobs", 2, List.of("A", "B", "C")),
            new JobPost(5, "Android Dev", "Develop some apps", 2, List.of("A", "B", "D"))
    ));

    @Autowired
    private JobRepo jobRepo;

    public void addJob(JobPost job){
        jobRepo.save(job);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public JobPost getJob(int postId){
        return jobRepo.findById(postId).orElse(null);
    }

    public void update(JobPost jobPost){
        jobRepo.save(jobPost);
    }

    public void delete(Integer postId){
        jobRepo.deleteById(postId);
    }
}

