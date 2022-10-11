package com.example.hibernateworld.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
public abstract class City implements Serializable {
    private Integer id;
    private String name;
    private String countryCode;
    private String district;
    private Integer population;
}
