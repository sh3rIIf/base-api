package com.base.baseapi.module.conversion.channel.rest;

import com.base.baseapi.module.conversion.channel.rest.convert.ConversionRequestMapper;
import com.base.baseapi.module.conversion.channel.rest.convert.ConversionRequestResource;
import com.base.baseapi.module.conversion.data.ConversionDto;

public class RequestMapper implements ConversionRequestMapper {
    @Override
    public ConversionDto mapConversionRequest(ConversionRequestResource resource) {
        return ConversionDto.builder().stringToConvert(resource.getStringToConvert()).conversionType(resource.getConversionType()).build();
    }
}
