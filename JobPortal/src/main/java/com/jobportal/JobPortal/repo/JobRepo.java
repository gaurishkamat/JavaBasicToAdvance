package com.jobportal.JobPortal.repo;

import com.jobportal.JobPortal.model.JobPost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(102, "React Dev", "Let him code", 2, List.of("A", "B")),
            new JobPost(103, "Angular Dev", "Let him also code", 2, List.of("A", "B"))
    ));

    public List<JobPost> getAllJobs(){
        return jobs;
    }
}
