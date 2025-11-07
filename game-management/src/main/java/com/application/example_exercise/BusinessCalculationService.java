package com.application.example_exercise;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
    private DataService dataSerive;
    public BusinessCalculationService(@Qualifier("MySQLDataService") DataService dataService) {
        super();
        this.dataSerive = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataSerive.retrieveData()).max().orElse(0);
    }
}
