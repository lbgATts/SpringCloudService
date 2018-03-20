package com.test.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

//falback 服务降级后的处理方式，比如timeout,等
@FeignClient(value = "billing-service", fallback = BillingServiceImpl.class)
public interface BillingService {

    //这个注解表示的是当请求getProformaId方法的时候，会去调用类似 /feign-service/test 这样的一个服务
    @RequestMapping(method= RequestMethod.GET, value="/test")
    UUID getProformaId();


    /**
     * FeignClient 调用的服务有可能是分布在不同的示例上，就导致 在 a/b -->Client--->c/d
     */
}