package com.itstep.itlibrary.util;

import com.itstep.itlibrary.service.MainService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Initializer {
    private  final MainService mainService;
    public Initializer(MainService mainService){
        this.mainService = mainService;
    }

    @PostConstruct
    public void init(){
        System.out.println ( "Hello Spring" );
        mainService.doMainJob ();
        mainService.doSecondaryJob ();
        mainService.doHelperJob ();
    }
}
