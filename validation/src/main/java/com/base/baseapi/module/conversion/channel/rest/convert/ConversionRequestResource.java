package com.base.baseapi.module.conversion.channel.rest.convert;

import com.base.baseapi.common.validation.Enumeration;
import com.base.baseapi.module.conversion.data.ConversionType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConversionRequestResource {
    @Schema(description = "String To Convert", example = "convert this string to all uppercase")
    @NotBlank(message = "cannot be blank")
    String stringToConvert;
    @Schema(description = "Conversion Type", example = "UPPERCASE")
    @Enumeration(message = "Invalid conversion type", enumClass = ConversionType.class)
    String conversionType;
}
