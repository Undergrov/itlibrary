package org.example.service.impl;

import org.example.service.HelperService;
import org.example.service.SecondaryService;

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
