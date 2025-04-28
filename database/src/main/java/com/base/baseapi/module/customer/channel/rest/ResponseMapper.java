package com.base.baseapi.module.customer.channel.rest;

import com.base.baseapi.module.customer.channel.rest.addcustomer.AddCustomerResponseMapper;
import com.base.baseapi.module.customer.channel.rest.addcustomer.AddCustomerResponseResource;
import com.base.baseapi.module.customer.channel.rest.getcustomer.GetCustomerResponseMapper;
import com.base.baseapi.module.customer.channel.rest.getcustomer.GetCustomerResponseResource;
import com.base.baseapi.module.customer.data.CustomerDto;

public class ResponseMapper implements GetCustomerResponseMapper, AddCustomerResponseMapper {

    @Override
    public GetCustomerResponseResource mapGetCustomerResponse(CustomerDto dto) {
        return GetCustomerResponseResource.builder().id(dto.getId()).name(dto.getName()).telNumber(dto.getTelNumber()).build();
    }

    @Override
    public AddCustomerResponseResource mapAddCustomerResponse(CustomerDto dto) {
        return AddCustomerResponseResource.builder().id(dto.getId()).name(dto.getName()).telNumber(dto.getTelNumber()).build();
    }
}
