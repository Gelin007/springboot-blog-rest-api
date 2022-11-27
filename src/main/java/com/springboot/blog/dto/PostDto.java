package com.springboot.blog.dto;

import lombok.Data;

import java.util.Set;

/**
 * @author gelin on 26.11.22
 * @project springboot-blog-rest-api
 */
@Data
public class PostDto {
    private Long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;
}
