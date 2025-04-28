package com.base.baseapi.module.customer.channel.rest.addcustomer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddCustomerRequestResource {
    @Schema(description = "Name", example = "John Doe")
    String name;
    @Schema(description = "Telephone Number", example = "0825558899")
    String telNumber;
}
