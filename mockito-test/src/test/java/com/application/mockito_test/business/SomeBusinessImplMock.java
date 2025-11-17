package com.application.mockito_test.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMock {
    @Mock
    private DataService dataService;
    @InjectMocks
    private SomeBusinessImpl business;
    @Test
    void test() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
        int result = business.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}
