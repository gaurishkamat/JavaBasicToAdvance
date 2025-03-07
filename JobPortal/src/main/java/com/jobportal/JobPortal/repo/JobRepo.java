package com.jobportal.JobPortal.repo;

import com.jobportal.JobPortal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

}


/*
List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(1, "  Dev", "Let him code", 2, List.of("A", "B")),
        new JobPost(2, "Angular Dev", "Let him also code", 2, List.of("M", "B")),
        new JobPost(3, "Java Dev", "You are doing the backend", 2, List.of("F", "B")),
        new JobPost(4, "C# .Net Dev", "Microsoft jobs", 2, List.of("A", "B", "C")),
        new JobPost(5, "Android Dev", "Develop some apps", 2, List.of("A", "B", "D"))
));

public List<JobPost> getAllJobs(){
    return jobs;
}

public void addJob(JobPost job){
    jobs.add(job);
}
*/