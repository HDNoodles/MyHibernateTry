package com.example.hibernateworld.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class City{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "Id")
    private Integer id;

//    @Column(name = "Name")
    private String name;

//    @Column(name = "CountryCode")
    private String countryCode;

//    @Column(name = "District")
    private String district;

//    @Column(name = "Population")
    private Integer population;
}
