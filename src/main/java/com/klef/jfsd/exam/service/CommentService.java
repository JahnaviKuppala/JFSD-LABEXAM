package com.klef.jfsd.exam.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {

    private final RestTemplate restTemplate;

    public CommentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Object> getAllComments() {
        String apiUrl = "https://jsonplaceholder.typicode.com/comments";
        Object[] comments = restTemplate.getForObject(apiUrl, Object[].class);
        return Arrays.asList(comments);
    }
}
