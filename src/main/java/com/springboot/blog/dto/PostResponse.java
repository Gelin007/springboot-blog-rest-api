package com.springboot.blog.dto;

import lombok.*;

import java.util.List;

/**
 * @author gelin on 27.11.22
 * @project springboot-blog-rest-api
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private List<PostDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
}
