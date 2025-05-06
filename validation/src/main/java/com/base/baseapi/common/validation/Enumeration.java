package com.base.baseapi.common.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {EnumerationValidator.class})
public @interface Enumeration {

    String var() default "";
    String message() default "Invalid enum";
    Class<?>[] groups() default {};
    Class<? extends Enum<?>> enumClass();
    Class<? extends Payload>[] payload() default {};
    boolean skipValidationIfEmpty() default false;
    String method() default "";
}
