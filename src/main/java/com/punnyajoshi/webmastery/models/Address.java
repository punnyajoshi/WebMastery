package com.punnyajoshi.webmastery.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String name;
    private String streetName;
    private String district;
    private String city;
    private String state;
    private String country;
    private int pincode;
}
