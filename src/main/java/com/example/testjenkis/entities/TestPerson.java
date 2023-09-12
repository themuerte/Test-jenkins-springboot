package com.example.testjenkis.entities;

import lombok.Data;

@Data
public class TestPerson {
    private String name;
    private String address;
    private String phone;
    private String email;

    public TestPerson(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
}
