package com.edu.service.impl;

import java.util.regex.Pattern;

import com.edu.service.ConvertServise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ConvertServiseImpl implements ConvertServise {
    private final String NOT_DIGIT = "\\D";
    private final String NOT_DIGITS_EXIST = "([^\\d]+\\d+[^\\d]+)+|(\\d+[^\\d]+)+|([^\\d]+\\d+)+";
    private Pattern patternNotDigitsExist;

    private ConvertServiseImpl() {
        patternNotDigitsExist = Pattern.compile(NOT_DIGITS_EXIST);
    }

    //@Bean
    public static ConvertServiseImpl getConvertServise() {
        return new ConvertServiseImpl();
    }

    public String validateDigits(String text) {
        String result = text;
        if (patternNotDigitsExist.matcher(text).matches()) {
            result = text.replaceAll(NOT_DIGIT, "");
        }
        return result.length() > 0 ? result : "0";
    }
}
