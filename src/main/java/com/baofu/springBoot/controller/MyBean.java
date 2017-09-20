package com.baofu.springBoot.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.client.RestTemplate;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-20 ProjectName:springBoot Version:
 */

@Service
@Validated
public class MyBean {

    private final RestTemplate restTemplate;

    public MyBean(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    public String someRestCall(String name) {
        String result = restTemplate.getForObject("http://www.baidu.com", String.class);
        return result;
    }
}