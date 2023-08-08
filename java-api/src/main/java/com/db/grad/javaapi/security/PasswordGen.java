package com.db.grad.javaapi.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGen {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("ali"));
        System.out.println(encoder.encode("cen"));
        System.out.println(encoder.encode("vinod"));
        System.out.println(encoder.encode("liviu"));
        System.out.println(encoder.encode("admin"));


    }
}
