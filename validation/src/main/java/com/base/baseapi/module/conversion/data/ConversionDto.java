package com.base.baseapi.module.conversion.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConversionDto {
    String stringToConvert;
    String conversionType;
}
