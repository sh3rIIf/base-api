package com.base.baseapi.module.customer.channel.rest.getcustomer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetCustomerResponseResource {
    @Schema(description = "Unique System ID", example = "1")
    Long id;
    @Schema(description = "Name", example = "John Doe")
    String name;
    @Schema(description = "Telephone Number", example = "0825558899")
    String telNumber;
}
