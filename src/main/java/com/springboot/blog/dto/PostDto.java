package com.springboot.blog.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * @author gelin on 26.11.22
 * @project springboot-blog-rest-api
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private Long id;

    @NotEmpty(message = "Post title should not be null or empty")
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    @NotEmpty(message = "Post description should not be null or empty")
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    @NotEmpty(message = "Post content should not be null or empty")
    private String content;

    private Set<CommentDto> comments;

    private Long categoryId;
}
