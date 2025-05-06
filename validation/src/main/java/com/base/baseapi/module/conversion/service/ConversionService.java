package com.base.baseapi.module.conversion.service;

import com.base.baseapi.module.conversion.data.ConversionDto;
import com.base.baseapi.module.conversion.data.ConversionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversionService {

    @Autowired
    public ConversionService() {
    }

    public String convert(ConversionDto dto) {
        if (dto.getConversionType().equals(ConversionType.LOWERCASE.name())) {
            return dto.getStringToConvert().toLowerCase();
        } else if (dto.getConversionType().equals(ConversionType.UPPERCASE.name())) {
            return dto.getStringToConvert().toUpperCase();
        } else {
            return null;
        }
    }
}
