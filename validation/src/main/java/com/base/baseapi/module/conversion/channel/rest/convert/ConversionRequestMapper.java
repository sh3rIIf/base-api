package com.base.baseapi.module.conversion.channel.rest.convert;

import com.base.baseapi.module.conversion.data.ConversionDto;

public interface ConversionRequestMapper {
    ConversionDto mapConversionRequest(ConversionRequestResource resource);
}
