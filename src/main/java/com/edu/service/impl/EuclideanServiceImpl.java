package com.edu.service.impl;

import com.edu.service.ConvertServise;
import com.edu.service.EuclideanService;
import com.edu.service.OperationService;
import com.edu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("EuclideanService")
public class EuclideanServiceImpl implements EuclideanService {

    private OperationService operationService;
    private ConvertServise convertServise;
    private OrderService orderService;

    @Autowired
    public EuclideanServiceImpl(
            @Qualifier("ResOperationService")
            //@Qualifier("SubOperationService")
            OperationService operationService) {
        this.operationService = operationService;
    }

    @Autowired
    public void setConvertServise(ConvertServise convertServise) {
        this.convertServise = convertServise;
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
    
    public String calculateGCD(String arg0, String arg1) {
        String max = orderService.max(convertServise.validateDigits(arg0), convertServise.validateDigits(arg1));
        String min = orderService.min(convertServise.validateDigits(arg0), convertServise.validateDigits(arg1));
        while (!orderService.isNull(min)) {
            String temp = operationService.operation(max, min);
            max = orderService.max(min, temp);
            min = orderService.min(min, temp);
        }
        return max;
    }

}
