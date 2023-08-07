package com.db.grad.javaapi.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGen {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("nilesh"));
        System.out.println(encoder.encode("mahesh"));
        System.out.println(encoder.encode("suresh"));
        System.out.println(encoder.encode("ramesh"));
        System.out.println(encoder.encode("admin"));


    }
}
