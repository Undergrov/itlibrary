package com.itstep.itlibrary.service.impl;

import com.itstep.itlibrary.service.HelperService;
import com.itstep.itlibrary.service.SecondaryService;
import org.springframework.stereotype.Component;

@Component
public class SecondaryServiceImpl implements SecondaryService {
    private final HelperService helperService;

    public SecondaryServiceImpl(HelperService helperService) {
        this.helperService = helperService;
    }

    public void doSecondaryJob() {
        System.out.println("Doing secondary job");
    }

    public void doHelperJob() {
        helperService.doHelperJob("Secondary");
    }
}
