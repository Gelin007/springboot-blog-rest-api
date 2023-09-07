package com.springboot.blog.dto;

import lombok.Getter;

import java.util.Date;

/**
 * @author gelin on 30.11.22
 * @project springboot-blog-rest-api
 */
@Getter
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
