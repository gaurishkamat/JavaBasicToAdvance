package com.jobportal.JobPortal;

import com.jobportal.JobPortal.model.JobPost;
import com.jobportal.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(JobPost job){
        service.addJob(job);
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(ModelAndView modelAndView){
        List<JobPost> jobs  = service.getAllJobs();
        modelAndView.addObject("jobPosts", jobs);
        return "viewalljobs";
    }


}
