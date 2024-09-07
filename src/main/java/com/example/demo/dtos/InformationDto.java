package com.example.demo.dtos;


import com.fasterxml.jackson.annotation.JsonInclude;

public class InformationDto{
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneOrEmail;

    public InformationDto() {

    }

    public InformationDto(Long id, String firstName, String lastName, String phoneOrEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneOrEmail = phoneOrEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }
}
