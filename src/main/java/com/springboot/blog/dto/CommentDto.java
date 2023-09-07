package com.springboot.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * @author gelin on 27.11.22
 * @project springboot-blog-rest-api
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
    private Long id;

    @NotEmpty(message = "Comment name should not be null or empty")
    private String name;

    @NotEmpty(message = "Comment email should not be null or empty")
    @Email
    private String email;

    @NotEmpty(message = "Comment body should not be null or empty")
    @Size(min = 10, message = "Comment body should have at least 10 characters")
    private String body;
}
