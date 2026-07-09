package com.cognizant.getcountrybycode;

/**
 * Country Model Class
 */
public class Country {

    private String code;
    private String name;

    // Default Constructor
    public Country() {
    }

    // Getter for Code
    public String getCode() {
        return code;
    }

    // Setter for Code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}