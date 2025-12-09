package com.application.restful_web_services.Filtering;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public MappingJacksonValue retrieveSomeBean() {        
        someBean sm = new someBean("value1", "value2", "value3"); 
        MappingJacksonValue mapping = new MappingJacksonValue(sm);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
        FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
        mapping.setFilters(filters);
        return mapping;
    }
    @GetMapping("/filtering-v2")
    public someBean retrieveSomeBeanV2() {        
        return new someBean("value1", "value2", "value3");
    }
    @GetMapping("/filtering-list")
    public List<someBean> retrieveListOfSomeBeans() {
        return Arrays.asList(
            new someBean("value1", "value2", "value3"),
            new someBean("value4", "value5", "value6")
        );
    }
}
