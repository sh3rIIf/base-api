package com.base.baseapi.module.helloworld.channel.rest;

import com.base.baseapi.module.helloworld.service.HelloWorldService;
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
@RequestMapping(value = "/helloworld")
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Operation(summary = "Hello World example", description = "Basic hello world example, no extras like databases or caching, as basic as it gets")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success")
    })
    @GetMapping(
            value = "/sayhello",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok(helloWorldService.sayHello());
    }
}
