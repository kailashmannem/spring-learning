package com.application.restful_web_services.versioning;

public class PersonV2 {
    private String firstName, lastName;
    public PersonV2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return "PersonV2{firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}
