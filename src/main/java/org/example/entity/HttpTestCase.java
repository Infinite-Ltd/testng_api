package org.example.entity;


import lombok.Data;

@Data
public class HttpTestCase {
    private String name;
    private String description;
    private HttpTestCase[] children;
}
