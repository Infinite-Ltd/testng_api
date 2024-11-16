package org.example.entity;

import lombok.Data;
import lombok.Setter;

@Data
public class HttpRequest {
    private String url;
    private String method;
    private String body;
    private String headers;
    private HttpRequest nextHttpRequest;
}
