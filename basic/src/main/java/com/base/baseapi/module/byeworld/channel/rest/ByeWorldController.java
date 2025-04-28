package com.base.baseapi.module.byeworld.channel.rest;

import com.base.baseapi.module.byeworld.service.ByeWorldService;
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
@RequestMapping(value = "/byeworld")
public class ByeWorldController {

    private ByeWorldService byeWorldService;

    @Autowired
    public ByeWorldController(ByeWorldService byeWorldService) {
        this.byeWorldService = byeWorldService;
    }

    @Operation(summary = "Bye World example", description = "Basic bye world example, no extras like databases or caching, as basic as it gets")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success")
    })
    @GetMapping(
            value = "/saybye",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<String> sayBye() {
        return ResponseEntity.ok(byeWorldService.sayBye());
    }
}
