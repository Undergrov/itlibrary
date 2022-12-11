package com.itstep.itlibrary.service.impl;

import com.itstep.itlibrary.service.HelperService;
import org.springframework.stereotype.Component;

@Component
public class HelperServiceImpl implements HelperService {

    public void doHelperJob(String helperTarget) {
        System.out.println("Doing helper job for " + helperTarget);
    }

}
