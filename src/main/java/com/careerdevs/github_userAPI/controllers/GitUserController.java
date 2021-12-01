package com.careerdevs.github_userAPI.controllers;

import com.careerdevs.github_userAPI.models.GitUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class GitUserController {

    @GetMapping("/all") //all users
    public GitUser[] userByID (RestTemplate restTemplate){
        String URL = "https://api.github.com/users";
        return restTemplate.getForObject(URL, GitUser[].class);
    }


    @GetMapping("/{ID}") //get a user by ID
    public Object allUsers (RestTemplate restTemplate, @PathVariable(name = "ID") String id){
        String URL = "https://api.github.com/users/" + id;

        return restTemplate.getForObject(URL, GitUser.class);
    }


}
