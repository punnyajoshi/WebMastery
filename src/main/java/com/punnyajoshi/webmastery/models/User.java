package com.punnyajoshi.webmastery.models;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User init(){
        Faker dataFaker=new Faker();
        return User.builder()
                .firstName(dataFaker.name().firstName())
                .lastName(dataFaker.name().lastName())
                .email(dataFaker.internet().emailAddress())
                .password("password123")
                .build();
    }

    public User userWithValidCredentials(){
        return User.builder()
                .firstName("Punnya")
                .lastName("Joshi")
                .email("punnyajoshi@gmail.com")
                .password("Password123")
                .build();
    }

    public User userWithInvalidCredentials(){
        return User.builder()
                .firstName("Punnya")
                .lastName("Josi")
                .email("punnyajoshi@gmail.com")
                .password("Password123")
                .build();
    }

    public User userWithEmptyFirstName(){
        User user = this.init();
        user.setFirstName("");
        return user;
    }

}