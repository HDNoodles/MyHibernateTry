package com.example.hibernateworld.dao;

import com.example.hibernateworld.domain.City;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository("cityDao")
public class CityDao extends AbstractHibernateDao<City>{

    public CityDao() {
        setClazz(City.class);
    }

    public City getCityById(Integer id) {
        return findById(id);
    }

    public List<City> getAllCities() {
        List<City> list = this.getAll();
        return list.stream().collect(Collectors.toList());
    }
}