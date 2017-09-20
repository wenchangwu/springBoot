package com.baofu.springBoot.service.impl;

import com.baofu.springBoot.service.ListService;

/**
 * Description：
 * <p>
 * #
 * </p >
 * User: qingyunzi Date: 17-9-20 ProjectName:springBoot Version:
 */
public class WindowListServiceImpl implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}