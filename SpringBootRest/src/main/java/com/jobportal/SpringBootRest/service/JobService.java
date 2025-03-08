package com.jobportal.SpringBootRest.service;

import com.jobportal.SpringBootRest.model.JobPost;
import com.jobportal.SpringBootRest.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<JobPost> getAllJobs(){
        return jobRepository.findAll();
    }

    public void addJob(JobPost job){
        jobRepository.save(job);
    }


    public JobPost getJob(int postId) {
        return jobRepository.findById(postId).orElse(new JobPost());
    }

    public JobPost update(JobPost jobPost) {
        return jobRepository.save(jobPost);
    }

    public void delete(int postId) {
        jobRepository.deleteById(postId);
    }

    public String loadData() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "You will be developing Backend", 2, Arrays.asList("Java", "Spring Boot")),
                new JobPost(2, ".Net Developer", "You will be developing Backend", 2, Arrays.asList("C#", ".Net")),
                new JobPost(3, "React JS Developer", "You will be developing Frontend", 2, Arrays.asList("React", "Typescript", "HTML"))
        ));

        jobRepository.saveAll(jobs);
        return "success";
    }

    public List<JobPost> search(String keyword) {
        return jobRepository.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
