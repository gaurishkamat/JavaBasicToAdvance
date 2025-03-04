package com.jobportal.SpringBootRest.repo;

import com.jobportal.SpringBootRest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "You will be developing Backend", 2, Arrays.asList("Java", "Spring Boot")),
            new JobPost(2, ".Net Developer", "You will be developing Backend", 2, Arrays.asList("C#", ".Net")),
            new JobPost(3, "React JS Developer", "You will be developing Frontend", 2, Arrays.asList("React", "Typescript", "HTML"))
    ));

    public List<JobPost> getJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public JobPost getJob(int postId) {
        for (JobPost job : jobs) {
           if(job.getPostId() == postId){
               return job;
           }
        }
        return  null;
    }

    public JobPost update(JobPost jobPost) {

        for (int i = 0; i < jobs.size(); i++) {
            if(jobs.get(i).getPostId() == jobPost.getPostId()){
                jobs.set(i, jobPost);
            }
        }
        return  null;
    }

    public void delete(int postId) {
        for (int i = 0; i < jobs.size(); i++) {
            if(jobs.get(i).getPostId() == postId){
                jobs.remove(i);
            }
        }
    }
}
