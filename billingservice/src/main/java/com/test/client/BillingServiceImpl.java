package com.test.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Component
public class BillingServiceImpl implements BillingService {

    public UUID getProformaId(){
        return UUID.randomUUID();
    }
}