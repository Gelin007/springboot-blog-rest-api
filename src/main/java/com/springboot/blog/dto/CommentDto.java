package com.springboot.blog.dto;

import lombok.Data;

/**
 * @author gelin on 27.11.22
 * @project springboot-blog-rest-api
 */
@Data
public class CommentDto {
    private Long id;
    private String name;
    private String email;
    private String body;
}
