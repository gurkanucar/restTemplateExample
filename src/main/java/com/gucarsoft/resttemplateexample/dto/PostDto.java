package com.gucarsoft.resttemplateexample.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PostDto {

    @NotNull
    private Long userID;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String body;

}
