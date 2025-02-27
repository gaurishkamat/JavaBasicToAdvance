package com.jobportal.JobPortal.repo;

import com.jobportal.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "React Dev", "Let him code", 2, List.of("A", "B")),
            new JobPost(2, "Angular Dev", "Let him also code", 2, List.of("A", "B")),
            new JobPost(3, "Java Dev", "You are doing the backend", 2, List.of("A", "B"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }
}
