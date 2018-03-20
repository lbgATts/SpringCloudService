package com.test.controller;

import com.test.client.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class BillingController {

    @Autowired
    private BillingService billingService;

    @RequestMapping("/test")
    public UUID getProformaId() {
        return billingService.getProformaId();
    }
}