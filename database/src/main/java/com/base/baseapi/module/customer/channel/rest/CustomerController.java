package com.base.baseapi.module.customer.channel.rest;

import com.base.baseapi.module.customer.channel.rest.addcustomer.AddCustomerRequestResource;
import com.base.baseapi.module.customer.channel.rest.addcustomer.AddCustomerResponseResource;
import com.base.baseapi.module.customer.channel.rest.getcustomer.GetCustomerResponseResource;
import com.base.baseapi.module.customer.data.CustomerDto;
import com.base.baseapi.module.customer.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/database/customer")
public class CustomerController {

    private RequestMapper requestMapper;
    private ResponseMapper responseMapper;
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.requestMapper = new RequestMapper();
        this.responseMapper = new ResponseMapper();
        this.customerService = customerService;
    }

    @Operation(summary = "Database example", description = "Database example: add customer to database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success")
    })
    @PostMapping(
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<AddCustomerResponseResource> addCustomer(@RequestBody AddCustomerRequestResource resource) {
        return ResponseEntity.ok(responseMapper.mapAddCustomerResponse(customerService.addCustomer(requestMapper.mapAddCustomerRequest(resource))));
    }

    @Operation(summary = "Database example", description = "Database example: get customer from database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success")
    })
    @GetMapping(
            value = "/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<GetCustomerResponseResource> getCustomer(@PathVariable Long id) {
        return ResponseEntity.ok(responseMapper.mapGetCustomerResponse(customerService.getCustomer(CustomerDto.builder().id(id).build())));
    }
}
