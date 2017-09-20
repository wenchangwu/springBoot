package com.baofu.springBoot;

import com.baofu.springBoot.condition.LinuxCondition;
import com.baofu.springBoot.condition.WindowsCondition;
import com.baofu.springBoot.service.ListService;
import com.baofu.springBoot.service.impl.LinuxListServiceImpl;
import com.baofu.springBoot.service.impl.WindowListServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-20 ProjectName:springBoot Version:
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowListServiceImpl();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxListService() {
        return new LinuxListServiceImpl();
    }

}