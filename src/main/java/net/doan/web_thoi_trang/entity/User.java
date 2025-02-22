package net.doan.web_thoi_trang.entity;

import jakarta.persistence.Entity;

import java.time.Instant;

@Entity
public class User {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Byte gender;
    private Instant dateOfBirth;
    private String address;
    private String email;
    private String phone;
    
}
