package com.gucarsoft.resttemplateexample.dto.converter;

import com.gucarsoft.resttemplateexample.dto.PostDto;
import com.gucarsoft.resttemplateexample.model.Post;
import org.springframework.stereotype.Component;

@Component
public class PostDtoConverter {

    public PostDto convert(Post from) {
        return  PostDto
                .builder()
                .userID(from.getUserID())
                .title(from.getTitle())
                .body(from.getBody())
                .build();
    }

}
