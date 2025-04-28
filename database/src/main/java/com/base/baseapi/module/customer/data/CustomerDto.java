package com.base.baseapi.module.customer.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    Long id;
    String name;
    String telNumber;
}
