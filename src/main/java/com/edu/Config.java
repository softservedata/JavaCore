package com.edu;

import com.edu.service.ConvertServise;
import com.edu.service.impl.ConvertServiseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.edu.service")
public class Config {
    
    @Bean//(name = "convertServise")
    public ConvertServise createConvertServise() {
        return ConvertServiseImpl.getConvertServise();
    }
}