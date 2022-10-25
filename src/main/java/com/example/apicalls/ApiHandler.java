package com.example.apicalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ApiHandler {

    @GetMapping(value = "/users")
    public String get() {

        RestTemplate template = new RestTemplate();
        String users = template.getForObject("https://jsonplaceholder.typicode.com/todos", String.class);

        return users;

    }

}