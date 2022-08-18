package com.edu.service.impl;

import com.edu.service.DigitalService;
import com.edu.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DivOperationService")
public class DivOperationService implements OperationService {

    private DigitalService digitalService;

    @Autowired
    public DivOperationService(DigitalService digitalService) {
        this.digitalService = digitalService;
    }

    public String operation(String arg0, String arg1) {
        return String.valueOf(digitalService.toInt(arg0) % digitalService.toInt(arg1));
    }

}
