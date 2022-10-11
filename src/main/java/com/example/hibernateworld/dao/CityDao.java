package com.example.hibernateworld.dao;

import com.example.hibernateworld.domain.City;
import com.example.hibernateworld.domain.CityHibernate;

import java.util.List;

public interface CityDao {

    City getCityById(Integer id);

    List<City> getAllCities();
}
