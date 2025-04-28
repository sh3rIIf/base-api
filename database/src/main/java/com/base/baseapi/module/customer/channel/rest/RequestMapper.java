package com.base.baseapi.module.customer.channel.rest;

import com.base.baseapi.module.customer.channel.rest.addcustomer.AddCustomerRequestMapper;
import com.base.baseapi.module.customer.channel.rest.addcustomer.AddCustomerRequestResource;
import com.base.baseapi.module.customer.data.CustomerDto;

public class RequestMapper implements AddCustomerRequestMapper {

    @Override
    public CustomerDto mapAddCustomerRequest(AddCustomerRequestResource resource) {
        return CustomerDto.builder().name(resource.getName()).telNumber(resource.getTelNumber()).build();
    }
}
