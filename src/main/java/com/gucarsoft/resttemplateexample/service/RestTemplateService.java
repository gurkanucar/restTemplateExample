package com.gucarsoft.resttemplateexample.service;

import com.gucarsoft.resttemplateexample.dto.PostDto;
import com.gucarsoft.resttemplateexample.dto.converter.PostDtoConverter;
import com.gucarsoft.resttemplateexample.model.Post;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class RestTemplateService {

    @Value("${apiBaseUrl}")
    private String apiBaseUrl;

    private final RestTemplate restTemplate;
    private final PostDtoConverter postDtoConverter;


    public RestTemplateService(RestTemplate restTemplate, PostDtoConverter postDtoConverter) {
        this.restTemplate = restTemplate;
        this.postDtoConverter = postDtoConverter;
    }

    public List<?> getAllPosts() {
        ResponseEntity<List<Post>> result = restTemplate.exchange(
                apiBaseUrl + "/posts",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Post>>() {
                });

        return result
                .getBody()
                .stream()
                .map(postDtoConverter::convert).collect(Collectors.toList());
    }
}
