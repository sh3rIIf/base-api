package com.base.baseapi.module.restclienthelloworld.channel.rest;

import com.base.baseapi.module.restclienthelloworld.service.RestClientHelloWorldService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/restclient/helloworld")
public class RestClientHelloWorldController {

    private RestClientHelloWorldService restClientHelloWorldService;

    @Autowired
    public RestClientHelloWorldController(RestClientHelloWorldService restClientHelloWorldService) {
        this.restClientHelloWorldService = restClientHelloWorldService;
    }

    @Operation(summary = "Rest Client example", description = "Rest client example to call other REST APIs. This example is for inter-service communication in microservice architecture. Calls the basic/helloworld endpoint.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success")
    })
    @GetMapping(
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok(restClientHelloWorldService.sayHello());
    }
}
