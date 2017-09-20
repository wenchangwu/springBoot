package com.baofu.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-20 ProjectName:springBoot Version:
 */

@RestController
public class MyRestController {

    @RequestMapping("/test")
    public String test()  {
        int i=1/0;
        return "hello spring boot";
    }
}