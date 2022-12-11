package com.itstep.itlibrary.service.impl;

import com.itstep.itlibrary.service.HelperService;
import com.itstep.itlibrary.service.MainService;
import com.itstep.itlibrary.service.SecondaryService;
import org.springframework.stereotype.Component;

@Component
public class MainServiceImpl implements MainService {
    private final SecondaryService secondaryService;
    private final HelperService helperService;

    public MainServiceImpl(SecondaryService secondaryService, HelperService helperService) {
        this.secondaryService = secondaryService;
        this.helperService = helperService;
    }

    public void doMainJob() {
        System.out.println("Doing main job");
    }

    public void doSecondaryJob() {
        secondaryService.doSecondaryJob();
    }

    public void doHelperJob() {
        helperService.doHelperJob("Main");
    }
}
