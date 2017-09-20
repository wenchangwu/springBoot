package com.baofu.springBoot.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-20 ProjectName:springBoot Version:
 */
@Configuration
@ComponentScan
public @interface MyConfiguration {
    String[] value() default {};
}