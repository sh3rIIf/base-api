package com.base.baseapi.common.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.logging.log4j.util.Strings;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EnumerationValidator implements ConstraintValidator<Enumeration, String> {

    private Enumeration enumeration;

    @Override
    public void initialize(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (Strings.isBlank(value)) {
            return enumeration.skipValidationIfEmpty();
        }

        boolean result = false;

        Object[] enumValues = this.enumeration.enumClass().getEnumConstants();

        if (Strings.isBlank(enumeration.method())) {
            if (enumValues != null) {
                for (Object enumValue : enumValues) {
                    if (value.equals(((Enum<?>) enumValue).name())) {
                        result = true;
                        break;
                    }
                }
            }

        } else {
            try {
                return isValid(value, enumValues, enumeration.enumClass().getMethod(enumeration.method()));

            } catch (Exception e) {
                return false;
            }
        }

        return result;
    }

    private static boolean isValid(String value, Object[] enumValues, Method method) throws InvocationTargetException, IllegalAccessException {
        if (enumValues != null) {
            for (Object enumValue : enumValues) {
                if (method.invoke(enumValue).equals(value)) {
                    return true;
                }
            }
        }

        return false;
    }
}
