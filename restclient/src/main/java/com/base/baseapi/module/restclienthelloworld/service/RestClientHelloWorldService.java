package com.base.baseapi.module.restclienthelloworld.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestClientHelloWorldService {

    private final RestClient restClient;

    public RestClientHelloWorldService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("http://localhost:8181").build();
    }

    public String sayHello() {
        return this.restClient.get().uri("/basic/helloworld").retrieve().body(String.class);
    }
}
