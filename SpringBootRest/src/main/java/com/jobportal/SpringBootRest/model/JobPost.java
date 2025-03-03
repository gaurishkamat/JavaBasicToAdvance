package com.jobportal.SpringBootRest.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Setter
@Getter
@Data
@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;

    public JobPost() {
    }

    public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

}
