package com.quan.controller;

import com.quan.entity.CommonResult;
import com.quan.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    public static  final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVIE";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/quan")
    public CommonResult<Payment> getPayment(@RequestBody Payment payment){
        return  restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

}
