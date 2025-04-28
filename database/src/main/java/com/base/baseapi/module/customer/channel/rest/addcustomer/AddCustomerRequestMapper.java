package com.base.baseapi.module.customer.channel.rest.addcustomer;

import com.base.baseapi.module.customer.data.CustomerDto;

public interface AddCustomerRequestMapper {
    CustomerDto mapAddCustomerRequest(AddCustomerRequestResource resource);
}
