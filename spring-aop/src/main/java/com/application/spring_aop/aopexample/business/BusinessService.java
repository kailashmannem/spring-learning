package com.application.spring_aop.aopexample.business;

import com.application.spring_aop.aopexample.data.DataService;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    private DataService dataService;
    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }
    public int calculateMax() {
        int[] data = dataService.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
