package com.edu.service.impl;

import com.edu.service.DigitalService;
import com.edu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    private DigitalService digitalService;
    
    @Autowired
    public void setDigitalService(DigitalService digitalService) {
        this.digitalService = digitalService;
    }
    
    public String max(String arg0, String arg1) {
        return digitalService.toInt(arg0) > digitalService.toInt(arg1) ? arg0 : arg1;
    }

    public String min(String arg0, String arg1) {
        return digitalService.toInt(arg0) < digitalService.toInt(arg1) ? arg0 : arg1;
    }
    
    public boolean isNull(String arg) {
        return digitalService.toInt(arg) == 0;
    }

}
