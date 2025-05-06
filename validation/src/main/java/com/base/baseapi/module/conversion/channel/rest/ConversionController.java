package com.base.baseapi.module.conversion.channel.rest;

import com.base.baseapi.module.conversion.channel.rest.convert.ConversionRequestResource;
import com.base.baseapi.module.conversion.service.ConversionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/validation")
public class ConversionController {

    private RequestMapper requestMapper;
    private ConversionService conversionService;

    @Autowired
    public ConversionController(ConversionService conversionService) {
        this.requestMapper = new RequestMapper();
        this.conversionService = conversionService;
    }

    @Operation(summary = "Request Validation example", description = "Example that validates a request object. This endpoint will take a string and convert all chars to either upper or lower case.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success")
    })
    @PostMapping(
            value = "/convert",
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<String> convert(@Valid @RequestBody ConversionRequestResource resource) {
        return ResponseEntity.ok(conversionService.convert(requestMapper.mapConversionRequest(resource)));
    }
}
