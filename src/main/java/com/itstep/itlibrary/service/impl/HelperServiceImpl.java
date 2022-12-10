package org.example.service.impl;

import org.example.service.HelperService;

public class HelperServiceImpl implements HelperService {

    public void doHelperJob(String helperTarget) {
        System.out.println("Doing helper job for " + helperTarget);
    }

}
