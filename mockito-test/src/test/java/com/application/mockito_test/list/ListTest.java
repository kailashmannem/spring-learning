package com.application.mockito_test.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {
    @Test
    void test() {
        List list = mock(List.class);
        when(list.size()).thenReturn(5);
        assertEquals(5, list.size());
    }
    @Test
    void test_multipleReturnValues() {
        List list = mock(List.class);
        when(list.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, list.size());
        assertEquals(10, list.size());
    }

    @Test
    void test_parameterizedReturnValues() {
        List list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenReturn("Hello");
        assertEquals("Hello", list.get(0));
        assertEquals(null, list.get(1));
    }
}
