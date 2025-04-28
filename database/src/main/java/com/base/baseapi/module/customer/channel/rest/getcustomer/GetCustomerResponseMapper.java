package com.base.baseapi.module.customer.channel.rest.getcustomer;

import com.base.baseapi.module.customer.data.CustomerDto;

public interface GetCustomerResponseMapper {
    GetCustomerResponseResource mapGetCustomerResponse(CustomerDto dto);
}
