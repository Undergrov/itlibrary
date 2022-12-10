package org.example.service.impl;

import org.example.service.HelperService;
import org.example.service.MainService;
import org.example.service.SecondaryService;

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
