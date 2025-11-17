package com.application.mockito_test.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplStub {
    @Test
    void test() {
        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());
        int result = business.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 15, 3};
    }
    
}
