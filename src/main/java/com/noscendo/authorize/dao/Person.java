package com.noscendo.authorize.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.access.prepost.PreAuthorize;

@Entity
@Getter
@PreAuthorize("denyAll")
@Setter
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
