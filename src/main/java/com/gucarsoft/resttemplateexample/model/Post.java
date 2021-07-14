package com.gucarsoft.resttemplateexample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {

    private Long id;

    @NotNull
    private Long userID;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String body;

}
