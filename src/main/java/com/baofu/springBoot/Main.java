package com.baofu.springBoot;

import com.baofu.springBoot.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-20 ProjectName:springBoot Version:
 */
public class Main {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + " : " + listService.showListCmd());
    }
}