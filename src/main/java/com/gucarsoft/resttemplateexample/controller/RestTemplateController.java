package com.gucarsoft.resttemplateexample.controller;

import com.gucarsoft.resttemplateexample.dto.PostDto;
import com.gucarsoft.resttemplateexample.service.RestTemplateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/restTemplate")
public class RestTemplateController {

    private final RestTemplateService restTemplateService;

    public RestTemplateController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping
    public ResponseEntity<List<?>> getAllPosts() {
        return ResponseEntity.ok(restTemplateService.getAllPosts());
    }

    /*
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable Long id) {
        return ResponseEntity.ok(restTemplateService.getPostById(id));
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<PostDto>> getPostBySearch(@PathVariable String search) {
        return ResponseEntity.ok(restTemplateService.getPostBySearch(search));
    }

    @PostMapping
    public ResponseEntity<List<PostDto>> createPost(@Valid @RequestBody PostDto post) {
        return ResponseEntity.ok(restTemplateService.create(post));
    }
*/

}
